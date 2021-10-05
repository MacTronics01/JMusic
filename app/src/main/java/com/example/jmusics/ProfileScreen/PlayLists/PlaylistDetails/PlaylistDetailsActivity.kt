package com.example.jmusics.ProfileScreen.PlayLists.PlaylistDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jmusics.R

class PlaylistDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.playlist_details)

        val playlistDetail=findViewById<RecyclerView>(R.id.playlist_details)

        playlistDetail.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val PlaylistDetail=ArrayList<PlaylistDetailsUsers>()

        playlistDetail=


    }
}