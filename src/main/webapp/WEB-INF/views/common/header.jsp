<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <header id="header">
		    <div class="container main-menu">
		    	<div class="row align-items-center justify-content-between d-flex">
			      <div id="logo">
			        <a href="index.html"><img src="${context}/resources/img/logo.png" alt="" title="" /></a>
			      </div>
			      <nav id="nav-menu-container">
			        <ul class="nav-menu">
			          <li><a id="home_btn">Home</a></li>
			          <li><a id="">About</a></li>
			          <li class="menu-has-children"><a href="">Member</a>
			            <ul>
			              <li><a id="login_btn">Login</a></li>
			              <li><a id="add_btn">Join</a></li>
			            </ul>
			          </li>	
			          <li class="menu-has-children"><a href="">Manager</a>
			            <ul>
		            	  <li><a href="elements.html">Login</a></li>
				          <li class="menu-has-children"><a href="">Manager page</a>
				            <ul>
				              <li><a href="#">회원 관리</a></li>
				              <li><a href="#">통계 보기</a></li>
				            </ul>
				          </li>					                		
			            </ul>
			          </li>					          					          		          
			          <li><a href="contact.html">Contact</a></li>
			        </ul>
			      </nav><!-- #nav-menu-container -->		    		
		    	</div>
		    </div>
</header>