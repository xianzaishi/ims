<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>
<title>内容管理系统</title>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="cssBasePath" value="${contextPath}/css" />
<c:set var="scriptBasePath" value="${contextPath}/script" />
<c:set var="imagesBasePath" value="${contextPath}/images" />

<link rel="stylesheet" type="text/css" href="${contextPath}/css/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/style.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/admin.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/leftMenu/styles.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/ajaxfileupload.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/jquery-ui-1.8.21.custom.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/custom-button.css" />

<script language="javascript" type="text/javascript" src="${contextPath}/script/jquery-1.7.2.min.js"></script> 
<script language="javascript" type="text/javascript" src="${contextPath}/script/jquery-ui-1.8.21.custom.min.js"></script> 
<script language="javascript" type="text/javascript" src="${contextPath}/script/jquery-grid/grid.locale-cn.js"></script> 
<script language="javascript" type="text/javascript" src="${contextPath}/script/jquery-grid/jquery.jqGrid.src.js"></script> 
<script language="javascript" type="text/javascript" src="${contextPath}/script/json.js"></script> 
<script language="javascript" type="text/javascript" src="${contextPath}/script/custom.open.js"></script> 
<script language="javascript" type="text/javascript" src="${contextPath}/script/ajaxfileupload.js"></script> 
<script language="javascript" type="text/javascript" src="${contextPath}/script/lhgdialog/lhgcore.lhgdialog.min.js"></script> 

<script type="text/javascript">
	//用于传递WEB项目的context path值,jquery.grid.js等多个自定义js中会使用到此变量
	var contextPath = '';
</script>

</head>
<body>
<div id="main_container">
<div style="float:right;"><a href="../j_spring_security_logout" >登出</a>&nbsp;&nbsp;&nbsp;&nbsp;</div>
  <div id="header">
    <div id="logo"> <a href="index.htm"><img src="${contextPath}/images/logo.gif" width="147" height="78" alt="" title="" border="0" /></a> </div>
    <div class="banner_adds"></div>
    <div class="menu">
      <ul>
        <li><a href="${contextPath }/cms/index">主页</a></li>
        <li><a href="${contextPath }/cms/index">Manage Offers
          <!--[if IE 7]><!-->
          </a>
          <!--<![endif]-->
          <!--[if lte IE 6]><table><tr><td><![endif]-->
          <ul>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="${contextPath }/cms/index" title="">Lorem ipsum dolor sit amet</a></li>
          </ul>
          <!--[if lte IE 6]></td></tr></table></a><![endif]-->
        </li>
        <li><a href="${contextPath }/cms/index">Login
          <!--[if IE 7]><!-->
          </a>
          <!--<![endif]-->
          <!--[if lte IE 6]><table><tr><td><![endif]-->
          <ul>
            <li><a href="" title="">Categories</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
          </ul>
          <!--[if lte IE 6]></td></tr></table></a><![endif]-->
        </li>
        <li><a href="${contextPath }/cms/index">Newsletter
          <!--[if IE 7]><!-->
          </a>
          <!--<![endif]-->
          <!--[if lte IE 6]><table><tr><td><![endif]-->
          <ul>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
            <li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
          </ul>
          <!--[if lte IE 6]></td></tr></table></a><![endif]-->
        </li>
        <li><a href="${contextPath }/cms/index">Manage Customers</a></li>
        <li><a href="${contextPath }/cms/index">Website</a></li>
      </ul>
    </div>
  </div>