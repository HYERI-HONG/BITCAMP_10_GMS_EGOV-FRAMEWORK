<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	user.session({
		userid : '${user.userid}',
		password : '${user.password}',
		name : '${user.name}',
		gender : '${user.gender}',
		age : '${user.age}',
		roll : '${user.roll}',
		teamid : '${user.teamid}'
	});
</script>