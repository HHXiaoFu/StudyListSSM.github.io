<%--
  Created by IntelliJ IDEA.
  User: 帝白灬黎墨
  Date: 2022/1/21
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addPlan</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 ">
            <div class="page-header">
                <h1>
                    <small>计划清单————新增计划</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/planSystem/addPlan" method="post">
        <div class="form-group">
            <label>起始日期</label>
            <input type="date" class="form-control" name="startDate" placeholder="2022-01-21" required>
        </div>
        <div class="form-group">
            <label>截止日期</label>
            <input type="date" class="form-control" name="endDate" placeholder="2022-01-22" required>
        </div>
        <div class="form-group">
            <label>计划内容</label>
            <input type="text" class="form-control" name="context" placeholder="请简要阐述计划内容" required>
        </div>

        <button type="submit" class="btn btn-default">提交</button>
    </form>
</div>
</body>
</html>
