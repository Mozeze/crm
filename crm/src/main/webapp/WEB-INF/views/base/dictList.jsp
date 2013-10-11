<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${ctx}/css/style.css" rel="stylesheet" type="text/css">
<script src="${ctx}/script/common.js"></script>
</head>
<body>

	<div class="page_title">数据字典管理</div>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success">
			<button data-dismiss="alert" class="close">×</button>
			${message}
		</div>
	</c:if>
	<br />
	<form class="form-search" action="#">
		 	<label>类别：</label> <input type="text" name="search_EQ_dictType"   class="input-small"  value="${param.search_EQ_dictType}"> 
		    <label>条目：</label> <input type="text" name="search_EQ_dictItem" class="input-small" value="${param.search_EQ_dictItem}">
		    <label>值：</label> <input type="text" name="search_EQ_dictValue" class="input-small" value="${param.search_EQ_dictValue}">
		    <div style="float: right;">
			    <input id="search_btn" class="btn" type="submit" value="查询" />
				<input id="create_btn" class="btn" type="button" value="新建" onclick="to('${ctx}/base/dict/create');"/>
				<input id="help_btn" class="btn" type="button" onclick="help('');" value="帮助"/>
		    </div>
	</form>
	<tags:sort/>
	<table class="data_list_table">
		<tr>
			<th>编号</th>
			<th>类别</th>
			<th>条目</th>
			<th>值</th>
			<th>是否可编辑</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${dicts.content}" var="dict">
			<tr>
				<td class="list_data_number">${dict.dictId}</td>
				<td class="list_data_ltext">${dict.dictType}</td>
				<td class="list_data_text">${dict.dictItem}</td>
				<td class="list_data_text">${dict.dictValue}</td>
				<td class="list_data_text">
					<c:if test="${dict.dictIsEditable}">
					是
					</c:if>
					<c:if test="${!dict.dictIsEditable}">
					否
					</c:if>
				</td>
				<td class="list_data_op">
					<input id="delete_btn" class="btn" style="color: red;" type="button" value="删除" onclick="to('${ctx}/base/dict/delete/${dict.id}');"/>&nbsp;&nbsp;
					<c:if test="${dict.dictIsEditable}">
						<input id="edit_btn" class="btn" type="button" value="编辑" onclick="to('${ctx}/base/dict/update/${dict.id}');"/>
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
	<tags:pagination page="${dicts}" paginationSize="5"/>
</body>
</html>