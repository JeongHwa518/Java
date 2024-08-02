<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="scoreVar" value="변수값이 Page 영역에 저장됨" />
<c:set var="scoreVar" value="변수값이 Request 영역에 저장됨" scope="request" />
<c:set var="scoreVar" value="변수값이 Session 영역에 저장됨" scope="session" />
<c:set var="scoreVar" value="변수값이 Application 영역에 저장됨" scope="application" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>${scoreVar }</li>
		<li>${requestScope.scoreVar }</li>
		<li>${sessionScope.scoreVar }</li>
		<li>${applicationScope.scoreVar }</li>
	</ul>
	<br/>
	<c:remove var="scoreVar" scope="session" />
	<ul>
		<li>${scoreVar }</li>
		<li>${requestScope.scoreVar }</li>
		<li>${sessionScope.scoreVar }</li>
		<li>${applicationScope.scoreVar }</li>
	</ul>
	<br/>
	<c:remove var="scoreVar" />
	<ul>
		<li>${scoreVar }</li>
		<li>${requestScope.scoreVar }</li>
		<li>${sessionScope.scoreVar }</li>
		<li>${applicationScope.scoreVar }</li>
	</ul>
</body>
</html>