<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <title>유저 페이지</title>
</head>

<body>

<h1>유저 페이지 입니다.</h1>
<p>사용자아이디: <sec:authentication property="principal.userVO.userid"/></p>
<p>이름: <sec:authentication property="principal.userVO.username"/></p>
<p>성별: <sec:authentication property="principal.userVO.gender"/></p>
<p>이메일: <sec:authentication property="principal.userVO.email"/></p>
<p>주소: <sec:authentication property="principal.userVO.useradress"/></p>
<p>전화번호: <sec:authentication property="principal.userVO.userphone"/></p>
<p>보유 적립금: <sec:authentication property="principal.userVO.mileage"/></p>


 
</body>
</html>