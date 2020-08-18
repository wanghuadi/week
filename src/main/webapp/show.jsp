<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		//查询动态 班级下拉
		$.post("queryClasses",function(data){
			for(var i in data){
				$("#cid").append("<option value='"+data[i].cid+"'>"+data[i].cname+"</option>");
			}
			
			//设置回显
			$("#cid").val("${student.cid}");
		})
		
		
		//性别回显
		$("[name='gender'][value='${student.gender}']").attr("checked",true);
		$("[name='sname']").val("${student.sname}");
		$("[name='age']").val("${student.age}");
	})
</script>
</head>
<body>
	<form action="#">
		姓名:<input type="text" name="sname"><br><br>
		性别:<input type="radio" name="gender" value="男" checked="checked">男
			<input type="radio" name="gender" value="女">女
		<br><br>
		年龄:<input type="text" name="age"><br><br>
		所属班级:<select id="cid" name="cid">
					<option value="">请选择</option>
			  </select><br><br>
		<input type="button" value="返回" >
	</form>
</body>
</html>