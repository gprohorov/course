<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Student</title>
</head>
<body>
<h1>Create</h1>

<div style="width: 25%">
    <fieldset>
        <legend>Add student</legend>
        <form name="student" action="" method="POST">
            First name:<@spring.formInput "studentForm.name" "" "text"/>
            <br>
            Date of birth:<@spring.formInput "studentForm.dateOfBirth" "" "date"/>
            <br>
            Group:<@spring.formSingleSelect "studentForm.groupp", mavs, ""/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
</body>
</html>
