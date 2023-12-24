# Banking Management System

Welcome to the Banking Management System, a Java-based application using Swing and AWT libraries. This system provides a user-friendly interface for managing banking transactions and account details. Before running the project, ensure that you manually add the required libraries, including JCalendar, JUnit, and the MySQL Connector, located in the "lib" folder.

## Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/banking-management-system.git
   ```

2. **Add Libraries to IDE:**
   - Add the JCalendar, JUnit, and MySQL Connector libraries to your IDE from the "lib" folder.

3. **Set Up MySQL Database:**
   - Download and install MySQL (recommended).
   - Execute the SQL script (`projectDatabaseSql.sql`) to create the required databases and tables.
   - In the "Conn" class, update the password to your MySQL Workbench password.

## Features

### Login Page
- Existing customers can log in using their account number and pin code.

### Sign-Up Process
- New customers can sign up by providing personal information in a step-by-step process.
  - Name, address, birthdate, city, region, and ID number.
  - Additional details: religion, category, income, occupation, educational level, senior citizen, and existing account.
  - Final form: account type, selected services, and agreement to company regulations.

### Transaction Page
- After login or sign-up, customers can perform various transactions:
  - Deposit: Initiate the account with an initial deposit.
  - Withdraw: Withdraw money from the account.
  - Pin Change: Change the account's pin code.
  - Fast Cash: Quickly withdraw a pre-defined amount.
  - Balance Query: Check the account balance.

## Setup Database Connection

1. **MySQL Installation:**
   - Download and install MySQL (if not installed).

2. **Execute SQL Script:**
   - Execute the SQL script (`projectDatabaseSql.sql`) to set up the required databases and tables.

3. **Update Connection Password:**
   - Open the "Conn" class and update the password to your MySQL Workbench password.

## How to Run

1. **Run the Application:**
   - Execute the main Java file to launch the Banking Management System.

2. **Login or Sign-Up:**
   - Use existing credentials to log in or follow the sign-up process for new customers.

3. **Perform Transactions:**
   - Explore the transaction page to deposit, withdraw, change pin, perform fast cash, or check the balance.

## Important Note

- Ensure that you have the necessary libraries and have set up the MySQL database before running the project.

Feel free to explore and enhance the functionality of the Banking Management System! If you encounter any issues or have suggestions, please contribute to the project by submitting issues or pull requests. Happy banking!
