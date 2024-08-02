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
	<c:set var="number" value="100" />
	<c:set var="string" value="JSP" />
	
	<c:if test="${number mod 2 eq 1 }" var="result">
		${number }는 짝수입니다.
	</c:if>
	${result }<br/>
	<br/>
	<c:if test="100" var="result2">
		test 속성값으로 EL이 아닌 정수를 지정하면 false
	</c:if>
	${result2 }<br/>
	<br/>
	
	<c:if test="true" var="result3">
		test 속성값으로 일반 값으로 true 사용하면 true(예외적인 경우)
	</c:if>
	${result3 }<br/>
	<br/>
	
	<c:if test="TrUe" var="result4">
		test 속성값으로 일반 값으로 true 사용하면 true(예외적인 경우)
	</c:if>
	${result4 }<br/>
</body>
</html>