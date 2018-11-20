package com.example.enem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TelaDisciplina : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_disciplina)
        var tvDisc = findViewById<TextView>(R.id.tvDisciplina)
        var disc = intent.getStringExtra("disciplina")
//        var telaAnterior = intent.getStringExtra("tela")
        var btnCalendario = findViewById<Button>(R.id.btCalendario)
        var btnVoltar = findViewById<Button>(R.id.btVoltar)
        if (disc == "mat"){
//            Para Internacionalização
            tvDisc.setText(R.string.btMat)
        }else if(disc == "cn"){
            tvDisc.setText(R.string.btNat)
        }else if(disc == "ch"){
            tvDisc.setText(R.string.btHum)
        }else if(disc == "port"){
            tvDisc.setText(R.string.btPort)
        }else{

        }
//      TODO Fazer com que saiba qual a última tela aberta para voltar a ela
        btnVoltar.setOnClickListener {
            val voltar = Intent(this, MainActivity::class.java)
            startActivity(voltar)
        }


    }
}
