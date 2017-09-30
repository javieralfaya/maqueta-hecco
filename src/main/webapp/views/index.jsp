<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8"/>
<title>HECCO</title>
</head>
<body>
  <s:url action="listUsers" var="url1"></s:url>
  <s:a href="%{url1}">ListUser</s:a>
  
  <s:url action="listUsersCriteriApi" var="url1"></s:url>
  <s:a href="%{url1}">ListUserFromCriteria</s:a>
  
</body>
</html>