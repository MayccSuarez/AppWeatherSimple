package com.maycc.appweather

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addListenerBtnMadridWeather()
        addListenerBtnLojaWeather()
    }

    private fun addListenerBtnMadridWeather() {
        btnMadridWeather.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, WeatherActivity::class.java)

            startActivity(intent)
        })
    }

    private fun addListenerBtnLojaWeather() {
        btnLojaWeather.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, WeatherActivity::class.java)

            startActivity(intent)
        })
    }
}
