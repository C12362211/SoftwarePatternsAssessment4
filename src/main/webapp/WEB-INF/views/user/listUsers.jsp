<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List Of Users</title>

<link rel="stylesheet" href='<c:url value="/web-resources/css/pure-0.4.2.css"/>'>

<link rel="stylesheet"
       href='<c:url value="/web-resources/css/font-awesome-4.0.3/css/font-awesome.css"/>'>
<link rel="stylesheet" 
       href='<c:url value="/web-resources/css/jquery-ui-1.10.4.custom.css"/>'>
<style type="text/css">
  th {
       text-align: left
  }

</style>
</head>

<body>
   <div style="width: 95%; margin: 0 auto;">
       
        <!-- div id="userDialog" style="display: none;">
            <%@ include file="userForm.jsp"%>
            <%@ include file="userLoginForm.jsp"%>
        </div-->

        <h1>Create Account or Login</h1>

        
     
<c:url var="actionUrl" value="save" />

<form:form id="userForm" commandName="user" method="post"
       action="${actionUrl }" class="pure-form pure-form-aligned">

     <fieldset>
          <legend></legend>

          <div class="pure-control-group">
              <label for="name">Name</label>
              <form:input path="name" placeholder="User Name" />
          </div>
          <div class="pure-control-group">
               <label for="email">Email</label>
               <form:input path="email" placeholder="Email" maxlength="15" />
          </div>
          <div class="pure-control-group">
              <label for="password">Password</label>
              <form:input path="password" placeholder="Password" maxlength="10" />
          </div>
          <div class="pure-control-group">
              <label for="address">Address</label>
              <form:input path="address" placeholder="Address" />
          </div>
          <div class="pure-control-group">
              <label for="payMethod">Payment Method</label>
              <form:input path="payMethod" placeholder="Payment Method" />
          </div>
          
          <div class="pure-control-group">
          <button class="pure-button pure-button-primary" onclick="addUser()">
            <i class="fa fa-plus"></i> Create Account
         </button>
         </div>

          <form:input path="id" type="hidden" />
      </fieldset>
</form:form>

<c:url var="actionUrl" value="login" />

<form:form id="userLoginForm" commandName="user" method="post"
       action="${actionUrl }" class="pure-form pure-form-aligned">

     <fieldset>
          <legend></legend>

          <div class="pure-control-group">
               <label for="email">Email</label>
               <form:input path="email" placeholder="Email" maxlength="15" />
          </div>
          <div class="pure-control-group">
              <label for="password">Password</label>
              <form:input path="password" placeholder="Password" maxlength="10" />
          </div>
          <div class="pure-control-group">
          <button class="pure-button pure-button-primary" onclick="addUser()">
            <i class="fa fa-plus"></i> Login
         </button>
         </div>

          <form:input path="id" type="hidden" />
      </fieldset>
</form:form>

     <!--  It is advised to put the <script> tags at the end of the document body so that they don't block rendering of the page -->
     
    <script type="text/javascript"
       src='<c:url value="/web-resources/js/lib/jquery-1.10.2.js"/>'></script>
    <script type="text/javascript"
       src='<c:url value="/web-resources/js/lib/jquery-ui-1.10.4.custom.js"/>'></script>
    <script type="text/javascript"
       src='<c:url value="/web-resources/js/lib/jquery.ui.datepicker.js"/>'></script>
    <script type="text/javascript"
       src='<c:url value="/web-resources/js/js-for-listUsers.js"/>'></script>
</body>
</html> 