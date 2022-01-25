<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <title>회원가입</title>
</head>

<body>

<h1>회원가입</h1>
<c:url value="/add/addUser" var="addUserUrl" />
<form:form name="frmMember" action="${addUserUrl}" method="POST">
    <p>
        <label for="userid">아이디</label>
        <input type="text"  name="userid" />
    </p>
    
    <p>
        <label for="username">이름</label>
        <input type="text"  name="username" />
    </p>    
    
    <p>
        <label for="userpassword">비밀번호</label>
        <input type="password" name="userpassword"/>
    </p>    

    <p>
        <label for="gender">성별</label>
        <input type="text"  name="gender" />
    </p> 
        
    <p>
        <label for="email">이메일 주소</label>
        <input type="text"  name="email" />
    </p>      

    <p>
        <label for="useradress">주소</label>
        <input type="text"  name="useradress" />
    </p>  
 
    <p>
        <label for="userphone">휴대폰 번호</label>
        <input type="text"  name="userphone" />
    </p>  


    <button type="submit" class="btn">가입하기</button>
</form:form>
</body>
</html>