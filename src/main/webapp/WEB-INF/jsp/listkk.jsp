<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<!-- 表格 -->
		<table width="600" border="1">
			<tr>
				<td>
					id
				</td>
				<td>
					名字
				</td>
				
			</tr>
			<c:forEach var="i" items="${list }" varStatus="status">
				<tr
					<c:if test="${status.index%2==0 }">style="background-color:red"</c:if>>
					
					<td>
						${i.id }
					</td>
					<td>
						${i.name }
					</td>
				</tr>
			</c:forEach>
		</table>




</body>
</html>