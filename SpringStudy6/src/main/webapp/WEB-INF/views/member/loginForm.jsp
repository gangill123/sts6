<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>loginForm.jsp</h1>
	<fieldset>
		<legend>로그인</legend>
		<form method="post"> <!--action="" :action 속성이 없을때 자신주소 호출 (현재)  -->
			아이디 : <input type="text" name="userid">
			비밀번호 : <input type="password" name="userpw">
			
			
			
			<input type="submit" value="로그인">
		</form>
	</fieldset>

</body>
</html>