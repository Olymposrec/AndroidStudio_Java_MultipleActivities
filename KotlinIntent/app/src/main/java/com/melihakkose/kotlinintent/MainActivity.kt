package com.melihakkose.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate Called!")

    }

    override fun onResume() {
        super.onResume()
        println("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        println("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Called")
    }

    fun next(view: View){
        //Intent olusturma
        val intent= Intent(applicationContext,MainActivity2::class.java)

        //Intent ile veri gonderme
        intent.putExtra("username",editTextUsername.text.toString())
        intent.putExtra("name",editTextName.text.toString())

        editTextName.text.clear()
        editTextName.hint="Name"
        editTextUsername.text.clear()
        editTextUsername.hint="Username"
        //Intent baslatma
        startActivity(intent)
        finish()
    }
}