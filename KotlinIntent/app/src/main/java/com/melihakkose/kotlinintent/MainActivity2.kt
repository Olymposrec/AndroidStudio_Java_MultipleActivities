package com.melihakkose.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Get Intent methodu (Bu intent ile onceki intent de put yaptigimiz verileri alacagiz)
        val intent=intent
        textViewUsername.text="Username: " +intent.getStringExtra("username")
        textViewName.text="Name: " +intent.getStringExtra("name")

    }



    fun goBack(view:View){
        //Intent olusturma
        val intent= Intent(applicationContext,MainActivity::class.java)

        textViewName.text="Name: "
        textViewUsername.text="Username: "

        //Intent baslatma
        startActivity(intent)



    }
}