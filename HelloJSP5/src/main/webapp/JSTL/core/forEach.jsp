<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>일반 for문 형태</h4>
	<c:forEach begin="1" end="3" step="1" var="i" >
		<p>반복 ${i }</p>
	</c:forEach>
	
	<table border="1">
		<c:forEach begin="3" end="5" var="i" varStatus="loop">
			<tr>
				<td>count : ${loop.count }</td>
				<td>index : ${loop.index }</td>
				<td>current : ${loop.current }</td>
				<td>first : ${loop.first }</td>
				<td>last : ${loop.last }</td>
			</tr>
		</c:forEach>
	</table>
	
	
	<%
		String[] rgba = {"Red", "Green", "Blue", "Black"};
	%>
	
	<h4>향상된 for문 형태</h4>
	<c:forEach items="<%=rgba %>" var="c">
		<span style="color: ${c}">${c }</span>	
	</c:forEach>
</body>
</html>