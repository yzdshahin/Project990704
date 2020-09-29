
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registering Page</title>
        <script> 
function validate()
{ 
     var name = document.form.name.value;
     var password = document.form.password.value;
     var conpassword= document.form.conpassword.value;      //  badan bara confirm pass :))))
     var father = document.form.father.value; 
     var birth = document.form.birth.value;
     var gender = document.form.gender.value;
     
    
     
     if (name==null || name=="")
     { 
     alert("Full Name can't be blank"); 
     return false; 
     }
     else if (password==null || password=="")
     { 
     alert("Password can't be blank"); 
     return false; 
     }
     else if (father==null || father=="")
     { 
     alert("Father name can't be blank"); 
     return false; 
     }
     else if(birth==null || birth=="")
     { 
     alert("birth can't be blank"); 
     return false; 
     } 
      else if(gender==null || gender=="")
     { 
     alert("Gender can't be blank"); 
     return false; 
     } 
     else if (password!=conpassword)
     { 
     alert("Confirm Password should match with the Password"); 
     return false; 
     } 
 } 
</script> 
    </head>
    <body>
           <center><h2> Registration application</h2></center>
                
        <form action="LoginControl" method="pot" onsubimt="return validate()">  
  
Name:<input type="text" name="name"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
Conform password:<input type="password" name="conpassword"/><br/><br/>
Father:<input type="text" name="father"/><br/><br/>  
Birth: <input type="date" name="birth"/><br/><br/>  
Gender:  
<select name="gender">  
<option>male</option>  
<option>female</option>  
</select>  
  
<br/><br/>  

<input type="submit" value="submit"/>  
  
        </form>  
    </body>
    
</html>