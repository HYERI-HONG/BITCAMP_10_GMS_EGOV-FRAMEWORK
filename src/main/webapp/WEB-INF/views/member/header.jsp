<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header id="header">
		    <div class="container main-menu">
		    	<div class="row align-items-center justify-content-between d-flex">
			      <div id="logo">
			        <a href=""><img src="${context}/resources/img/logo.png" alt="" title="" /></a>
			      </div>
			      <nav id="nav-menu-container">
			        <ul class="nav-menu">
			          <li><a id="home_btn">Home</a></li>
			          <li><a id="">About</a></li>
			          <li class="menu-has-children"><a href="">Member</a>
			            <ul>
			              <li><a id="logout_btn">Logout</a></li>
			              <li><a id="mypage_btn">My Page</a></li>       
			            </ul>
			          </li>	
			          <li class="menu-has-children"><a href="">bulletin board</a>
			            <ul>
		            	  <li><a id="board_list">게시글 목록</a></li>
				          <li ><a id="board_write">게시글 쓰기</a></li>					                		
			            </ul>
			          </li>					          					          		          
			          <li><a href="">Contact</a></li>
			        </ul>
			      </nav>	    		
		    	</div>
		    </div>
</header>
<script>
$('#logout_btn').click(function(){
	location.href = '${context}/member/logout';
});
$('#mypage_btn').click(function(){
	location.href = '${context}/member/retrieve';
});
$('#home_btn').click(function(){
	location.href = '${context}/move/common/content/on';
});

$('#board_list').click(function(){
	alert('board_list');
});
$('#board_write').click(function(){
	alert('board_write');
});
</script>
