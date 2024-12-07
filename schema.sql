CREATE DATABASE hrms;

USE hrms;

CREATE TABLE employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15),
    address VARCHAR(255),
    date_of_birth DATE,
    gender ENUM('Male', 'Female', 'Other'),
    hire_date DATE NOT NULL,
    department_name VARCHAR(50),
    job_title VARCHAR(50),
    salary DECIMAL(10, 2)
);