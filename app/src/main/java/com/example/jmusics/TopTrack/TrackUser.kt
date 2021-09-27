package com.example.jmusics.TopTrack

class TrackUser(image:Int, artist:String,name_of_song:String,num_of_play:String,num_of_love:String,num_of_re_up:String)
{
    private var image:Int
    private var artist:String
    private var name_of_song:String
    private var num_of_play:String
    private var num_of_love:String
    private var num_of_re_up:String

    init {
        this.image=image
        this.artist=artist
        this.name_of_song=name_of_song
        this.num_of_play=num_of_play
        this.num_of_love=num_of_love
        this.num_of_re_up=num_of_re_up
    }
    fun getImage(): Int?{
        return image
    }
    fun setImage(image: Int){
      this.image = image
    }
fun getArtist(): String{
    return artist
}
fun setArtist(artist: String){
    this.artist = artist
}
    fun getname_of_song(): String{
        return name_of_song
    }
    fun setname_of_song(name_of_song: String){
        this.name_of_song = name_of_song
    }

    fun getnum_of_play(): String{
        return num_of_play
    }
    fun setnum_of_play(num_of_play: String){
        this.num_of_play = num_of_play
    }

    fun getnum_of_love(): String{
        return num_of_love
    }
    fun setnum_of_love(num_of_love: String){
        this.num_of_love = num_of_love
    }

    fun getnum_of_re_up(): String{
        return num_of_re_up
    }
    fun setnum_of_re_up(num_of_re_up: String){
        this.num_of_re_up = num_of_re_up
    }

}