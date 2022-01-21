<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 帝白灬黎墨
  Date: 2022/1/20
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>planList</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 ">
            <div class="page-header">
                <h1>
                    <small>计划清单————显示所有计划</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-info" href="${pageContext.request.contextPath}/planSystem/toAddPlan">新增计划</a>
            <a class="btn btn-info" href="${pageContext.request.contextPath}/planSystem/allPlan">显示全部</a>
        </div>
        <div class="col-md-4">
            <form action="${pageContext.request.contextPath}/planSystem/queryDate" method="post" class="form-inline">
                <div class="form-group">
                    <input type="date" name="startDate" class="form-control" />
                </div>
                <button type="submit" class="btn btn-default">查询</button>
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>计划编号</th>
                        <th>起始日期</th>
                        <th>截止日期</th>
                        <th>简要内容</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="plan" items="#{plans}">
                        <tr>
                            <td>${plan.planId}</td>
                            <td>${plan.startDate}</td>
                            <td>${plan.endDate}</td>
                            <td>${plan.context}</td>
                            <td>
                                <a class="btn btn-info" href="${pageContext.request.contextPath}/planSystem/toUpdatePlan?planId=${plan.planId}">修改</a>
                                &nbsp; | &nbsp;
                                <a class="btn btn-info" href="${pageContext.request.contextPath}/planSystem/deletePlan?planId=${plan.planId}">删除</a>
                            </td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
