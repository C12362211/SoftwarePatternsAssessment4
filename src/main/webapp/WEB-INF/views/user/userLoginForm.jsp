<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

          <form:input path="id" type="hidden" />
      </fieldset>
</form:form>