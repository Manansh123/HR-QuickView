<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page import="com.user.model.User"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
    <style>
        table {
            width: 60%;
            margin: 50px auto;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        h1 {
            text-align: center;
            color: #4CAF50;
        }
    </style>
</head>
<body>
    <h1>User Details</h1>

    <% 
        // Retrieve the 'user' object from the request
        User user = (User) request.getAttribute("user");
        if (user != null) {
    %>

    <table>
        <tr>
            <th>Employee ID:</th>
            <td><%= user.getEmployeeId() %></td>
        </tr>
        <tr>
            <th>First Name:</th>
            <td><%= user.getFirstName() %></td>
        </tr>
        <tr>
            <th>Last Name:</th>
            <td><%= user.getLastName() %></td>
        </tr>
        <tr>
            <th>Email:</th>
            <td><%= user.getEmail() %></td>
        </tr>
        <tr>
            <th>Phone:</th>
            <td><%= user.getPhone() %></td>
        </tr>
        <tr>
            <th>Address:</th>
            <td><%= user.getAddress() %></td>
        </tr>
        <tr>
            <th>Date of Birth:</th>
            <td><%= user.getDateOfBirth() %></td>
        </tr>
        <tr>
            <th>Gender:</th>
            <td><%= user.getGender() %></td>
        </tr>
        <tr>
            <th>Hire Date:</th>
            <td><%= user.getHireDate() %></td>
        </tr>
        <tr>
            <th>Department Name:</th>
            <td><%= user.getDepartmentName() %></td>
        </tr>
        <tr>
            <th>Job Title:</th>
            <td><%= user.getJobTitle() %></td>
        </tr>
        <tr>
            <th>Salary:</th>
            <td><%= user.getSalary() %></td>
        </tr>
    </table>

    <% } else { %>
        <p>User not found!</p>
    <% } %>
</body>
</html>
