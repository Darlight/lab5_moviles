package com.example.marioandres.playermusic;
/*
Codigo extraido de:
https://code.tutsplus.com/tutorials/create-a-music-player-on-android-project
-setup--mobile-22764
*/
public class Song {
    //Es la instancia de cualquier tipo de cancion
    //Siempre llevare estos parametros para clasificar cada cancion
    private long id;
    private String title;
    private String artist;
    public Song(long songID, String songTitle, String songArtist) {
        //Constructor de la cancion
        id=songID;
        title=songTitle;
        artist=songArtist;
    }
    //Getters utilizando java, en kotilin seria mas sencillo, pero
    //pero todavia me cuesta la traduccion de java a Kotlin - Mario
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
}
