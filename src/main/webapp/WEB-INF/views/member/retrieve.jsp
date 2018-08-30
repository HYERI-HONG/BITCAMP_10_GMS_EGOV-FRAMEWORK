<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="contentBox">
	<div id="retrieve_content">
		<h3 align="center">마이페이지</h3>
		<br><br>
			<table id="retrieve">
			<tr>
				<%-- <td rowspan="3" colspan="2" background="#ff8000"><img src="${img}${imgpath}"/></td> --%>
				<td rowspan="4" colspan="2" background="#ff8000"><img src=""/></td>
				<td>아   이   디</td>
				<td>${user.userid}</td>
			</tr>
				
			<tr>
				<td>비 밀 번 호</td>
				<td>****</td>
			</tr>
			
			<tr>
				<td>이         름</td>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td>성         별</td>
				<td>${user.gender}</td>
			</tr>
			<tr>
				<td>나         이</td>
				<td>${user.age}</td>
				<td>주 민 번 호</td>
				<td>${user.ssn}</td>
			</tr>
			
			<tr>
				<td>팀         명</td>
				<td>${user.teamid}</td>
				<td>역         할</td>
				<td>${user.roll}</td>
			</tr>
			</table>
			<%-- <c:if test="${from eq member}">
				<h4 align="center"><a id='myPageMoveToUpdate'>회원 정보 수정  </a>/<a id='myPageMoveToDelete'>  회원 탈퇴</a></h4>
			</c:if> --%>
			<br><br>
			<h4 align="center"><a id='goModify'>회원 정보 수정  </a>/<a id='goRemove'>  회원 탈퇴</a></h4>
		</div>
</div>



