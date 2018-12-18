<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>

    <link href="/css/index.css" rel="stylesheet" />

</head>
<body>
<center>
    <img src="/images/logo.png" />
    <h1 id="title">${title}</h1>
</center>

<script type="text/javascript" src="/webjars/jquery/2.1.4/dist/jquery.js"></script>

<script>
    $(function(){
        $('#title').click(function(){
            alert('点击了');
        });
    })
</script>
</body>
</html>
