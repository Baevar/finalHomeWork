CREATE SCHEMA `humanfriends`;

USE humanfriends;

CREATE TABLE pets (
ID INT AUTO_INCREMENT PRIMARY KEY,
Name VARCHAR(20) NOT NULL,
Type VARCHAR(20) NOT NULL,
BirthDate DATE NOT NULL,
Commands VARCHAR(100)
);

INSERT pets(Name, Type, BirthDate, Commands) 
VALUES ('Fido', 'Dog', '2020-01-01','Sit,Stay,Fetch'),
	   ('Whiskers', 'Cat', '2019-05-15','Sit, Pounce'),
       ('Hammy', 'Hamster', '2021-03-10','Roll, Hide'),
       ('Buddy', 'Dog', '2018-12-10','Sit, Paw, Bark'),
       ('Smudge', 'Cat', '2020-02-20','Sit, Pounce, Scratch'),
       ('Peanut', 'Hamster', '2021-08-01','Roll, Spin'),
       ('Bella', 'Dog', '2019-11-11','Sit, Stay, Roll'),
       ('Oliver', 'Cat', '2020-06-30','Meow, Scratch, Jump');

SELECT * FROM Pets;
       
CREATE TABLE PackAnimals (
ID INT AUTO_INCREMENT PRIMARY KEY,
Name VARCHAR(20) NOT NULL,
Type VARCHAR(20) NOT NULL,
BirthDate DATE NOT NULL,
Commands VARCHAR(100)
);

INSERT PackAnimals(Name, Type, BirthDate, Commands) 
VALUES ('Thunder', 'Horse', '2015-07-21','Trot, Canter, Gallop'),
	   ('Sandy', 'Camel', '2016-11-03','Walk, Carry Load'),
       ('Eeyore', 'Donkey', '2017-09-18','Walk, Carry Load, Bray'),
       ('Storm', 'Horse', '2014-05-05','Trot, Canter'),
       ('Dune', 'Camel', '2018-12-12','Walk, Sit'),
       ('Burro', 'Donkey', '2019-01-23','Walk, Bray, Kick'),
       ('Blaze', 'Horse', '2016-02-29','Trot, Jump, Gallop'),
       ('Sahara', 'Camel', '2015-08-14','Walk, Run');       

SELECT * FROM PackAnimals;

DELETE FROM PackAnimals 
WHERE Type = 'Camel';

CREATE TABLE HumanFriends AS 
SELECT Name, Type, BirthDate, Commands FROM Pets
UNION ALL
SELECT Name, Type, BirthDate, Commands FROM PackAnimals; 

ALTER TABLE HumanFriends add ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY;

SELECT * FROM HumanFriends;

CREATE TABLE YoungAnimals AS
SELECT ID, Name, Type, BirthDate, Commands,
FLOOR(DATEDIFF(CURDATE(), BirthDate)/30) AS AgeInMonths
FROM HumanFriends
WHERE DATEDIFF(CURDATE(), BirthDate) BETWEEN 365 AND 1095;







