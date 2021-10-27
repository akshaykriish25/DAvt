<html>
<head>
<style>
fieldset {
width: 280px; 
background-color:lightgrey;
}
legend{
background-color: lightblue;
}
</style></head>
  <body>
    <h2>User Input Form</h2>
    <form action= "dispJsplogin.jsp" method="post">
      <fieldset>
        <legend>Personal Particular</legend>
        Name: <input type="text" name='name'/><br><br>
        Password: <input type="password" name="pwd" required/><br><br>
        Gender: <input type="radio" name="sex" value="male"/>Male
                <input type="radio" name="sex" value="female"/>Female<br><br>
        Age:
<select name="age" multiple size=2>
<option value="min">&lt; 18 year old</option>
<option value="adult">&gt; 18 year old</option>
</select>
<br />
      </fieldset>
      <fieldset>
      <legend>Languages</legend>
<input type="checkbox" name="lang" value="Java" /> Java
<input type="checkbox" name="lang" value="PHP" /> PHP
<input type="checkbox" name="lang" value="C" /> C
<br />
      </fieldset>
        <fieldset>
      <legend>Instruction</legend>
          <textarea rows="8" cols"50" name="inst" value="Enter your inst"></textarea>
            </fieldset>
      <input type=submit value=Send>
<input type=reset value=Clear><br><br>
    </form>
  </body>
</html>