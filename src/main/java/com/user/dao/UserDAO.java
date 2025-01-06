package com.user.dao;

import com.user.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/hrms";  // Change this to your DB URL
    private static final String JDBC_USERNAME = "root";  // Change this to your DB username
    private static final String JDBC_PASSWORD = "password";  // Change this to your DB password

    // Method to create a new user
    public boolean insertUser(User user) {
        String query = "INSERT INTO employee (first_name, last_name, email, phone, address, date_of_birth, gender, hire_date, department_name, job_title, salary) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPhone());
            statement.setString(5, user.getAddress());
            statement.setString(6, user.getDateOfBirth());
            statement.setString(7, user.getGender());
            statement.setString(8, user.getHireDate());
            statement.setString(9, user.getDepartmentName());
            statement.setString(10, user.getJobTitle());
            statement.setDouble(11, user.getSalary());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;  // If a row is affected, the insertion was successful

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to select a user by employee ID
    public User selectUser(int employeeId) {
        User user = null;
        String query = "SELECT * FROM employee WHERE employee_id = ?";

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, employeeId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    user = new User(
                        resultSet.getInt("employee_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getString("address"),
                        resultSet.getString("date_of_birth"),
                        resultSet.getString("gender"),
                        resultSet.getString("hire_date"),
                        resultSet.getString("department_name"),
                        resultSet.getString("job_title"),
                        resultSet.getDouble("salary")
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    // Method to select all users from the employee table
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM employee";

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                User user = new User(
                    resultSet.getInt("employee_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("address"),
                    resultSet.getString("date_of_birth"),
                    resultSet.getString("gender"),
                    resultSet.getString("hire_date"),
                    resultSet.getString("department_name"),
                    resultSet.getString("job_title"),
                    resultSet.getDouble("salary")
                );
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    // Method to update user information
    public boolean updateUser(User user) {
        String query = "UPDATE employee SET first_name = ?, last_name = ?, email = ?, phone = ?, address = ?, date_of_birth = ?, " +
                       "gender = ?, hire_date = ?, department_name = ?, job_title = ?, salary = ? WHERE employee_id = ?";

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPhone());
            statement.setString(5, user.getAddress());
            statement.setString(6, user.getDateOfBirth());
            statement.setString(7, user.getGender());
            statement.setString(8, user.getHireDate());
            statement.setString(9, user.getDepartmentName());
            statement.setString(10, user.getJobTitle());
            statement.setDouble(11, user.getSalary());
            statement.setInt(12, user.getEmployeeId());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;  // If a row is affected, the update was successful

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to delete a user by employee ID
    public boolean deleteUser(int employeeId) {
        String query = "DELETE FROM employee WHERE employee_id = ?";

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, employeeId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;  // If a row is affected, the deletion was successful

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
