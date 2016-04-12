function addUser() {
       $('#userDialog').dialog("option", "title", 'Add User');
       $('#userDialog').dialog('open');
}

function login() {
    $('#userLoginDialog').dialog("option", "title", 'Login');
    $('#userLoginDialog').dialog('open');
}

function editUser(id) {

       $.get("get/" + id, function(result) {

              $("#userDialog").html(result);
              $('#userDialog').dialog("option", "name", 'Edit User');
              $("#userDialog").dialog('open');

              initializeDatePicker();
       });
}

function initializeDatePicker() {
       $(".datepicker").datepicker({
              dateFormat : "yy-mm-dd",
              changeMonth : true,
              changeYear : true,
              showButtonPanel : true
       });
}

function resetDialog(form) {

       form.find("input").val("");
}

$(document).ready(function() {

       $('#userDialog').dialog({

              autoOpen : false,
              position : 'center',
              modal : true,
              resizable : false,
              width : 440,
              buttons : {
                     "Save" : function() {
                           $('#userForm').submit();
                     },
                     "Cancel" : function() {
                           $(this).dialog('close');
                     }
              },
              close : function() {

                     resetDialog($('#userForm'));
                     $(this).dialog('close');
              }
       });
       
       $('#userLoginDialog').dialog({

           autoOpen : false,
           position : 'center',
           modal : true,
           resizable : false,
           width : 440,
           buttons : {
                  "Save" : function() {
                        $('#userLoginForm').submit();
                  },
                  "Cancel" : function() {
                        $(this).dialog('close');
                  }
           },
           close : function() {

                  resetDialog($('#userLoginForm'));
                  $(this).dialog('close');
           }
    });

       initializeDatePicker();
});