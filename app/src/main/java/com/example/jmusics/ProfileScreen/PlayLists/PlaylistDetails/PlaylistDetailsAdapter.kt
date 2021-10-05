package com.example.jmusics.ProfileScreen.PlayLists.PlaylistDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jmusics.R

class PlaylistDetailsAdapter(private val pdList:ArrayList<PlaylistDetailsUsers>):RecyclerView.Adapter<PlaylistDetailsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var image:ImageView=itemView.findViewById(R.id.imageView13)
        var song:TextView=itemView.findViewById(R.id.textView26)
        var artist:TextView=itemView.findViewById(R.id.textView80)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.playlist_details_items,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val playlistdetails=pdList[position]
        holder.image.setImageResource(playlistdetails.getImage()!!)
        holder.song.text=playlistdetails.getSong()
        holder.artist.text=playlistdetails.getArtist()
    }
    override fun getItemCount(): Int {
        return pdList.size
    }
}
