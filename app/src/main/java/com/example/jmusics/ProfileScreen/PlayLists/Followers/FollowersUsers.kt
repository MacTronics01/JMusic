package com.example.jmusics.ProfileScreen.PlayLists.Followers

class FollowersUsers(profile_pic:Int,username:String,numoffollowers:String) {
    private var profile_pic:Int
    private var username:String
    private var numoffollowers:String

    init {
        this.profile_pic=profile_pic
        this.numoffollowers=numoffollowers
        this.username=numoffollowers
}
    fun getprofile_pic(): Int?{
        return profile_pic
    }
    fun setprofile_pic(profile_pic: Int){
        this.profile_pic = profile_pic
    }

    fun getusername(): String?{
        return username
    }
    fun setusername(username: String){
        this.username = username
    }
    fun getnumoffollowers(): String?{
        return numoffollowers
    }
    fun setnumoffollowers(numoffollowers: String){
        this.numoffollowers = numoffollowers
    }
}