<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>views/itwill.jsp</h1>
		<!--jsp 내장객체를 사용  -->
		<h2>파라메터 데이터 (parameter)</h2>
		<h3>msg : <%=request.getParameter("msg")%></h3>
		<h3>msg (el표현식) : ${param.msg } </h3>
		
		
		<h2>영역객체 데이터 (attribute)</h2>
		<h3>msg (el표현식) : ${msg } </h3> 
		<h3>msg (el표현식) : ${requstScope.msg }</h3>
		
		<hr> 
		
		@ModelAttribute("msg") String msg 
			=> request.getAttribute + request.setAttribute("msg",값)
		
		<%-- <h2>vo : ${requestScope}</h2> --%>
		<h2>vo : ${memberVO}</h2>
		
		<h2>vo1 : ${vo1 }</h2>
		
</body>
</html>