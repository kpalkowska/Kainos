var game;

var w = window.innerWidth * window.devicePixelRatio / 1.1,
h = window.innerHeight * window.devicePixelRatio / 1.1;

game = new Phaser.Game(w, h, Phaser.AUTO, 'mainContent');

game.state.add('Menu', Menu);
game.state.add('Game', Game);
game.state.add('Game_Over', Game_Over);

game.state.start('Menu');
 
var myButton = document.getElementById("clickButton");
var myText = document.getElementById("helloText");

myButton.addEventListener('click', doSomething, false)

function doSomething() {
	myText.textContent = "hello, world!";
}