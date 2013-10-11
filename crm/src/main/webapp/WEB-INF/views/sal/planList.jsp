<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>用户管理</title>
</head>

<body>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>TODO</th><th>Result</th><th>PlanDate<th>管理</th></tr></thead>
		<tbody>
		<c:forEach items="${plans}" var="plan">
			<tr>
				<td><a href="${ctx}/sal/plan/update/${plan.plaId}">${plan.plaTodo}</a></td>
				<td>${user.plaResult}</td>
				<td>
					<fmt:formatDate value="${plan.plaDate}" pattern="yyyy年MM月dd日  HH时mm分ss秒" />
				</td>
				<td><a href="${ctx}/sal/plan/update/${plan.plaId}">删除</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a class="btn" href="${ctx}/sal/plan/create">新建</a>
</body>
</html>
