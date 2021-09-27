package com.example.jmusics.PlayLists

class PlaylistUser(image:Int,song:String,numSong:String) {

    private var image:Int
    private var song:String
    private var numSong:String

    init {
        this.image=image
        this.song=song
        this.numSong=numSong
    }
    fun getImage(): Int?{
        return image
    }
    fun setImage(image: Int){
        this.image = image
    }

    fun getSong(): String?{
        return song
    }
    fun setSong(song: String){
        this.song = song
    }

    fun getNumSong(): String?{
        return numSong
    }
    fun setNumSong(numSong: String){
        this.numSong = numSong
    }


}