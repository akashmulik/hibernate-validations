<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "f"%>
<html>

<head>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
<h2>Hello World!</h2><br>

<f:form action="save" modelAttribute="user1" method="post">

	<f:input type="text" path="name" />
	<f:errors path="name" class="error"/><br><br>
	
	<f:input type="text" path="pass" />
	<f:errors path="pass" class="error" /><br><br>
	<button type="submit">Submit</button>
</f:form>
</body>
</html>
