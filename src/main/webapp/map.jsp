<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Location</title>
<style type="text/css">
.map-container-2{
  overflow:hidden;
  padding-bottom:56.25%;
  position:relative;
  height:0;
}
.map-container-2 iframe{
  left:0;
  top:0;
  height:100%;
  width:100%;
  position:absolute;
}

</style>
</head>
<body>
	<!--Google map-->
<div id="map-container-google-2" class="z-depth-1-half map-container" style="height: 500px">
  <iframe src="https://maps.google.com/maps?q=lucknow&t=&z=13&ie=UTF8&iwloc=&output=embed" frameborder="0"
    style="border:0" allowfullscreen></iframe>
</div>

<!--Google Maps-->
	<br>
	<a href="index.jsp">
  <button>Click me</button>
</a>

</body>
</html>