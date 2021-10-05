package com.example.jmusics.ProfileScreen.PlayLists.TopTrack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jmusics.R

class TrackAdapter(private val trackList:ArrayList<TrackUser>): RecyclerView.Adapter<TrackAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var image:ImageView=itemView.findViewById(R.id.imageView2)
        var artist:TextView=itemView.findViewById(R.id.textView9)
        var song:TextView=itemView.findViewById(R.id.textView10)
        var numPlay:TextView=itemView.findViewById(R.id.textView11)
        var numLove:TextView=itemView.findViewById(R.id.textView12)
        var numReUp:TextView=itemView.findViewById(R.id.re_up)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.top_track_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val track=trackList[position]
        holder.image.setImageResource(track.getImage()!!)
        holder.artist.text=track.getArtist()
        holder.song.text=track.getname_of_song()
        holder.numPlay.text=track.getnum_of_play()
        holder.numLove.text=track.getnum_of_love()
        holder.numReUp.text=track.getnum_of_re_up()
    }

    override fun getItemCount(): Int {
        return trackList.size
    }
}