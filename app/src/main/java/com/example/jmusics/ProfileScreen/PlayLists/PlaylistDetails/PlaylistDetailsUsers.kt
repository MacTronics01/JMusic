package com.example.jmusics.ProfileScreen.PlayLists.PlaylistDetails

class PlaylistDetailsUsers(image:Int,song:String,artist:String) {

    private var image:Int
    private var song:String
    private var artist:String

    init {
        this.image=image
        this.song=song
        this.artist=artist
    }
    fun getImage():Int?{
        return image
    }
    fun setImage(image: Int){
        this.image=image
    }
    fun getSong():String?{
        return song
    }
    fun setSong(song: String){
        this.song=song
    }
    fun getArtist():String?{
        return artist
    }
    fun setArtist(artist: String){
        this.artist=artist
    }

}