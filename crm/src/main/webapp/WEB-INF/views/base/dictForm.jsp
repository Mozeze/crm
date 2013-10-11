<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<form id="inputForm" action="${ctx}/base/dict/update" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${dict.id}"/>
		<div class="page_title">数据字典管理 > 新建数据字典条目</div>
		<div class="button_bar">
			<input class="btn" onclick="help('');" type="button"  value="帮助"/>
			<input id="cancel_btn" class="btn" type="button" value="返回" onclick="to('${ctx}/base/dict');"/>
			<input class="btn" type="submit" value="保存" />
		</div>
		<table class="query_form_table">
			<tr>
				<th>编号</th>
				<td><input id="dictId" name="dictId" value="${dictId}" readonly="readonly" /></td>
				<th>类别</th>
				<td><input id="dictType" name="dictType"
					value="${dict.dictType}" /><span class="red_star">*</span><br />（需要使用Ajax实现自动补全功能）</td>
			</tr>
			<tr>
				<th>条目</th>
				<td><input id="dictItem" name="dictItem"
					value="${dict.dictItem}" /><span class="red_star">*</span></td>
				<th>值</th>
				<td><input id="dictValue" name="dictValue"
					value="${dict.dictValue}" /><span class="red_star">*</span></td>
			</tr>
			<tr>
				<th>是否可编辑</th>
				<td><input id="dictIsEditable" name="dictIsEditable"
					type="checkbox" <c:if test="${dict.dictIsEditable}"> checked="checked"</c:if> /></td>
				<th>&nbsp;</th>
				<td>&nbsp;</td>
			</tr>
		</table>
	</form>
</body>
</html>