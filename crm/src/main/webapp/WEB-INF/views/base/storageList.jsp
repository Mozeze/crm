<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
</head>
<body>

<div class="page_title">库存查询</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>产品</th>
		<td><input /></td>
		<th>仓库</th>
		<td><input /></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
<br />
<table class="data_list_table">
	<tr>
		<th>序号</th>
		<th>产品</th>
		<th>仓库</th>
		<th>货位</th>
		<th>件数</th>
		<th>备注</th>
	</tr>
	<tr>
		<td class="list_data_number">1</td>
		<td class="list_data_ltext">幸福牌电视机-818 FFT-2388 EA03</td>
		<td class="list_data_ltext">北京-西直门库</td>
		<td class="list_data_text">EC-D2</td>
		<td class="list_data_number">16</td>
		<td class="list_data_ltext">&nbsp;</td>		
	</tr>
	<tr>
		<td class="list_data_number">2</td>
		<td class="list_data_ltext">海龙笔记本电脑-i60-2688 9966</td>
		<td class="list_data_ltext">北京-大钟寺库</td>
		<td class="list_data_text">EA-B8</td>
		<td class="list_data_number">12</td>
		<td class="list_data_ltext">&nbsp;</td>		
	</tr>
	<tr>
		<td class="list_data_number">3</td>
		<td class="list_data_ltext">海龙笔记本电脑-i60-2688 9966</td>
		<td class="list_data_ltext">北京-马甸库</td>
		<td class="list_data_text">EA-A6</td>
		<td class="list_data_number">8</td>
		<td class="list_data_ltext">&nbsp;</td>		
	</tr>
	<tr>
		<td class="list_data_number">4</td>
		<td class="list_data_ltext">海龙笔记本电脑-i61-2689 6688</td>
		<td class="list_data_ltext">天津-恒远电子C库</td>
		<td class="list_data_text">北26位</td>
		<td class="list_data_number">36</td>
		<td class="list_data_ltext">&nbsp;</td>		
	</tr>
		<tr>
		<td class="list_data_number">5</td>
		<td class="list_data_ltext">海龙笔记本电脑-i61-2689 6688</td>
		<td class="list_data_ltext">天津-恒远电子C库</td>
		<td class="list_data_text">北27位</td>
		<td class="list_data_number">36</td>
		<td class="list_data_ltext">&nbsp;</td>		
	</tr>
		<tr>
		<td class="list_data_number">6</td>
		<td class="list_data_ltext">海龙笔记本电脑-i61-2689 6688</td>
		<td class="list_data_ltext">天津-恒远电子C库</td>
		<td class="list_data_text">北28位</td>
		<td class="list_data_number">30</td>
		<td class="list_data_ltext">&nbsp;</td>		
	</tr>
	<tr>
		<th colspan="100" class="pager">
<div class="pager">
	共59条记录 每页<input value="10" size="2" />条
	第<input value="1" size="2"/>页/共5页
	<a href="#">第一页</a>
	<a href="#">上一页</a>
	<a href="#">下一页</a>
	<a href="#">最后一页</a>
	转到<input value="1" size="2" />页
	<button width="20" onclick="reload();">GO</button>
</div>
		</th>
	</tr>
</table>
</body>
</html>