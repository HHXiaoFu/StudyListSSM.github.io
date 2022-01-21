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
    <title>updatePlan</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 ">
            <div class="page-header">
                <h1>
                    <small>计划清单————修改计划</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/planSystem/updatePlan" method="post">
        <div class="form-group">
            <label>计划编号</label>
            <input  type="hidden" class="form-control" name="planId" value="${QPlan.planId}" required>
            <p class="form-control-static">${QPlan.planId}</p>
        </div>
        <div class="form-group">
            <label>起始日期</label>
            <input type="date" class="form-control" name="startDate" value="${QPlan.startDate}" required>
        </div>
        <div class="form-group">
            <label>截止日期</label>
            <input type="date" class="form-control" name="endDate" value="${QPlan.endDate}" required>
        </div>
        <div class="form-group">
            <label>计划内容</label>
            <input type="text" class="form-control" name="context" placeholder="${QPlan.context}" required>
        </div>

        <button type="submit" class="btn btn-default">提交</button>
    </form>
</div>
</body>
</html>
