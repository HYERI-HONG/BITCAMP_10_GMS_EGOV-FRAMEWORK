<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="en">
<head>
		
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="${context}/resources/img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Personal</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--CSS============================================= -->
			<link rel="stylesheet" href="${context}/resources/css/linearicons.css">
			<link rel="stylesheet" href="${context}/resources/css/font-awesome.min.css">
			<link rel="stylesheet" href="${context}/resources/css/bootstrap.css">
			<link rel="stylesheet" href="${context}/resources/css/magnific-popup.css">
			<link rel="stylesheet" href="${context}/resources/css/jquery-ui.css">				
			<link rel="stylesheet" href="${context}/resources/css/nice-select.css">							
			<link rel="stylesheet" href="${context}/resources/css/animate.min.css">
			<link rel="stylesheet" href="${context}/resources/css/owl.carousel.css">				
			<link rel="stylesheet" href="${context}/resources/css/main.css">
			<link rel="stylesheet" href="${context}/resources/css/style.css" />
		
			<link href="${context}/other_resources/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
    		<link href="${context}/other_resources/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />
			<%-- <script src="${context}/resources/js/app.js"></script> --%>
			<script src="${context}/resources/js/vendor/jquery-2.2.4.min.js"></script>
			<script src="${context}/resources/js/popper.min.js"></script>
			<script src="${context}/resources/js/vendor/bootstrap.min.js"></script>			
			<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>			
	  		<script src="${context}/resources/js/easing.min.js"></script>			
			<script src="${context}/resources/js/hoverIntent.js"></script>
			<script src="${context}/resources/js/superfish.min.js"></script>	
			<script src="${context}/resources/js/jquery.ajaxchimp.min.js"></script>
			<script src="${context}/resources/js/jquery.magnific-popup.min.js"></script>	
	    	<script src="${context}/resources/js/jquery.tabs.min.js"></script>						
			<script src="${context}/resources/js/jquery.nice-select.min.js"></script>	
	        <script src="${context}/resources/js/isotope.pkgd.min.js"></script>			
			<script src="${context}/resources/js/waypoints.min.js"></script>
			<script src="${context}/resources/js/jquery.counterup.min.js"></script>
			<script src="${context}/resources/js/simple-skillbar.js"></script>							
			<script src="${context}/resources/js/owl.carousel.min.js"></script>							
			<script src="${context}/resources/js/mail-script.js"></script>	
			<script src="${context}/resources/js/main.js"></script>	
</head>
	<body>
		<div id="wrapper">
			<div id="top">
				<tiles:insertAttribute name="header"></tiles:insertAttribute>
			</div>
			<div id="under">
				<tiles:insertAttribute name="nav"></tiles:insertAttribute>
			</div>
			<div id="middle">
				<tiles:insertAttribute name="content"></tiles:insertAttribute>
			</div>
			<div id="bottom">
				<tiles:insertAttribute name="footer"></tiles:insertAttribute>
			</div>
		</div>	
	</body>
</html>

