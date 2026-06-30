create table student(
    rollno int primary key ,
    name varchar(20),
    marks int
);

create table logs(
    id INT AUTO_INCREMENT PRIMARY KEY,
    log_date TIMESTAMP NOT NULL,
    details VARCHAR(255) NOT NULL
);