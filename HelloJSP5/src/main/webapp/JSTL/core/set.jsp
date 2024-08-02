<%@page import="kr.co.kosta.el.PersonDTO"%>
<%@page import="java.util.Date"%>
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
	<c:set var="directVar" value="100" />
	<c:set var="elVar" value="${directVar mod 5 }" />
	<c:set var="dateVar" value="<%= new Date() %>" />
	
	<ul>
		<li>${pageScope.directVar }</li>
		<li>${elVar }</li>
		<li>${dateVar }</li>
	</ul>
	
	<c:set var="personVar" value='<%= new PersonDTO("이성계", 50) %>' scope="request" />
	<ul>
		<li>이름 : ${requestScope.personVar.name }</li>
		<li>나이 : ${requestScope.personVar.age }</li>
	</ul>
	
	<c:set var="personVar2" value="<%= new PersonDTO() %>" scope="request" />
	<c:set target="${personVar2 }" property="name" value="하륜" />
	<c:set target="${personVar2 }" property="age" value="60" />
	<ul>
		<li>이름 : ${personVar2.name }</li>
		<li>나이 : ${requestScope.personVar2.age }</li>
	</ul>
</body>
</html>
