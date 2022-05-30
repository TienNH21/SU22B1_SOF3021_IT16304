<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/su22b1_it16304_sof3021/css/bootstrap.min.css" />
</head>
<body>
	<table class="table">
		<thead>
			<th>Id</th>
			<th>Fullname</th>
			<th>Username</th>
			<th>Email</th>
			<th>Photo</th>
			<th>Activated</th>
			<th>Role</th>
			<th colspan="2">Action</th>
		</thead>
		<tbody>
			<c:forEach items="${ data.content }" var="acc">
			<tr>
				<td>${ acc.id }</td>
				<td>${ acc.fullname }</td>
				<td>${ acc.username }</td>
				<td>${ acc.email }</td>
				<td>
					<img src="${ acc.photo }" />
				</td>
				<td>${ acc.activated == 0 ? "Not active" : "Active" }</td>
				<td>${ acc.admin == 0 ? "User" : "Admin" }</td>
				<td>
					<a href="#">Update</a>
				</td>
				<td>
					<a href="/su22b1_it16304_sof3021/admin/accounts/delete/${ acc.id }">
						Delete
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div>
		<ul class="pagination">
			<li class="page-item">
				<a class="page-link" href="/su22b1_it16304_sof3021/admin/accounts/index">
					First page
				</a>
			</li>
			<li class="page-item">
				<a class="page-link" href="/su22b1_it16304_sof3021/admin/accounts/index?page=${ data.number - 1 }">
					Previos page
				</a>
			</li>
			<li class="page-item">
				<a class="page-link" href="/su22b1_it16304_sof3021/admin/accounts/index?page=${ data.number + 1 }">
					Next page
				</a>
			</li>
			<li class="page-item">
				<a class="page-link" href="/su22b1_it16304_sof3021/admin/accounts/index?page=${ data.totalPages - 1 }">
					Last page
				</a>
			</li>
		</ul>
	</div>
	
	<script src="/su22b1_it16304_sof3021/js/jquery.min.js"></script>
	<script src="/su22b1_it16304_sof3021/js/popper.min.js"></script>
	<script src="/su22b1_it16304_sof3021/js/bootstrap.min.js"></script>
</body>
</html>