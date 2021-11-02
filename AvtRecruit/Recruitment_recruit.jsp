<body >
<input type="button" value="<-Back" onclick="history.back()" >
<h1>
<form name="form1" action="RecruitmentController" method="post" 
>
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
<input type="submit" value="Search">
<input type="reset" value="Clear">
</form>