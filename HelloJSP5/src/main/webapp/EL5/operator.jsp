<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num1 = 3;
	pageContext.setAttribute("num2", 4);
	pageContext.setAttribute("num3", "5");
	pageContext.setAttribute("num4", "8");
	
	pageContext.setAttribute("nullStr", null);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	스클립트릿에서 선언한 변수 ${num1 }<br/>
	page 영역에 저장한 변수 ${num2 }<br/>
	변수 할당 후 출력 : ${num1 = 7 }<br/>
	
	${num1 + num2 }<br/>
	${num1 - num2 }<br/>
	${num1 * num2 }<br/>
	${num1 / num2 }<br/>
	${num1 div num2 }<br/>
	${num3 % num4 }<br/>		<!-- EL에서는 산술 연산시 자동으로 숫자로 변경됨 -->
	${num3 mod num4 }<br/>
	
	${num4 > num3 }<br/>
	${num4 gt num3 }<br/>
	${num2 < num4 }<br/>
	${num2 lt num4 }<br/>
	${num2 >= num4 }<br/>
	${num2 ge num4 }<br/>
	${num2 == num4 }<br/>
	${num2 eq num4 }<br/>
	
	<br/>
	${empty nullStr }<br/>
	${empty emptyStr }<br/>
	${empty lengthZero }<br/>
</body>
</html>
