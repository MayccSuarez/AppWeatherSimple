package com.maycc.appweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val city = intent.getStringExtra("CIUDAD")

        when (city) {
            "MADRID" -> showMadridWeather()
            "lOJA"   -> showLojaWeather()
        }
    }

    private fun showMadridWeather() {

    }

    private fun showLojaWeather() {

    }

}
