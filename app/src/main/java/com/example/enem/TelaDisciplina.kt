package com.example.enem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TelaDisciplina : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_disciplina)
        var tvDisc = findViewById<TextView>(R.id.tvDisciplina)
        var disc = intent.getStringExtra("disciplina")
        if (disc == "matematica"){
            print(1)
        }else{
            print(2)
        }

    }
}
