<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="${domainUrl}/rest/login/" method="post">
    <input type="text" name="username">用户名
    <input type="text" name="password">密码
    <input type="submit" name="提交">


</form>
<form action="${domainUrl}/rest/regist" method="post">
    <input type="text" name = "username">用户名
    <input type="text" name = "userPassword">密码2
    <input type="submit" name="注册">
</form>
</body>
</html>