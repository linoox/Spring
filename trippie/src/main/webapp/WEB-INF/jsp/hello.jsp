<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/><c:out value="${model.now}"/></p>
    <h3>Trips</h3>
    <c:forEach items="${model.trips}" var="trip">
    	<c:out value="${trip.name}"/><i><c:out value="${trip.description}"/></i>
    	<br>
    </c:forEach>
  </body>
</html>