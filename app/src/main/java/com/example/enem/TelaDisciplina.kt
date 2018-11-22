package com.example.enem

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tela_disciplina.*

class TelaDisciplina : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_disciplina)

        val disc = intent.getStringExtra("disciplina")
//        var telaAnterior = intent.getStringExtra("tela")

        when (disc) {
            "mat" -> //            Para Internacionalização
                tvDisciplina.setText(R.string.btMat)
            "cn" -> tvDisciplina.setText(R.string.btNat)
            "ch" -> tvDisciplina.setText(R.string.btHum)
            "port" -> tvDisciplina.setText(R.string.btPort)
            else -> {

            }
        }
//      TODO Fazer com que saiba qual a última tela aberta para voltar a ela
        btVoltar.setOnClickListener {
            val voltar = Intent(this, MainActivity::class.java)
            startActivity(voltar)
        }

        btCalendario.setOnClickListener {
            val calendar = Intent(this,Calendario::class.java)
            startActivity(calendar)
        }


    }
}
