package com.example.copagrupog

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PlayerListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_disposal)

    }

    fun navigatePlayer(v: View) {
        val intent = Intent(this, PlayerDetailsActivity::class.java)
        startActivity(intent)
    }

}
