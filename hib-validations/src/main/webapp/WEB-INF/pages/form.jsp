<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "f"%>
<html>
<body>
<h2>Hello World!</h2><br>

<f:form action="save" modelAttribute="user1" method="post">
<f:errors path="name" />
<f:errors path="pass" />
	<f:input type="text" path="name" /><br>
	<f:input type="text" path="pass" /><br><br>
	<button type="submit">Submit</button>
</f:form>
</body>
</html>
