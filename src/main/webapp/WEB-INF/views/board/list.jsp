<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table width="500" cellpadding="0" cellspacing="0" border="1">
      <tr>
         <td>번호</td>
         <td>이름</td>
         <td>제목</td>
         <td>날짜</td>
         <td>히트</td>
      </tr>
      
      <c:forEach items="${getList}" var="getList">
      <tr>
         <td>${getList.bid}</td>
         <td>${getList.userid}</td>
         <td>
            <c:forEach begin="1" end="${getList.bindent}">-</c:forEach>
            <a href="content_view?bid=${getList.bid}">${getList.btitle}</a></td>
         <td>${getList.bdate}</td>
         <td>${getList.bhit}</td>
      </tr>
      </c:forEach>
      <tr>
         <td colspan="5"> <a href="write_view">글작성</a> </td>
      </tr>
   </table>
</body>
</html>