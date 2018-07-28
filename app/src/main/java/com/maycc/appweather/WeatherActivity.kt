package com.maycc.appweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_weather.*

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val city = intent.getStringExtra("CIUDAD")

        when (city) {
            "MADRID" -> loadDataMadridWeather()
            "LOJA"   -> loadDataLojaWeather()
        }
    }

    private fun loadDataMadridWeather() {
        val madrid = City("Madrid", 30, "Soleado")

        showWeatherCurrentCity(madrid)
    }

    private fun loadDataLojaWeather() {
        val loja = City("Loja", 18, "Parcialmente nublado")

        showWeatherCurrentCity(loja)
    }

    private fun showWeatherCurrentCity(city: City) {
        tvCityName.text    = city.name
        tvTemperature.text = "${city.temperature}°"
        tvDescription.text = city.description
    }

}
