<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

    [<a href="<c:url value="list?boardtype=${1 }"/>">공지사항</a>]
    [<a href="<c:url value="list?boardtype=${2 }"/>">이벤트</a>]
    [<a href="<c:url value="list?boardtype=${3 }"/>">고객센터</a>]
    [<a href="<c:url value="list?boardtype=${4 }"/>">자주 묻는 게시판</a>]

   <table width="500" cellpadding="0" cellspacing="0" border="1">
     
     
      <tr>
         <td>번호</td>
         <td>이름</td>
         <td>제목</td>
         <td>날짜</td>
         <td>히트</td>
         <td>게시판 번호</td>
      </tr>
      
      <c:forEach items="${getListAll}" var="getListAll">
      <tr>
         <td>${getListAll.bid}</td>
         <td>${getListAll.userid}</td>
         <td>
            <c:forEach begin="1" end="${getListAll.bindent}">-</c:forEach>
            <a href="content_view?bid=${getListAll.bid}">${getListAll.btitle}</a></td>
         <td>${getListAll.bdate}</td>
         <td>${getListAll.bhit}</td>
         <td>${getListAll.boardtype}</td>
      </tr>
      </c:forEach>
      <tr>
         <td colspan="5"> <a href="write_view">글작성</a> </td>
      </tr>
   </table>
</body>
</html>