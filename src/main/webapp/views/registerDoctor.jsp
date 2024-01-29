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


        <form class="mt-3" action="/handleDoctorRegister" method="post">
            <div class="mb-3">
                <%--                <label for="email" class="form-label">Email address</label>--%>
                <input type="number" name="id" value="${user.id}" hidden="hidden" class="form-control" id="id">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" value="${user.email}" name="email" id="email" readonly>
            </div>
            <div class="mb-3">
                <label for="name" class="form-label">Full Name</label>
                <input type="text" class="form-control" name="name" id="name">
            </div>
            <div class="mb-3">
                <label for="specialization" class="form-label">Specialization</label>
                <input type="text" class="form-control" name="specialization" id="specialization">
            </div>
            <div class="mb-3">
                <label for="designation" class="form-label">designation</label>
                <input type="text" class="form-control" name="designation" id="designation">
            </div>
            <div class="mb-3">
                <label for="phone" class="form-label">phone</label>
                <input type="text" class="form-control" name="phone" id="phone">
            </div>
            <div class="mb-3">
                <label for="description" style="color: darkblue" class="form-label  fs-5">Description</label>
                <textarea class="form-control" id="description" placeholder="Please write your description under 2000 characters" name="description" rows="8" required></textarea>
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