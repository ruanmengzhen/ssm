
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加数据</title>
</head>
<body>
<h2 style="color: coral">添加账户信息表</h2>
<form name="saveForm" action="${pageContext.request.contextPath}/account/save" method="post">
    账户名称:<input type="text" name="name"><br/>
    账户金额:<input type="text" name="money"><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>
