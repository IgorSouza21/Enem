package com.example.enem

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_enem.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enem)

        btMat.setOnClickListener{
            val telaNova = Intent(this,Calendario::class.java)
            telaNova.putExtra("disciplina","mat")
            startActivity(telaNova)
        }
        btHumanas.setOnClickListener{
            val telaNova = Intent(this,Calendario::class.java)
            telaNova.putExtra("disciplina","ch")
            startActivity(telaNova)
        }

        btNatu.setOnClickListener{
            val telaNova = Intent(this,Calendario::class.java)
            telaNova.putExtra("disciplina","cn")
            startActivity(telaNova)
        }

        btPort.setOnClickListener{
            val telaNova = Intent(this,Calendario::class.java)
            telaNova.putExtra("disciplina","port")
            startActivity(telaNova)
        }
    }
}
