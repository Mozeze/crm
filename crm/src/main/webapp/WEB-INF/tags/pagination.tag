<%@tag pageEncoding="UTF-8"%>
<%@ attribute name="page" type="org.springframework.data.domain.Page" required="true"%>
<%@ attribute name="paginationSize" type="java.lang.Integer" required="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
int current =  page.getNumber() + 1;
int begin = Math.max(1, current - paginationSize/2);
int end = Math.min(begin + (paginationSize - 1), page.getTotalPages());
request.setAttribute("current", current);
request.setAttribute("begin", begin);
request.setAttribute("end", end);
request.setAttribute("pageSize", page.getSize());
%>
<form id="paginationForm" action="?page=1&page.size=${pageSize}&sortType=${sortType}&${searchParams}" method="get" class="form-horizontal">
<div class="pagination">
	<ul>
		 <% if (page.hasPreviousPage()){%>
               	<li><a href="?page=1&page.size=${pageSize}&sortType=${sortType}&${searchParams}">&lt;&lt;</a></li>
                <li><a href="?page=${current-1}&page.size=${pageSize}&sortType=${sortType}&${searchParams}">&lt;</a></li>
         <%}else{%>
                <li class="disabled"><a href="#">&lt;&lt;</a></li>
                <li class="disabled"><a href="#">&lt;</a></li>
         <%} %>
 
		<c:forEach var="i" begin="${begin}" end="${end}">
            <c:choose>
                <c:when test="${i == current}">
                    <li class="active"><a href="?page=${i}&page.size=${pageSize}&sortType=${sortType}&${searchParams}">${i}</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="?page=${i}&page.size=${pageSize}&sortType=${sortType}&${searchParams}">${i}</a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
	  
	  	 <% if (page.hasNextPage()){%>
               	<li><a href="?page=${current+1}&page.size=${pageSize}&sortType=${sortType}&${searchParams}">&gt;</a></li>
                <li><a href="?page=${page.totalPages}&page.size=${pageSize}&sortType=${sortType}&${searchParams}">&gt;&gt;</a></li>
         <%}else{%>
                <li class="disabled"><a href="#">&gt;</a></li>
                <li class="disabled"><a href="#">&gt;&gt;</a></li>
         <%} %>

	</ul>
	<ul style="margin-top: -20px;">
		<li class="disabled"><a>共<%=page.getTotalElements() %>条记录</a>&nbsp;&nbsp;&nbsp;
		每页<input id="page.size" name="page.size" class="input-small" style="width: 20px;" type="text" value="<%=page.getSize() %>" width="5px"/>条&nbsp;&nbsp;&nbsp;第<%=current %>页/共<%=page.getTotalPages() %>页</li>
	</ul>
</div>
</form>
