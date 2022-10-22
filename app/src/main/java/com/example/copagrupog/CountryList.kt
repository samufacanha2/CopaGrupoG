package com.example.copagrupog

class CountryList {
    private var countryList: ArrayList<Country>? = null

    init {
        var countryList = ArrayList<Country>()

        var brazilPlayers = ArrayList<Player>()

        brazilPlayers.add(Player("Alisson", ArrayList<String>(),ArrayList<String>() ,ArrayList<String>() ,0, "", "" ))
        countryList.add(Country("Brasil", "brasil",  brazilPlayers))

        this.countryList = countryList
    }

    fun getCountryList(): ArrayList<Country> {
        return countryList!!
    }


}