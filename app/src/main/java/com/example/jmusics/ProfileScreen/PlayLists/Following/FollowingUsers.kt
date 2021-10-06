package com.example.jmusics.ProfileScreen.PlayLists.Following

class FollowingUsers (profile_pic:Int, name:String, nooffollowers:String){
    private var profile_pic:Int
    private var name:String
    private var nooffollowers:String

    init {
        this.profile_pic = profile_pic
        this.name = name
        this.nooffollowers = nooffollowers
    }

    fun getprofile_pic(): Int?{
        return profile_pic
    }
    fun setprofile_pic(profile_pic: Int){
        this.profile_pic = profile_pic
    }

    fun name(): String?{
        return name
    }
    fun name(name: String){
        this.name = name
    }
    fun getnooffollowers(): String?{
        return nooffollowers
    }
    fun setnooffollowers(numoffollowers: String){
        this.nooffollowers = nooffollowers
    }
}