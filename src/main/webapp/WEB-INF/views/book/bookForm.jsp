<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="actionUrl" value="save" />

<form:form id="bookForm" commandName="book" method="post"
       action="${actionUrl }" class="pure-form pure-form-aligned">

     <fieldset>
          <legend></legend>

          <div class="pure-control-group">
              <label for="title">Title</label>
              <form:input path="title" placeholder="Book Title" />
          </div>
          <div class="pure-control-group">
               <label for="author">Author</label>
               <form:input path="author" placeholder="Author" maxlength="15" />
          </div>
          <div class="pure-control-group">
              <label for="price">Price</label>
              <form:input path="price" placeholder="Price" maxlength="10" />
          </div>
          <div class="pure-control-group">
              <label for="category">Category</label>
              <form:input path="category" placeholder="Category" />
          </div>
          <div class="pure-control-group">
              <label for="image">Image</label>
              <form:input path="image" placeholder="Image" />
          </div>

          <form:input path="id" type="hidden" />
      </fieldset>
</form:form>