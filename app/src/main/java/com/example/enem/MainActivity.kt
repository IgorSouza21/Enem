package com.example.enem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enem)

        var btnMat = findViewById(R.id.btMat) as Button

        btnMat.setOnClickListener{
            val telaNova = Intent(this,TelaDisciplina::class.java)
            telaNova.putExtra("disciplina","matematica")
            startActivity(telaNova)
        }

    }

}
