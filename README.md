# Employee Payroll Management System (Java)

## 📌 Project Overview

The **Employee Payroll Management System** is a simple Java-based application designed to manage employee information and calculate salaries for different types of employees.

This project demonstrates core Object-Oriented Programming (OOP) concepts in Java, including **Abstraction, Inheritance, Polymorphism, and Encapsulation**.

The application supports both full-time and part-time employees and provides functionality to add, remove, and display employee records.

## 🚀 Features

- **Add Employee:** Add full-time and part-time employees to the payroll system.
- **Remove Employee:** Remove an employee using their unique employee ID.
- **Display Employees:** Display employee details, including name, ID, and calculated salary.
- **Salary Calculation:** Automatically calculate salaries based on employee type.
- **Dynamic Method Dispatch:** Use method overriding to calculate salaries differently for different employee types.

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList Collection Framework
- Method Overriding

## 📂 Project Structure

```text
EmployeePayrollSystem/
│
├── src/
│   └── Main.java
│
└── README.md
```

## 🧠 OOP Concepts Implemented

### 1. Abstraction
- Created an abstract `Employee` class.
- Defined an abstract method `calculateSalary()`.
- Subclasses provide their own salary calculation implementations.

### 2. Encapsulation
- Employee properties (`name` and `id`) are declared private.
- Getter methods are used to access employee information.

### 3. Inheritance
- `FullTimeEmployee` and `PartTimeEmployee` inherit from the `Employee` class.
- Common employee properties and methods are reused through inheritance.

### 4. Polymorphism
- Both employee classes override the `calculateSalary()` method.
- The appropriate salary calculation is executed based on the actual employee object.

## 💰 Salary Calculation

| Employee Type | Salary Calculation |
|---|---|
| Full-Time Employee | Monthly Salary |
| Part-Time Employee | Hours Worked × Hourly Rate |

**Example:**

- Full-Time Employee: ₹50,000 per month
- Part-Time Employee: 40 hours × ₹100 = ₹4,000

## ▶️ How to Run the Project

### Prerequisites
- Install Java JDK (Java 8 or above).
- Install IntelliJ IDEA or any Java-supported IDE.

### Steps

1. Clone the repository:

```bash
git clone <your-repository-url>
```

2. Navigate to the project directory:

```bash
cd EmployeePayrollSystem
```

3. Compile the Java file:

```bash
javac Main.java
```

4. Run the application:

```bash
java Main
```

## 📸 Sample Output

```text
Display Employee in the company

Employee in the company :: Employee [name=vikas chauhan, id=1, salary=50000.0]
Employee in the company :: Employee [name=Rahul, id=101, salary=4000.0]

Display Employee in the company after removal

Employee in the company :: Employee [name=vikas chauhan, id=1, salary=50000.0]
```

## 🔮 Future Enhancements

- Add employee search functionality.
- Implement employee data storage using a database.
- Add salary deductions, bonuses, and tax calculations.
- Implement a user-friendly interface.
- Add input validation and exception handling.

## 👨‍💻 Author

**Akash Sahastrabuddhe**

Java Developer | Learning Object-Oriented Programming and Backend Development

---

⭐ If you find this project useful, feel free to star the repository!
