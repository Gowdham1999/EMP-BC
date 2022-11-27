
DROP TABLE IF EXISTS employee;

CREATE TABLE employee(
                       id BIGINT not null,
                       empID VARCHAR(255) not null,
                       empName VARCHAR(255) not null,
                       companyName VARCHAR(255) not null,
                       empEmail VARCHAR(255) not null,
                       primary key (id)
);

INSERT INTO employee(id,empID,empName,companyName,empEmail)
VALUES(10001,'RT-100901','Gowdham S','TCS','gowdhamsg@tcs.com');

INSERT INTO employee(id,empID,empName,companyName,empEmail)
VALUES(10005,'RT-100901','Gowdham S','TCS','gowdhamsg@tcs.com');

INSERT INTO employee(id,empID,empName,companyName,empEmail)
VALUES(10004,'RT-100901','Gowdham S','TCS','gowdhamsg@tcs.com');

INSERT INTO employee(id,empID,empName,companyName,empEmail)
VALUES(10002,'RT-100901','Gowdham S','TCS','gowdhamsg@tcs.com');

INSERT INTO employee(id,empID,empName,companyName,empEmail)
VALUES(10003,'RT-100901','Gowdham S','TCS','gowdhamsg@tcs.com');