<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Welcome</title>
    </head>

    <body>
        <h2>Dear Employee, you are welcome!</h2>
        <br><br>

        Your name: ${employee.name}
        <br><br>

        Your surname: ${employee.surname}
        <br><br>

        Your salary: ${employee.salary}
        <br><br>

        Your department: ${employee.department}
        <br><br>

        Your language(s):
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li>${lang}</li>
            </c:forEach>
        </ul>
        <br>

        Your phone number: ${employee.phoneNumber}
        <br><br>

        Your email: ${employee.email}
        <br><br>
    </body>

</html>
