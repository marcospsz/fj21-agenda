<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="campoData" %>
<!DOCTYPE html>
<html>
<head>
	<link href="css/jquery.css" rel="stylesheet">
	<meta charset="UTF-8">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<title>Adiciona contato</title>
</head>
<body>
	
	<c:import url="header.jsp" />

	<h1>Adiciona Contato</h1>
	<hr />
	<form action="adicionaContato">
		
		ID: <input type="text" name="id" /><br />
		Nome: <input type="text" name="nome" /><br />
		Email: <input type="text" name="email" /><br />
		Endereco: <input type="text" name="endereco" /><br />
		Data Nascimento: <campoData:campoData id="dataNascimento" /><br />
		
		<input type="submit" value="Gravar">	
		
	</form>

	<c:import url="footer.jsp" />
</body>
</html>