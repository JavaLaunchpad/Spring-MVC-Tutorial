<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        button {
            margin-bottom: 15px;
            padding: 8px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Registration Form</h2>
    <form:form action="register" method="post" modelAttribute="user">
        <label for="first_name">First Name:</label>
        <form:input type="text" id="first_name" path="firstName" />
        <label for="last_name">Last Name:</label>
        <form:input type="text" id="last_name" path="lastName" />
        <label for="email">Email:</label>
        <form:input type="email" id="email" path="email" />
        <label for="salary">Salary:</label>
        <form:input type="text" id="salary" path="salary" />
        <button type="submit">Sign Up</button>
    </form:form>
</div>

</body>
</html>
