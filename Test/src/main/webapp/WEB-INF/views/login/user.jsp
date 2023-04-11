<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원 전용 페이지</h1>
<p>안녕하세요 <%=session.getAttribute("userid") %>(<%=session.getAttribute("username") %>)님</p>

<a href="./logout"><button>로그아웃</button></a>
<button>회원정보 수정</button>

</body>
</html>