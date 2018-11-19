package com.example.enem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enem)

        var btnMat = findViewById<Button>(R.id.btMat)
        var btnCh = findViewById<Button>(R.id.btHumanas)
        var btnCn = findViewById<Button>(R.id.btNatu)
        var btnPor = findViewById<Button>(R.id.btPort)

        btnMat.setOnClickListener{
            val telaNova = Intent(this,TelaDisciplina::class.java)
            telaNova.putExtra("disciplina","mat")
            telaNova.putExtra("tela","MainActivity")
            startActivity(telaNova)
        }
        btnCh.setOnClickListener{
            val telaNova = Intent(this,TelaDisciplina::class.java)
            telaNova.putExtra("disciplina","ch")
            startActivity(telaNova)
        }

        btnCn.setOnClickListener{
            val telaNova = Intent(this,TelaDisciplina::class.java)
            telaNova.putExtra("disciplina","cn")
            startActivity(telaNova)
        }

        btnPor.setOnClickListener{
            val telaNova = Intent(this,TelaDisciplina::class.java)
            telaNova.putExtra("disciplina","port")
            startActivity(telaNova)
        }


    }

}
