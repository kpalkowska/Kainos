var Game_Over = {

    preload : function() {
        // Here we load all the needed resources for the level.
        // In our case, that's just two squares - one for the snake body and one for the apple.
        game.load.image('gameover', '/image/game_over1.jpg');
    },

    create : function() {
        
    	var image = game.add.sprite(0, 0, 'gameover');
        game.cache.getImage('gameover');
        
        textStyle = { font: "bold 60px sans-serif",fontStyle: "italic", fill: "#ff0000", align: "center" };
        
        var imgW = game.cache.getImage("gameover").width,
        imgH = game.cache.getImage("gameover").height;
     
        image.scale.setTo(1200/imgW ,600/imgH);
        
        image.inputEnabled = true;
        
       if (win ==2) game.add.text(400, 600/2,  "Wygrał gracz ZIELONY", textStyle);
       else if (win ==1) game.add.text(400, 600/2,  "Wygrał gracz BIAŁY", textStyle);
       else game.add.text(400, 600/2,  "REMIS", textStyle);
        image.events.onInputDown.add(this.startGame, this);

        
    },

    startGame: function () {

        // Change the state to the actual game.
        this.state.start('Game');

    }

};