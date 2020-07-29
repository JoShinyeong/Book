<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보 관리 -도서 추가</title>
</head>
<body>
	<form:form commandName="bookCmd"   method="POST" enctype="multipart/form-data">
		<table border="1">
            <tr>
                <td width="150" height="200" rowspan="6">
                <img src="image" id="img"></td>
                <th><form:label path = "bookisbn">ISBN</form:label></th>
                <td><form:input path="bookisbn"/>
                <form:errors path="bookisbn"/></td>
            </tr>
            <tr>
                <th><form:label path = "book">도서명</form:label></th>
                <td><form:input path="book"/>
                <form:errors path="book"/></td>
            </tr>
            <tr>
                <th><form:label path = "writer">저자</form:label></th>
                <td><form:input path="writer"/>
                <form:errors path="writer"/></td>
            </tr>
         <tr>
                <th><form:label path = "publisher">출판사</form:label></th>
                <td><form:input path="publisher"/>
                <form:errors path="publisher"/></td>
            </tr>
            <tr>
                <th><form:label path="price">도서 가격</form:label></th>
                <td><form:input path="price"/>
                <form:errors path="price"/></td>
            </tr>
            <tr>
                <th><form:label path="image">이미지</form:label></th>
                <td><input type="file" name="image"/>
                <form:errors path="image"/><td>
            </tr>
            <tr>
                <th><form:label path="content">책 소개</form:label></th>
                <td colspan="2"><form:input path="content"/>
                <form:errors path="content"/></td>
		</tr>
		</table>
		<div>
			<input type="submit" value="등록"> <a
				href="<c:url value="/book/list"/>">목록</a>
		</div>
	</form:form>
</body>
</html>