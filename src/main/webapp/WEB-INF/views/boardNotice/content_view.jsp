<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글</title>
</head>
<body>

   <table width="500" cellpadding="0" cellspacing="0" border="1">
      
      <form action="modify" method="post">
      
         <input type="hidden" name="bid" value="${content_view.bid}">
         <tr>
            <td> 번호 </td>
            <td> ${content_view.bid} </td>
         </tr>
         <tr>
            <td> 히트 </td>
            <td> ${content_view.bhit} </td>
         </tr>
         <tr>
            <td> 이름 </td>
            <td> <input type="text" name="userid" disabled value="${content_view.userid}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input type="text" name="btitle" disabled value="${content_view.btitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea rows="10" disabled name="bcontent" >${content_view.bcontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2">
			<a href="content_view2.do?bid=${content_view.bid}">수정&nbsp;&nbsp;</a>
			<a href="list">목록보기</a> &nbsp;&nbsp;
			<a href="delete?bid=${content_view.bid}">삭제</a> &nbsp;&nbsp;
			<a href="reply_view?bid=${content_view.bid}">답변</a></td>
         </tr>
      </form>
   </table>
   
</body>
</html>