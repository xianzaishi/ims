<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Tools Shop</title>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="cssBasePath" value="${contextPath}/css" />
<c:set var="scriptBasePath" value="${contextPath}/script" />
<c:set var="imagesBasePath" value="${contextPath}/images" />

<script language="javascript" type="text/javascript" src="${contextPath}/script/jquery-1.7.2.min.js"></script> 

<link rel="stylesheet" type="text/css" href="${contextPath}/css/front-end/style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="${contextPath}/css/front-end/iecss.css" />
<![endif]-->
</head>
<body>

<div id="main_container">

	<div id="header">

       <div class="top_right">
       
            <div class="languages">
                <div class="lang_text">Languages:</div>
                <a href="#" class="lang"><img src="${contextPath}/images/front-end/en.gif" alt="" title="" border="0" /></a>
                <a href="#" class="lang"><img src="${contextPath}/images/front-end/de.gif" alt="" title="" border="0" /></a>       
            </div>
            
            <div class="big_banner">
            <a href="#"><img src="${contextPath}/images/front-end/banner728.jpg" alt="" title="" border="0" /></a>
            </div>
        
        </div>
    
  
        <div id="logo">
            <a href="index.html"><img src="${contextPath}/images/front-end/logo.png" alt="" title="" border="0" width="182" height="85" /></a>
	    </div>
        

        

    </div>
    
   <div id="main_content"> 
   
            <div id="menu_tab">
                    <ul class="menu">
                         <li><a href="index.html" class="nav">  主页 </a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav">Products</a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav">Specials</a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav">My account</a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav">Sign Up</a></li>
                         <li class="divider"></li>                         
                         <li><a href="#" class="nav">Shipping </a></li>
                         <li class="divider"></li>
                         <li><a href="contact.html" class="nav">联系我们</a></li>

                    </ul>

            </div><!-- end of menu tab -->
        