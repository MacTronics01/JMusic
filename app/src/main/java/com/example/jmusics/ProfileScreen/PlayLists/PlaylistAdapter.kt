package com.example.jmusics.ProfileScreen.PlayLists

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jmusics.R

class PlaylistAdapter(private val playList:ArrayList<PlaylistUser>): RecyclerView.Adapter<PlaylistAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.imageView6)
        var song: TextView = itemView.findViewById(R.id.textView14)
        var numSong: TextView = itemView.findViewById(R.id.textView15)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.play_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val track = playList[position]
        holder.image.setImageResource(track.getImage()!!)
        holder.song.text = track.getSong()
        holder.numSong.text = track.getNumSong()

    }

    override fun getItemCount(): Int {
        return playList.size
    }
}