package com.example.copagrupog

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlayerDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_details)

        val country = CountryList().getCountryList()[0]
        val player = country.players[0]

        val playerName: TextView = findViewById<TextView>(R.id.player_name)
        playerName.text = player.name

        val position: TextView = findViewById<TextView>(R.id.position_body)
        position.text = player.position

        val age: TextView = findViewById<TextView>(R.id.age_body)
        age.text = player.age.toString()



    }



}
