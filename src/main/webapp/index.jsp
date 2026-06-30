<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Student</title>
</head>
<body>

<h2>Add Student</h2>

<!-- FORM TO SUBMIT STUDENT -->
<form action="/students" method="post">
    Roll No: <input type="number" name="rollNo" required><br><br>
    Name: <input type="text" name="name" required><br><br>
    Marks: <input type="number" name="marks" required><br><br>

    <button type="submit">Submit</button>
</form>

<br><br>

<!-- LINK TO VIEW STUDENT LIST -->
<a href="/students">View all students</a>

</body>
</html>