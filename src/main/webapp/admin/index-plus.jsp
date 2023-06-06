<%--
  Created by IntelliJ IDEA.
  User: 随风轻尘
  Date: 2023/5/17
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <title>湘西汽车租凭管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/AdminLTE.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/_all-skins.min.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/app.js"></script>
    <script type="text/javascript">
        function SetIFrameHeight() {
            var iframeid = document.getElementById("iframe"); //iframe id
            if (document.getElementById) {
                iframeid.height = document.documentElement.clientHeight;
            }
        }
    </script>
</head>
<body class="hold-transition skin-green sidebar-mini">
<div class="wrapper">

    <!-- 页面头部 -->
    <header class="main-header">
        <!-- Logo -->
        <a href="index-plus.jsp" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>云管理</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>湘西汽车租凭管理系统</b></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <nav class="navbar navbar-static-top">
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">
                        <li class="dropdown user user-menu">
                            <a >
                                <c:if test="${USER_SESSION.role == 'USER-PLUS'}">
                                    <span class="hidden-xs">VIP用户</span>
                                </c:if>
                            </a>
                        </li>
                        <li class="dropdown user user-menu">
                            <a >
                                <img src="${pageContext.request.contextPath}/img/user.jpg" class="user-image" alt="User Image">
                                <span class="hidden-xs">${USER_SESSION.name}</span>
                            </a>
                        </li>
                        <li class="dropdown user user-menu">
                            <a href="${pageContext.request.contextPath}/user/logout">
                                <span class="hidden-xs">注销</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </nav>
    </header>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li id="admin-index">
                    <a href="index-plus.jsp">
                        <i class="fa fa-dashboard"></i> <span>首页</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/book/search" target="iframe">
                        <i class="fa fa-circle-o"></i>汽车租用
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/book/searchBorrowed" target="iframe">
                        <i class="fa fa-circle-o"></i>当前租用
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/record/searchRecords" target="iframe">
                        <i class="fa fa-circle-o"></i>租用记录
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/message/search" target="iframe">
                        <i class="fa fa-circle-o"></i>发布车辆信息
                    </a>
<%--                    <a href="${pageContext.request.contextPath}/admin/postMessage.jsp">
                        <i class="fa fa-circle-o"></i>发布车辆信息
                    </a>--%>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- 导航侧栏 /-->
    <!-- 内容区域 -->
    <div class="content-wrapper">
        <iframe width="100%" id="iframe" name="iframe" onload="SetIFrameHeight()"
                frameborder="0" src="${pageContext.request.contextPath}/book/selectNewbooks"></iframe>
    </div>
</div>

</body>

</html>
