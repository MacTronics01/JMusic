package com.example.jmusics.ProfileScreen.PlayLists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jmusics.ProfileScreen.PlayLists.Followers.FollowersUsers
import com.example.jmusics.ProfileScreen.PlayLists.Followers.FolowersAdapters
import com.example.jmusics.ProfileScreen.PlayLists.PlaylistAdapter
import com.example.jmusics.ProfileScreen.PlayLists.PlaylistUser
import com.example.jmusics.ProfileScreen.PlayLists.TopTrack.TrackAdapter
import com.example.jmusics.ProfileScreen.PlayLists.TopTrack.TrackUser
import com.example.jmusics.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val track=findViewById<RecyclerView>(R.id.tracklist)
        val top_playlist=findViewById<RecyclerView>(R.id.playlist)
        val followers_playlist=findViewById<RecyclerView>(R.id.followerslist)

        track.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        top_playlist.layoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        followers_playlist.layoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val details=ArrayList<TrackUser>()
        val detailsPlaylist=ArrayList<PlaylistUser>()
        val detailsFollowerslist=ArrayList<FollowersUsers>()

        details.add(TrackUser(R.drawable.track1,"Wiskid","Love me more","200","5069","90",))
        details.add(TrackUser(R.drawable.track1,"Wiskid","Love me more","200","5069","90",))
        details.add(TrackUser(R.drawable.track1,"Wiskid","Love me more","200","5069","90",))
        details.add(TrackUser(R.drawable.track3,"Wiskid","I likse you","599","7860","70",))
        details.add(TrackUser(R.drawable.track3,"Wiskid","I likse you","599","7860","70",))
        details.add(TrackUser(R.drawable.track3,"Wiskid","I likse you","599","7860","70",))
        details.add(TrackUser(R.drawable.track5,"Wiskid","Kiss me baby","1000","5432","50",))
        details.add(TrackUser(R.drawable.track5,"Wiskid","Kiss me baby","1000","5432","50",))
        details.add(TrackUser(R.drawable.track5,"Wiskid","Kiss me baby","1000","5432","50",))

        detailsPlaylist.add(PlaylistUser(R.drawable.track3,"One2Watch","41"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track5,"GRW FRESHOUT","70"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))
        detailsPlaylist.add(PlaylistUser(R.drawable.track1,"GRW RATED PLAYLIST","100"))

        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))
        detailsFollowerslist.add(FollowersUsers(R.drawable.track3,"Elico1","200"))

        val adapter1= TrackAdapter(details)
        track.adapter=adapter1

        val adapter2= PlaylistAdapter(detailsPlaylist)
        top_playlist.adapter=adapter2

        val adapter3= FolowersAdapters(detailsFollowerslist)
        followers_playlist.adapter=adapter3

    }
}