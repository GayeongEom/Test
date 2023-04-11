<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="../resources/js/member.js"></script>

<script type="text/javascript">

$(function() {

	$("form").submit(function() {
	
		
		if(!validate()) {
			console.log("submit 중단")
			return false
		}
		
		console.log("submit 진행")
		
	})
	
})



</script>

<style type="text/css">

label {
 	display: inline-block; 
	width: 80px;
	font-weight: bold;
}

.msg {
	color: red;
	font-size: 0.75em;
}

</style>



</head>
<body>

<h1>회원가입</h1>
<p>'*' 표시항목은 필수 입력항목입니다</p>
<form action="" method="post">

<label for="username">이름</label>
<input type="text" id="username" name="username" required="required">*<br>
<span id="username_msg" class="msg"></span><br>

<label for="userid">아이디</label>
<input type="text" id="userid" name="userid" required="required">*
<button>중복체크</button><br>
<span id="userid_msg" class="msg"></span><br>

<label for="userpw">암호</label>
<input type="password" id="userpw" name="userpw" required="required">*<br>
<span id="userpw_msg" class="msg"></span><br>

<label for="userpwch">암호 확인</label>
<input type="password" id="userpwch" name="userpwch" required="required">*<br>
<span id="userpwch_msg" class="msg"></span><br>

<label for="useremail">이메일</label>
<input type="email" id="useremail" name="useremail"><br>

<label for="userphone">전화번호</label>
<input type="text" id="userphone" name="userphone"><br>

<label for="grade">등급</label>
<input type="checkbox" id="usergrade" name="usergrade" value="일반회원">일반회원
<input type="checkbox" id="usergrade" name="usergrade" value="관리자">관리자<br>

<button type="submit">확인</button>
<a href="./login"><button type="button">취소</button></a>


</form>



</body>
</html>