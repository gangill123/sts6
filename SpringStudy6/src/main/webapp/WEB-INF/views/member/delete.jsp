<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/member/delete.jsp</h1>
	
	
	
	<fieldset>
		<legend>회원 삭제</legend>
		<form action="" method="post">
			<input type="hidden" name="userid" value="${sessionScope.id }"> <br> 
			비밀번호 : <input type = "password" name="userpw"> <br> 
			<br> <input type="submit" value="회원삭제">
		</form>
		
		
		
	</fieldset>












</body>
</html>