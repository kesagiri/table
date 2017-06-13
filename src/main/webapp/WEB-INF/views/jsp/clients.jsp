<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>My Store Animals Groups</title>

 <link rel="stylesheet" type="text/css" href="http://svn.geoext.org/ext/3.4.1/resources/css/ext-all.css" />

</head>

<body>

<div id="groups-grid"></div>

<spring:url value="/resources/js/clients.js" var="clientsJs" />

<script src="http://svn.geoext.org/ext/3.4.1/adapter/ext/ext-base.js"></script>
<script src="http://svn.geoext.org/ext/3.4.1/ext-all.js"></script>
<script src="${clientsJs}"></script>

</body>
</html>