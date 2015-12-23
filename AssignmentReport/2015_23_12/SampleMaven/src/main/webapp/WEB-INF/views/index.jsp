<html>
<head>
	
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>

<!-- <h2>Hello World!</h2>
<form action="SampleController" method="POST">

Name : <input type="text" name="userName"><br><br>
Password : <input type="password" name="passWord"><br><br>

<button type="submit">Submit</button>



</form>
 -->



<h2>Student Information</h2>
<form:form method="POST" modelAttribute="myuser" action="addStudent.html">
   <table>
    <tr>
        <td><form:label path="userName">Name</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><form:label path="passWord">password</form:label></td>
        <td><form:input path="passWord" /></td>
    </tr>

    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

</body>
</html>
