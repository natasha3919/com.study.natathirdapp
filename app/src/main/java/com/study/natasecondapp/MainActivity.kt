package com.study.natasecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Как романтику свойственно всякому,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Я образ идеала женского в душе создал.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "И пусть меняет время людей и судьбы,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Но образ мечтаний моих со мною навеки!")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "И меня по утрам теперь будит,\n" +
                "угрожая разводом,")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Если еще раз домой приду с пьяной рожей.")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}