<%@page import="kr.co.kosta.el.PersonDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%
	ArrayList<PersonDTO> list = new ArrayList<>();
	list.add(new PersonDTO("이숙번", 65));
	list.add(new PersonDTO("황희", 68));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="personList" value="<%=list %>" scope="request" />
	<ul>
		<li>이름 : ${requestScope.personList[0].name }</li>
		<li>나이 : ${personList[0].age }</li>
	</ul>
</body>
</html>