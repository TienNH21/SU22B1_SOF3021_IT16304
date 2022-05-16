<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IT16304 - Create User</title>
</head>
<body>
	<form:form action="/su22b1_it16304_sof3021/admin/user/create"
		method="POST" modelAttribute="user">
		<div>
			<label>Họ tên</label>
			<form:input path="hoTen" />
		</div>
		<div>
			<label>Địa chỉ</label>
			<form:input path="diaChi" />
		</div>
		<div>
			<label>Giới tính</label>
			<form:radiobutton path="gioiTinh" value="1" label="Nam" />
			<form:radiobutton path="gioiTinh" value="0" label="Nữ" />
		</div>
		<div>
			<label>Email</label>
			<form:input path="email" />
		</div>
		<div>
			<label>Password</label>
			<form:password path="password" />
		</div>
		<div>
			<label>Số điện thoại</label>
			<form:input path="sdt" />
		</div>
		<div>
			<label>Avatar</label>
			<form:input path="avatar" />
		</div>		
		<button>Save</button>
	</form:form>
</body>
</html>