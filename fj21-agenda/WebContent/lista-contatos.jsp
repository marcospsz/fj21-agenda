<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Contatos</title>
</head>
<body>	

	<c:import url="header.jsp" />
	
	<table border=1>
		
		<tr bgcolor="#00264d">
			
			<td><b><center><font size="3" color="white">LINHA</font></center></td>
			<td><b><center><font size="3" color="white">MOD</font></center></td>
			<td><b><center><font size="3" color="white">ID</font></center></td>			
			<td><b><center><font size="3" color="white">NOME</font></center></td>
			<td><b><center><font size="3" color="white">EMAIL</font></center></td>
			<td><b><center><font size="3" color="white">ENDERECO</font></center></td>
			<td><b><center><font size="3" color="white">DATA NASCIMENTO</font></center></td>
			<td><b><center><font size="3" color="white">ACAO</font></center></td>
		
		</tr>	
		
			
		<c:forEach var="contato" varStatus="id" items="${contatos}">
		
			<tr bgcolor="#${id.count % 2 == 0? 'd1d1e0':'ffffff'}">			
				
				<td>${id.count}</td>
				<td>${id.count % 2}</td>
				<td>${contato.id}</td>							
				<td>${contato.nome}</td>
				<td>
					<c:choose>					
						<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}"> ${contato.email} </a>
						</c:when>
						
						<c:otherwise>
							Email nao especificado.
						</c:otherwise>
						
					</c:choose>
					
				</td>				
							
				<td>${contato.endereco}</td>
			    <td><fmt:formatDate value="${contato.dataNascimento.time}" pattern = "dd/MM/yyyy" /></td>
			    
			    <td>
			    	<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
			    </td>
			
			</tr>
			
		</c:forEach>
					
	</table>
	
	<c:import url="footer.jsp" />

</body>
</html>