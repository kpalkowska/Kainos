/*
window.alert('hey!');
<<<<<<< HEAD
if (nickValue == null) {
	
}
=======


if (nickValue == null) {
	
}

>>>>>>> origin/master
function nickChange() {		
				//var nickValue = document.getElementById('Nick').value
				window.location = "/?name="+nickValue;
*/
if (document.URL.indexOf("?name") <= 0) {
	nickValue = null 
	nickValue = window.prompt("Type your nick here.","Your Nick");
    window.location = "/?name="+nickValue;
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
