<%--
  Created by IntelliJ IDEA.
  User: darkprado
  Date: 15.01.2020
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach var="msq" items="${messages}">
    <h1>${msq}</h1>
</c:forEach>

</body>
</html>