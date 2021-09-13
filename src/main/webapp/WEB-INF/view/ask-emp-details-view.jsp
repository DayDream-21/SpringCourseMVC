<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Registration</title>
    </head>

    <body>
        <h2>Dear Employee, please enter your details</h2>

        <br>

        <form:form action="showDetails" modelAttribute="employee">
            Name <form:input path="name"/>
            <br><br>
            Surname <form:input path="surname"/>
            <br><br>
            Salary <form:input path="salary"/>
            <br><br>
            Department
            <form:select path="department">
                <form:options items="${employee.departments}"/>
            </form:select>

            <input type="submit" value="OK">
        </form:form>
    </body>
</html>
