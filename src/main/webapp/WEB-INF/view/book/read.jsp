<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${bookVO.book}&nbsp내용</title>
</head>
<body>
	<table border="1">
		<tr>
			<td rowspan="6"><img width="150" height="200"
				src="${pageContext.request.contextPath}/upload/${bookVO.image}"></td>
		</tr>
		<tr>
			<th>BOOK ISBN</th>
			<td>${bookVO.bookIsbn}</td>
		</tr>
		<tr>
			<th>도서명</th>
			<td>${bookVO.book}</td>
		</tr>
		<tr>
			<th>저자</th>
			<td>${bookVO.writer}</td>
		</tr>
		<tr>
			<th>출판사</th>
			<td>${bookVO.publisher}</td>
		</tr>
		<tr>
			<th>도서 가격</th>
			<td>${bookVO.price}</td>
		</tr>
		<tr>
			<th>책 소개</th>
			<td>${bookVO.content}</td>
		</tr>
	</table>
	<div>
		<a href="<c:url value="/book/list"/>">목록</a>
	</div>
</body>
</html>