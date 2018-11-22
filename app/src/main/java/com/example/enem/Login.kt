package com.example.enem
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btLogin.setOnClickListener {
            try{
                if(etNome.text.toString() == "admin" && etSenha.text.toString() == "admin") {
                    val telaNova = Intent(this, MainActivity::class.java)
                    startActivity(telaNova)
                }else{
                    chamarAlerta()
                }
            }catch (e: NullPointerException) {
                chamarAlerta2()
            }
        }
    }

    private fun chamarAlerta(){
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle(R.string.alertTitle)
        alertDialog.setMessage(R.string.alertMessage)
        alertDialog.setNeutralButton( "OK") { _, _ ->

            Toast.makeText(this, "Tente Novamente",Toast.LENGTH_LONG).show()
        }
        alertDialog.show()
    }

    private fun chamarAlerta2(){
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle(R.string.alertTitle)
        alertDialog.setMessage(R.string.alertMessage2)
        alertDialog.setNeutralButton( "OK") { _, _ ->

            Toast.makeText(this, "Tente Novamente",Toast.LENGTH_LONG).show()
        }
        alertDialog.show()
    }

}