package com.example.jmusics.Followers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jmusics.PlayLists.PlaylistAdapter
import com.example.jmusics.R
import de.hdodenhof.circleimageview.CircleImageView

class FolowersAdapters(private val followersList:ArrayList<FollowersUsers>): RecyclerView.Adapter<FolowersAdapters.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var profilepic: CircleImageView = itemView.findViewById(R.id.circleImageView2)
        var username: TextView = itemView.findViewById(R.id.textView17)
        var numoffollowers: TextView = itemView.findViewById(R.id.textView17)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.followers_card, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: FolowersAdapters.ViewHolder, position: Int) {
        val followers = followersList[position]
        holder.profilepic.setImageResource(followers.getprofile_pic()!!)
        holder.username.text = followers.getusername()
        holder.numoffollowers.text = followers.getnumoffollowers()
    }
    override fun getItemCount(): Int {
        return followersList.size
    }
}