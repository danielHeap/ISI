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
			<div class="col-sm-3 left-side">
				<%@include file="jsp/bar.jsp"%>

			</div>
			<div class="col-sm-9  right-side">
				<h2>Internetowe systemy informatyczne</h2>
				<div class="card">
					<div class="card-header">
						Przykłady wysłania formularza metodą POST.
						
					</div>
					<div class="card-body">
					<form action="/lab3/main" method="post">
							<div style="width: 5em">Imię:</div> <input type="text" name="fname"><br>
							<div style="width: 5em">Nazwisko:</div> <input type="text" name="lname"><br> 
							<input class="btn btn-primary" type="submit" value="Wyślij">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@include file="dist/js.jsp"%>
</body>
</html>