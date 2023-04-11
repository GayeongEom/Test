<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

label {
 	display: inline-block; 
	width: 80px;
	font-weight: bold;
}


</style>

</head>
<body>

<h1>로그인</h1>

<form action="" method="post">

<label for="userid">아이디</label>
<input type="text" id="userid" name="userid"><br>

<label for="userpw">암호</label>
<input type="password" id="userpw" name="userpw"><br><br>

<button type="submit">로그인</button>
<button>취소</button>
<a href="./join"><button type="button">회원가입</button></a>

</form>



</body>
</html>