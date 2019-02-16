package com.example.marioandres.playermusic;

import android.content.Context;
import android.widget.MediaController;
//Este contiene la interfaz ddonde se podra hacer play, shuffle, mover el
//cursor para reiniciar la cancion y pausar
public class MusicController extends MediaController {
    public MusicController(Context context) {
        super(context);
    }
    public void hide(){

    }
}
