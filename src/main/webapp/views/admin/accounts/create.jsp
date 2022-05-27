<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IT16304 - Accounts</title>
</head>
<body>
	<form:form
		modelAttribute="account"
		method="POST"
		action="/su22b1_it16304_sof3021/admin/accounts/store">
		<div>
			<label>Fullname</label>
			<form:input name="fullname" path="fullname" />
		</div>
		<div>
			<label>Email</label>
			<form:input name="email" type="email" path="email" />
		</div>
		<div>
			<label>Username</label>
			<form:input name="username" path="username" />
		</div>
		<div>
			<label>Password</label>
			<form:password name="password" path="password" />
		</div>
		<div>
			<label>Photo</label>
			<form:input name="photo" path="photo" />
		</div>
		<div>
			<label>Role</label>
			<form:select name="admin" path="admin">
				<form:option value="0">User</form:option>
				<form:option value="1">Admin</form:option>
			</form:select>
		</div>
		<button>Create</button>
	</form:form>
</body>
</html>