<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="contentBox">
	<div id="modify_content">
		<h2 align="center">회원 정보 변경</h2>
		<br>
		<form id ="modifyForm" name="modifyForm">
			<h5>아이디 : ${user.userid}</h5>
			 <br>
			기존 비밀번호 : <br>
			<input id="before_pass" type="text" name="before_pass"/>
			 <br>
			변경할 비밀번호 : <br>
			<input id="after_pass" type="text" name="after_pass"/>
			<br>
			소속팀 : <br>
			<select name="teamid" id="teamid" class="select" >
			<option class="team-opt" value="GG">지은이랑지은집팀</option>
			<option class="team-opt" value="LP">레츠플레이팀</option>
			<option class="team-opt" value="TurtleKing">거북왕팀</option>
			<option class="team-opt" value="CodingStar">언프리티코딩스타팀</option>
			</select>
			
			<br>
			프로젝트역할 : <br>
			<select name="roll" id="roll" class="select">
			<option  value="프론트 담당">프론트개발</option>
			<option  value="팀장">팀장</option>
			<option  value="백단 담당">백단개발</option>
			<option  value="안드로이드 담당">안드로이드개발</option>
			<option  value="무임승차">무임승차</option>
			</select>
			<br><br>
			<input type="button" id="modify_submit" value ="변경" />
		</form>
		</div>
	</div>
	
	<%-- <form method="POST" enctype="multipart/form-data" action="${context}/member.do?action=fileupload&page=retrieve">
	  파일 업로드: <input type="file" name="upfile"><br/>
 	<input type="submit" value="파일 업로드">
	</form> --%>

<script>
$('#roll').val('${user.roll}').prop('selected', true);
$('#teamid').val(['${user.teamid}']);

$('#modify_submit').click(function(){
	if($('#before_pass').val()!==''){
		if($('#before_pass').val()==='${user.password}'){
			$('#after_pass').val(
					$('#after_pass').val() 
					|| 
					'${user.password}');
			$('#modifyForm').attr({
				action:"${context}/member/modify",
				method:"POST"
			}).submit();
		}else{
			alert("비밀번호를 잘못 입력했습니다.")
		}
	}else{
		alert("비밀번호를 입력하세요.")
	}
	
});
</script>



