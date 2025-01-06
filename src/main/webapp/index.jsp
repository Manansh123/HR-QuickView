<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>HR QuickView</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	background-color: #f4f6f9;
}

.title-bar {
	background-color: #007bff;
	color: white;
	padding: 23px;
	text-align: center;
}

.main-container {
	padding: 30px;
}

.card {
	margin-bottom: 20px;
	transition: transform 0.3s, box-shadow 0.3s;
	box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.1);
}

.card:hover {
	transform: scale(1.05);
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
}

.cardlog {
	margin-bottom: 20px;
	margin-top: 30px;
	transition: transform 0.3s, box-shadow 0.3s;
	box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.1);
	margin-left: 200px;
	margin-right: 200px;
}

.cardlog:hover {
	transform: scale(1.05);
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
}

.card-body {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 10px;
}

.btn-primary {
	background-color: #007bff;
	border: none;
}

.btn-primary:hover {
	background-color: #0056b3;
}

footer {
	text-align: center;
	padding: 10px;
	background-color: #007bff;
	color: white;
	position: relative;
	bottom: 0;
	width: 100%;
}

.container-custom {
	max-width: 1200px;
	margin: 0 auto;
}

.half-left, .half-right {
	padding: 15px;
}

.half-left {
	border-right: 1px solid #ddd;
}

.m{
	margin-bottom: 20px;
	margin-top: 20px;
}
	
</style>
</head>
<body>

	<!-- Title Bar -->
	<div class="title-bar">
		<h1>HR QuickView</h1>
	</div>

	<!-- Main Content -->
	<div class="main-container container-custom">
		<h2 class="text-center">Welcome to HR QuickView</h2>
		<p class="text-center">
		<p>
			<strong>HR QuickView</strong> is a centralized HR management tool
			that simplifies employee data access, helping HR professionals make
			quicker, more informed decisions.
		</p>
		<p>The objective of HR QuickView is to centralize employee data,
			provide workforce insights, and support HR decision-making to enhance
			overall efficiency. Traditional HR systems often lack real-time data,
			which makes it difficult to analyze workforce trends and identify
			areas for improvement. HR QuickView addresses this gap by
			consolidating data into a single, easy-to-use platform.</p>
		<p>HR QuickView allows HR teams to manage employee details, such
			as job roles, salaries, benefits, performance metrics, and contact
			information, all in one place. This reduces the time spent searching
			for data, enabling HR professionals to focus on more strategic tasks
			and improving the overall functioning of the HR department.</p>
		</p>

		<!-- Details Filling Section -->
		<div class="row mt-4">
			<div class="col-md-6 half-left">
				<h3>Personal Information</h3>
				<form>
					<div class="mb-3">
						<label for="firstName" class="form-label">First Name</label> <input
							type="text" class="form-control" id="firstName"
							placeholder="Enter first name">
					</div>
					<div class="mb-3">
						<label for="lastName" class="form-label">Last Name</label> <input
							type="text" class="form-control" id="lastName"
							placeholder="Enter last name">
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email</label> <input
							type="email" class="form-control" id="email"
							placeholder="Enter email">
					</div>
					<div class="mb-3">
						<label for="phone" class="form-label">Phone</label> <input
							type="tel" class="form-control" id="phone"
							placeholder="Enter phone number">
					</div>
				</form>
			</div>

			<div class="col-md-6 half-right">
				<h3>Additional Information</h3>
				<form>
					<div class="mb-3">
						<label for="address" class="form-label">Address</label> <input
							type="text" class="form-control" id="address"
							placeholder="Enter address">
					</div>
					<div class="mb-3">
						<label for="dob" class="form-label">Date of Birth</label> <input
							type="date" class="form-control" id="dob">
					</div>
					<div class="mb-3">
						<label for="position" class="form-label">Position</label> <input
							type="text" class="form-control" id="position"
							placeholder="Enter position">
					</div>
					<div class="mb-3">
						<label for="department" class="form-label">Department</label> <input
							type="text" class="form-control" id="department"
							placeholder="Enter department">
					</div>
				</form>
			</div>
		</div>

		<!-- Login Form Section -->
				<div class="cardlog">
					<div class="card-body">
						<h3 class="text-center">Login to HR QuickView</h3>
						<form id="loginForm">
							<div class="row mb-3">
								<div class="col-md-12">
									<label for="username" class="form-label">Username</label> <input
										type="text" class="form-control" id="username" name="username"
										placeholder="Enter username" required>
								</div>
							</div>
							<div class="row mb-3">
								<div class="col-md-12">
									<label for="password" class="form-label">Password</label> <input
										type="password" class="form-control" id="password"
										name="password" placeholder="Enter password" required>
								</div>
							</div>
							<div class="text-center">
								<button type="submit" class="btn btn-primary w-100">Login</button>
							</div>
						</form>
					</div>
				</div>

			<!-- HR Features Section -->
			<div class="row mt-4">
				<h3 class="text-center m">Our Features</h3>

				<!-- HR Dashboard Sections -->
				<div class="col-md-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Vacation Tracking</h5>
							<p class="card-text">Manage employee leave and vacation
								requests seamlessly. Easily track and approve leave applications
								with a user-friendly interface.</p>
							<a href="vacation.jsp" class="btn btn-primary">View Vacation
								Tracking</a>
						</div>
					</div>
				</div>

				<div class="col-md-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Absenteeism Report</h5>
							<p class="card-text">Analyze absenteeism patterns and
								generate detailed reports to improve workforce efficiency and
								attendance policies.</p>
							<a href="absenteeism.jsp" class="btn btn-primary">View
								Absenteeism Report</a>
						</div>
					</div>
				</div>

				<div class="col-md-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Employee Analytics</h5>
							<p class="card-text">Get insights into workforce performance
								and trends with advanced analytics and customizable dashboards.</p>
							<a href="analytics.jsp" class="btn btn-primary">View Employee
								Analytics</a>
						</div>
					</div>
				</div>

				<div class="col-md-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Holiday Management</h5>
							<p class="card-text">Plan and manage company holidays
								efficiently with shared calendars and automated reminders.</p>
							<a href="holidays.jsp" class="btn btn-primary">View Holiday
								Management</a>
						</div>
					</div>
				</div>

				<div class="col-md-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Time Off Policy</h5>
							<p class="card-text">Define and customize company time-off
								policies to fit organizational needs and enhance compliance.</p>
							<a href="timeoff.jsp" class="btn btn-primary">View Time Off
								Policy</a>
						</div>
					</div>
				</div>
			</div>

		</div>

	</div>
	</div>

	<!-- Footer -->
	<footer>
		<p>&copy; 2024 HR QuickView. All Rights Reserved.</p>
		<p>Streamlining HR operations for better decision-making.</p>
	</footer>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
