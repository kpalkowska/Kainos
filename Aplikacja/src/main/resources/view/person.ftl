<#include "view.ftl">
<html>
<head>
<@page_head/>

    <title>Tron Game</title>

</head>

<body>

<@page_body/>

    <div class="container-fluid bg-1 text-center">
        <h3 id="personName">Hello ${person.name} !</h3>
        <img src="/image/game.png" class="img-rounded" style="display:inline" alt="Game" width="350" height="350">
        <h4>Website is under construction</h4>
        <h4>Please come back later</h4>
        
		 <form class="form-group form-group-sm " role="form">
			<div class="form-group col-xs-2  col-md-offset-5">
			  <label for="pwd">Nick:</label>
			  <input class="form-control" id="Nick" type="text" placeholder="Your Nick">
			  </br>
			  	<button type="button" class="btn btn-default btn-sm" onclick="nickChange()">Play!</button>
			  </div>		
		</form>
        </div> 
        
 		
      <#include "footer.ftl">
</body>
</html>