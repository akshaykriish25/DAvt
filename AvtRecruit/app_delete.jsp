<script>
function myvalidate()
{
	console.log("Form Validation Started");//right click browser->inspect->console tab
	if(document.form1.n1.value=="")
	{
	alert("Please Enter ID");
	document.form1.n1.focus();
	return false;
	}
	return true;
	}
</script>
<body>
<h1>
<form name="form2" action="app_deleteController" method="post" 
onsubmit="return myvalidate()">
Enter ID:<input type="text" name="n1"><br><p>
<input type="submit" value="Delete">
<input type="reset" value="Clear">
</form>
</h1>
</body>