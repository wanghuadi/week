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
		})
		
		
	})
</script>
<script type="text/javascript">
	function add(){
		
		$.post("add",$("form").serialize(),function(data){
			if(data){
				alert("添加成功!");
				location.href="list";
			}else{
				alert("添加失败!")
			}
		})
	}
</script>
<script type="text/javascript">
	function yc(){
		$("#qq").css("display","none");//修改baidisplay属性为none
	}
	
	function xs(){
		$("#qq").css("display","block");//修改baidisplay属性为none
	}
</script>
</head>
<body>

	<form action="#">
		姓名:<input type="text" name="sname"><br><br>
		性别:<input type="radio" name="gender" value="男" checked="checked" onclick="yc()">男
			<input type="radio" name="gender" value="女" onclick="xs()">女
			
			<div id="qq">
				<input type="date">
			</div>
			
		<br><br>
		年龄:<input type="text" name="age"><br><br>
		所属班级:<select id="cid" name="cid">
					<option value="">请选择</option>
			  </select><br><br>
		<input type="button" value="添加" onclick="add()">
	</form>

</body>
</html>