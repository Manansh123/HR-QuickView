<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.user.model.User" %>
<%@ page import="java.util.List" %> <!-- Import List here -->
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>User List</h1>
    <table>
        <tr>
            <th>Employee ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Actions</th>
        </tr>
        
        <%
            // Retrieve the user list from the request
            List<User> userList = (List<User>) request.getAttribute("userList");

            // Loop through the list of users and display them in the table
            if (userList != null && !userList.isEmpty()) {
                for (User user : userList) {
        %>
        <tr>
            <td><%= user.getEmployeeId() %></td>
            <td><%= user.getFirstName() %></td>
            <td><%= user.getLastName() %></td>
            <td><%= user.getEmail() %></td>
            <td><%= user.getPhone() %></td>
            <td><%= user.getAddress() %></td>
            <td>
                <a href="UserServlet?action=viewUser&employee_id=<%= user.getEmployeeId() %>">View</a> | 
                <a href="UserServlet?action=editUser&employee_id=<%= user.getEmployeeId() %>">Edit</a> | 
                <a href="UserServlet?action=deleteUser&employee_id=<%= user.getEmployeeId() %>">Delete</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="7">No users found.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
