<%
String taintedInput = (String) request.getParameter("xss");
%>
<h1>JSP XSS</h1>
<%= taintedInput %>