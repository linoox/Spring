<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/><c:out value="${model.now}"/></p>
    <h3>Increase Result</h3>
    <br>
    Price increased by:"${model.increase}"
     <br>
    <br>
  </body>
</html>