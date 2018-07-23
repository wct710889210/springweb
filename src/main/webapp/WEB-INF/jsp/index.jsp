<%@page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>spring data 初次实践</title>
</head>
<body>
    <table>
        <tr>
            <tl>id</tl>
            <tl>员工名称</tl>
            <tl>员工工资</tl>
        </tr>
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.salary}</td>
        </tr>
    </table>
</body>
</html>
