/*
window.alert('hey!');
if (nickValue == null) {
	
}
function nickChange() {		
				//var nickValue = document.getElementById('Nick').value
				window.location = "/?name="+nickValue;
*/
if (document.URL.indexOf("?name") <= 0) {
	nickValue = null 
	nickValue = window.prompt("Type your nick here.","Your Nick");
    window.location = "/?name="+nickValue;
}