<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보관리-리스트</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>등록번호</th>
			<th>도서 ISBN</th>
			<th>도서 표지</th>
			<th>도서 제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>가격</th>
			</tr>
			<c:forEach var="book" items="${booklist}" varStatus="loop">
				<tr>
					<td>${book.seq}</td>
					<td>${book.bookIsbn}</td>
					<td><img width="150" height="200" src="../upload/${book.image}"></td>
				    <td><a href="<c:url value="/book/read/${book.seq}" />">${book.book}</a></td>
					<td>${book.writer}</td>
					<td>${book.publisher}</td>
					<td>${book.price}</td>
				</tr>
			</c:forEach>
	</table>
	<a href="<c:url value="/book/add"/>">도서 정보 추가</a>
</body>
</html>