package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.user.model.User;

public class UserDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/hrms";
	private String jdbcUserName = "root";
	private String jdbcPassword = "Manansh_123";

	private static final String INSERT_USER_SQL = "INSERT INTO employee"
			+ " (employee_id,first_name,last_name,email,phone,address,date_of_birth,gender,hire_date,department_name,job_title,salary) VALUES "
			+ " (?,?,?,?,?,?,?,?,?,?,?,?);";
	private static final String SELECT_USER_BY_ID = "SELECT * FROM employee WHERE employee_id=?;";
	private static final String SELECT_ALL_USERS = "SELECT * FROM employee;";
	private static final String DELETE_USERS_SOL = "DELETE FROM employee WHERE employee_id=?;";
	private static final String UPDATE_USERS_SQL = "UPDATE employee SET employee_id=? ,first_name=? ,last_name=? ,email=? ,phone=? ,address=? ,date_of_birth=? ,gender=? ,hire_date=? ,department_name=? ,job_title=? ,salary=? where employee_id=?;";

	public UserDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
		}

		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

	public void insertUser(User user) {
		UserDAO dao = new UserDAO();

		try (Connection connection = dao.getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL);
			preparedStatement.setLong(1, user.getEmployeeId());
			preparedStatement.setString(2, user.getFirstName());
			preparedStatement.setString(3, user.getLastName());
			preparedStatement.setString(4, user.getEmail());
			preparedStatement.setString(5, user.getLastName());
			preparedStatement.setString(6, user.getAddress());
			preparedStatement.setString(7, user.getDateOfBirth());
			preparedStatement.setString(8, user.getGender());
			preparedStatement.setString(9, user.getHireDate());
			preparedStatement.setString(10, user.getLastName());
			preparedStatement.setString(11, user.getJobTitle());
			preparedStatement.setLong(12, (long) user.getSalary());

			preparedStatement.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User selectUser(int employee_id) {
		User user = new User();
		UserDAO dao = new UserDAO();

		try (Connection connection = dao.getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
			preparedStatement.setInt(1, employee_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				user.setEmployeeId(employee_id);
				user.setFirstName(resultSet.getString("first_name"));
				user.setLastName(resultSet.getString("last_name"));
				user.setEmail(resultSet.getString("email"));
				user.setPhone(resultSet.getString("phone"));
				user.setAddress(resultSet.getString("address"));
				user.setDateOfBirth(resultSet.getString("date_of_birth"));
				user.setGender(resultSet.getString("gender"));
				user.setHireDate(resultSet.getString("hire_date"));
				user.setDepartmentName(resultSet.getString("department_name"));
				user.setJobTitle(resultSet.getString("job_title"));
				user.setSalary(resultSet.getDouble("salary"));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User> selectAllUsers() {
		List<User> users = new ArrayList<User>();
		UserDAO dao = new UserDAO();
		try (Connection connection = dao.getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int employee_id = resultSet.getInt("employee_id");
				String first_name = resultSet.getString("first_name");
				String last_name = resultSet.getString("last_name");
				String email = resultSet.getString("email");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String date_of_birth = resultSet.getString("date_of_birth");
				String gender = resultSet.getString("gender");
				String hire_date = resultSet.getString("hire_date");
				String department_name = resultSet.getString("department_name");
				String job_title = resultSet.getString("job_title");
				Double salary = resultSet.getDouble("salary");

				users.add(new User(employee_id, first_name, last_name, email, phone, address, date_of_birth, gender,
						hire_date, department_name, job_title, salary));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public boolean deleteUser(int employee_id) {
		boolean status = false;
		UserDAO dao = new UserDAO();

		try (Connection connection = dao.getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SOL);
			preparedStatement.setInt(1, employee_id);

			status = preparedStatement.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}