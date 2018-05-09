<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="pl">
<head>
<!-- Required meta tags -->
<meta charset="charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<%@include file="../dist/styles.jsp"%>
<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-3">
				<%@include file="jsp/bar.jsp"%>

			</div>
			<div class="col-sm-9  body-content"></div>
		</div>
	</div>


	<%@include file="dist/js.jsp"%>
</body>
</html>