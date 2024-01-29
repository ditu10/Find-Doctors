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
    <h1 class="text-center">Add Details Information</h1>
    <form class="mt-3" action="/handlePatientRegister" method="post">
        <div class="mb-3">
            <%--                <label for="email" class="form-label">Email address</label>--%>
            <input type="number" name="id" value="${user.id}" hidden="hidden" class="form-control" id="id">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <input type="email"  class="form-control" value="${user.email}" name="email" id="email" readonly>
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Full Name</label>
            <input type="text" name="name" class="form-control" id="name">
        </div>

        <div class="mb-3">
            <label for="gender">
                <select class="form-select" id="gender" name="gender">
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>
            </label>
        </div>
        <div class="mb-3">
            <label for="dob" class="form-label">Date Of Birth</label>
            <input type="date" class="form-control" name="dob" id="dob">
        </div>

        <div class="mb-3">
            <label for="phone" class="form-label">phone</label>
            <input type="text" class="form-control" name="phone" id="phone">
        </div>



        <div class="mb-3">
            <label for="photo" class="form-label">Upload Your Profile Pic</label>
            <input class="form-control" type="file" name="photo" id="photo">
        </div>

        <div class="text-center">
            <button type="submit" class="btn btn-outline-primary">Save</button>
        </div>

    </form>
</div>


</body>
</html>