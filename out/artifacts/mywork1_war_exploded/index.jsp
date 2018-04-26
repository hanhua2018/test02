<%--
  Created by IntelliJ IDEA.
  User: hh
  Date: 2018/4/15
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery.min.1.8.3.js"></script>
    <script type="text/javascript">
      $(document).ready(function(){
          $("#testButton").click(function(){
             alert("aa");
          });

      });

    </script>
  </head>
  <body>
  success!!!
  <div>${userInfoEntityList[0].uuid}</div>
  <input type="button" value="OK" id="testButton" />
  </body>
</html>
