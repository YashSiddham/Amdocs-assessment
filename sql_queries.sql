CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department_id INT,
    salary INT
);

CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL
);

INSERT INTO department (department_id, department_name)
VALUES 
    (101, 'Engineering'),
    (102, 'HR'),
    (103, 'Data Analyst');

INSERT INTO employees (employee_id, name, department_id, salary)
VALUES 
    (101, 'John Doe', 101, 3500),
    (102, 'Jane Doe', 101, 4000),
    (103, 'Emily Davis', 102, 4500),
    (104, 'Michael Brown', 102, 5000),
    (105, 'Sarah Brown', 103, 5500),
    (106, 'Audrey Bloom', 103, 6000);


SELECT d.department_name, SUM(e.salary) AS total_salary
FROM department d
LEFT JOIN employees e ON d.department_id = e.department_id
GROUP BY d.department_name;