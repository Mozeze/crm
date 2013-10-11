<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="header">
	<div id="title">
	    <h1><a href="${ctx}" style="font-size: 30px;">客户关系管理系统</a>
	    <shiro:user>
			<div class="btn-group pull-right">
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-user"></i> <shiro:principal property="name"/>
					<span class="caret"></span>
				</a>
			
				<ul class="dropdown-menu">
					<shiro:hasRole name="admin">
						<li><a href="${ctx}/admin/user">管理系统用户</a></li>
						<li class="divider"></li>
					</shiro:hasRole>
					<li><a href="${ctx}/profile">当前用户信息</a></li>
					<li><a href="${ctx}/logout">退出</a></li>
				</ul>
			</div>
		<div class="btn-group pull-right" style="margin-right:10px;">
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					基础数据<span class="caret"></span>
				</a>
				<ul class="dropdown-menu">
					<li><a href="${ctx}/base/dict">数据字典管理</a></li>
					<li><a href="${ctx}/base/product">查询产品信息</a></li>
					<li><a href="${ctx}/base/storage">查询库存记录</a></li>
				</ul>
		</div>
		</shiro:user>
		</h1>
		<%--
		<table>
		<!--DWLayoutTable-->
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户关系管理系统.html';parent.fdown.location='_html/客户关系管理系统.html'"">客户关系管理系统</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/营销管理.html';parent.fdown.location='_html/营销管理.html'">+营销管理</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/销售机会管理.html';parent.fdown.location='_html/销售机会管理.html'">----销售机会管理</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户开发计划.html';parent.fdown.location='_html/客户开发计划.html'">----客户开发计划</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户管理.html';parent.fdown.location='_html/客户管理.html'">+客户管理</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户信息管理.html';parent.fdown.location='_html/客户信息管理.html'">----客户信息管理</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户流失管理.html';parent.fdown.location='_html/客户流失管理.html'">----客户流失管理</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/服务管理.html';parent.fdown.location='_html/服务管理.html'">+服务管理</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/服务创建.html';parent.fdown.location='_html/服务创建.html'">----服务创建</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/服务分配.html';parent.fdown.location='_html/服务分配.html'">----服务分配</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/服务处理.html';parent.fdown.location='_html/服务处理.html'">----服务处理</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/服务反馈.html';parent.fdown.location='_html/服务反馈.html'">----服务反馈</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/服务归档.html';parent.fdown.location='_html/服务归档.html'">----服务归档</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/统计报表.html';parent.fdown.location='_html/统计报表.html'">+统计报表</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户贡献分析.html';parent.fdown.location='_html/客户贡献分析.html'">----客户贡献分析</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户构成分析.html';parent.fdown.location='_html/客户构成分析.html'">----客户构成分析</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户服务分析.html';parent.fdown.location='_html/客户服务分析.html'">----客户服务分析</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/客户流失分析.html';parent.fdown.location='_html/客户流失分析.html'">----客户流失分析</a></td>
		</tr>
		<tr>
			<td><a href="#"
				onclick="parent.fright.location='html/基础数据.html';parent.fdown.location='_html/基础数据.html'">+基础数据</a></td>
		</tr>
		<tr>
			<td><a href="${ctx}/base/dict" >----数据字典管理</a></td>
		</tr>
		<tr>
			<td><a href="${ctx}/base/product">----查询产品信息</a></td>
		</tr>
		<tr>
			<td><a href="${ctx}/base/storage">----查询库存</a></td>
		</tr>
	</table>
		 --%>
	</div>
</div>