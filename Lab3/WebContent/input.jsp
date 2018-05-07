<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="pl">
<head>
<!-- Required meta tags -->
<meta charset="charset=windows-1250"">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<%@include file="../dist/styles.jsp"%>
<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-3 ">
				<%@include file="jsp/bar.jsp"%>

			</div>
			<div class="col-sm-9  body-content">

				<div class="card">
					<div class="card-header">Przykład przesyłania formularzy</div>
					<div class="card-body">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text" id="basic-addon1">Imię</span>
							</div>
							<input type="text" class="form-control" placeholder="Imię"
								aria-label="Username" aria-describedby="basic-addon1"
								value='<%out.println(request.getParameter("fname"));%>'>
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text" id="basic-addon1">Nazwisko</span>
							</div>
							<input type="text" class="form-control" placeholder="Imię"
								aria-label="Username" aria-describedby="basic-addon1"
								value='<%out.println(request.getParameter("lname"));%>'>
						</div>

					</div>
				</div>


			</div>
		</div>
	</div>

	<%@include file="dist/js.jsp"%>
</body>
</html>