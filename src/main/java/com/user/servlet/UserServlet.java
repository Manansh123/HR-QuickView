package com.user.servlet;

import com.user.dao.UserDAO;
import com.user.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private UserDAO userDAO;

    // Initialization of UserDAO
    @Override
    public void init() throws ServletException {
        super.init();
        userDAO = new UserDAO();  // Initialize DAO for database operations
    }

    // Handling GET requests (displaying the user data)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equals("listUsers")) {
            // Fetch the list of users from the database using the DAO
            List<User> userList = userDAO.selectAllUsers(); // Make sure this method returns a List<User>

            // Set the userList as a request attribute
            request.setAttribute("userList", userList);

            // Forward the request to the userList.jsp page
            request.getRequestDispatcher("/userList.jsp").forward(request, response);
        }
    }

    // Handling POST requests (creating/updating users)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("addUser".equals(action)) {
            // Get form data (excluding employee_id because it's auto-generated)
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String dateOfBirth = request.getParameter("date_of_birth");
            String gender = request.getParameter("gender");
            String hireDate = request.getParameter("hire_date");
            String departmentName = request.getParameter("department_name");
            String jobTitle = request.getParameter("job_title");
            double salary = Double.parseDouble(request.getParameter("salary"));
            
            // Create a new User object (use the constructor without employeeId)
            User newUser = new User(firstName, lastName, email, phone, address, dateOfBirth, gender, hireDate, departmentName, jobTitle, salary);
            
            // Insert the new user into the database
            boolean isInserted = userDAO.insertUser(newUser);

            // Redirect to the user list page after insertion
            if (isInserted) {
                response.sendRedirect("UserServlet");
            } else {
                response.getWriter().println("Error adding user.");
            }
        }

        else if ("updateUser".equals(action)) {
            // Get the updated user information from the form
            int employeeId = Integer.parseInt(request.getParameter("employee_id"));
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String dateOfBirth = request.getParameter("date_of_birth");
            String gender = request.getParameter("gender");
            String hireDate = request.getParameter("hire_date");
            String departmentName = request.getParameter("department_name");
            String jobTitle = request.getParameter("job_title");
            double salary = Double.parseDouble(request.getParameter("salary"));

            // Create the User object and set its ID for updating (use the constructor with employeeId)
            User updatedUser = new User(employeeId, firstName, lastName, email, phone, address, dateOfBirth, gender, hireDate, departmentName, jobTitle, salary);
            
            // Update user in the database
            boolean isUpdated = userDAO.updateUser(updatedUser);

            // Redirect based on the success of the update
            if (isUpdated) {
                response.sendRedirect("UserServlet");
            } else {
                response.getWriter().println("Error updating user details.");
            }
        }

    }

    // Clean up resources in the destroy method (if necessary)
    @Override
    public void destroy() {
        super.destroy();
        // You can close resources here if needed (e.g., database connections)
    }
}

