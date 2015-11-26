var Game_Over = {

    preload : function() {
        // Here we load all the needed resources for the level.
        // In our case, that's just two squares - one for the snake body and one for the apple.
        game.load.image('gameover', '/image/gameover1.png');
    },

    create : function() {
        
    	var image = game.add.sprite(0, 0, 'gameover');
        game.cache.getImage('gameover');
        
        var imgW = game.cache.getImage("gameover").width,
        imgH = game.cache.getImage("gameover").height;
     
        image.scale.setTo(1200/imgW ,600/imgH);
        
        image.inputEnabled = true;
        
        image.events.onInputDown.add(this.startGame, this);

    },

    startGame: function () {

        // Change the state to the actual game.
        this.state.start('Game');

    }

};