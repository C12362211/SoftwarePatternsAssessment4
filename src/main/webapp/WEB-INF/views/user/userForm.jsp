<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

          <form:input path="id" type="hidden" />
      </fieldset>
</form:form>