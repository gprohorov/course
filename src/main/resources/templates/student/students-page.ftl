<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<h1> Hello Students</h1>

<div style="width: 800px; margin: 0 auto;">
    <table class="table table-success table-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Date of birth</th>
            <th>Delete</th>

        </tr>
        <#list students as student>
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.dateOfBirth}</td>
                <td><a href="/ui/students/delete/${student.id}"><button type="button" class="btn btn-danger">Del</button></a></td>

            </tr>
        </#list>
    </table>
</div>




</body>
</html>
