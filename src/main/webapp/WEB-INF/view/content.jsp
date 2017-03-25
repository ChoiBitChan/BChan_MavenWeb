<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	${content.num}<br>
	${content.userName}<br>
	${content.subject}<br>
	${content.email}<br>
	${content.reg_date}<br>
	${content.content}<br>
	
	<form:form commandName="commentCommand" action="comment.do"><br>
		<table>
			<tr><td>이름</td><td><form:input path="userName"/></td>
			<tr><td>내용</td><td><form:input path="comments"/></td>
			<tr><td><input type="submit"></td></tr>
		</table>
	</form:form>
	
	<a href="comment.do">test.jsp</a>

</body>
</html>