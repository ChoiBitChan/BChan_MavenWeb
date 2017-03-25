<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	<a href="list.do">글목록</a>
	
	<form:form commandName="contentCommand" action="writeForm.do"><br>
		<table>
			
			<tr><td>이름</td><td><form:input path="userName"/></td>
			<tr><td>제목</td><td><form:input path="subject"/></td>
			<tr><td>이메일</td><td><form:input path="email"/></td>
			<tr><td>내용</td><td><form:input path="content"/></td>
			<tr><td>비밀번호</td><td><form:input path="password"/></td>
			<tr><td><input type="submit"></td></tr>
		
		</table>
	</form:form>

</body>
</html>