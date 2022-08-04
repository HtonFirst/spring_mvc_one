<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h3>Dear employee, you are WELCOME!!!</h3>
<br>
<br>
<br>
<%--Your Name: ${param.employeeName}--%>
Your Name: ${employee.name}
<br>
Your Surname: ${employee.surname}
<br>
Your Salary: ${employee.salary}
<br>
Your Department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Your language(s):
  <ul>
      <c:forEach var="lang" items="${employee.languages}">
          <li>
              ${lang}
          </li>

      </c:forEach>


  </ul>

</body>
</html>