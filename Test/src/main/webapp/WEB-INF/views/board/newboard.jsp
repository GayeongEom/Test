<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">

<form action="" method="post">

<table>

<input type="hidden" name="bId">

<tr>

<td>제목</td>

<td><input type="text" name="title"></td>

<td>작성자</td>

<td><input type="text" name="writer" ></td>

</tr>

<tr>

<td>내용</td>

</tr>

<tr>

<td colspan="4"><textarea name="content" cols="60" rows="15"

style="resize: none;"></textarea></td>

</tr>

</table>

<div align="center">

<button type="button" onclick="javascript:history.back();">취소</button>

<button id="submit" type="submit">수정하기</button>

</div>

</form>

</div>


</body>
</html>