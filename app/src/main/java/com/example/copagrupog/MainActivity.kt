package com.example.copagrupog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navigateTeamList(v: View) {
        val intent = Intent(this, PlayerListActivity::class.java)
        startActivity(intent)
    }
}