<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	글목록 (전체 글 : ${list.pageTotalNum}) <br>
	
	<table>
		<tr><td>번호</td><td>제목</td><td>작성자</td><td>작성일</td></tr>
		
		<c:forEach var="contentList" items="${list.contentList}">
			<tr>
				<td>${contentList.num}</td>
				<td><a href="view/contentView.do?num=${contentList.num}">${contentList.subject}</a></td>
				<td>${contentList.userName}</td>
				<td>${contentList.reg_date}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>