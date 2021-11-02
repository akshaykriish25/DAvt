 <script language="javascript">
function myvalidate()
{
	console.log("Form Validation Started");//right click browser->inspect->console tab
	if(document.form1.a1.value=="")
	{
	alert("Please Enter Id");
	document.form1.a1.focus();
	return false;
	}
	if(document.form1.b1.value=="")
	{
	alert("Please Enter Name");
	document.form1.b1.focus();
	return false;
	}
	if(document.form1.c1.value=="")
	{
	alert("Please Enter Email");
	document.form1.c1.focus();
	return false;
	}
	if(document.form1.d1.value=="")
	{
	alert("Please Enter Experience");
	document.form1.d1.focus();
	return false;
	}		
	return true;
}
</script>
<body>
<h1>
<form name="form1" action="app_addController" method="post" onsubmit="return myvalidate()">
Id:<input type="text" name="a1"><p>
Name:<input type="text" name="b1"><br><p>
Email:<input type="text" name="c1"><br><p>
Experience:<input type="text" name="d1"><br><p>
<label for="role">Role:</label>
  <select name="role" id="role">
    <option value="SE">Software Engineer</option>
    <option value="SD">Software Developer</option>
    <option value="Fresher">Fresher</option>
  </select>
  <br><br>
<label for="skill">Skills:</label>
  <select name="skill" id="skill">
    <option value="JS">JavaScript</option>
    <option value="Python">Python</option>
    <option value="Java">Java</option>
    <option value="PHP">PHP</option>
  </select>
  <br><br>

<input type="submit" value="Submit">
<input type="reset" value="Clear">
</form>