package com.example.enem

import android.content.Intent
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enem)

        var btnMat = findViewById(R.id.btMat) as Button

        btnMat.setOnClickListener{
            val telaNova = Intent(this,TelaDisciplina::class.java)
            startActivity(telaNova)
        }

    }

}
