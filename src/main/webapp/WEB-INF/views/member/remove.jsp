<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="contentBox">
	<div id="remove_content">
		<h3 align="center">회원 탈퇴</h3>
		<form id='removeForm'>
		<br>
		비밀번호 확인: <br>
		<input id="password" type="password" name="password"/>
		<br><br>
		
		<input id="remove_submit" type="button" value ="탈퇴" />
		</form>
	</div>
</div>
<script>
$('#remove_submit').click(function(){
	if($('#password').val()!==''){
		if($('#password').val()==='${user.password}'){
			$('#removeForm').attr({
				action:"${context}/member/remove",
				method:"POST"
			}).submit();
		}else{
			alert("비밀번호가 틀렸습니다.");
		}
	}else{
		alert("비밀번호를 입력하세요.");
	}
});
</script>
