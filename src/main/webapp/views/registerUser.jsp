<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>registration</title>
</head>
<body>
<%@include file="all_js_css.jsp"%>

<div class="container mt-5">
    <h1 class="text-center">Register here</h1>


    <form class="mt-3" action="/handleUserRegister" method="post">
        <div class="mb-3">
            <label for="email" class="form-label">Enter your email</label>
            <input type="email" class="form-control" name="email" id="email" >
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Enter password</label>
            <input type="password" class="form-control" name="password" id="password">
        </div>

        <div class="mb-3">
            <label class="form-label" for="role">Select your role</label>
            <select class="form-select" id="role" name="role">
                <option value = "1" >Doctor</option>
                <option value = "0" >Patient</option>
            </select>
        </div>

        <div class="text-center">
            <button type="submit" class="btn btn-outline-primary">Save</button>
        </div>

    </form>
</div>


</body>
</html>