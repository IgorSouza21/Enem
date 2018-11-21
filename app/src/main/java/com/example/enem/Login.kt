package com.example.enem
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.NullPointerException

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btLogin = findViewById<Button>(R.id.btLogin)
        var login = findViewById<EditText>(R.id.etNome)
        var senha = findViewById<EditText>(R.id.etSenha)
        btLogin.setOnClickListener {
            try{
                if(login.text.toString().equals("admin") && senha.text.toString().equals("admin")) {
                    var telaNova = Intent(this, MainActivity::class.java)
                    startActivity(telaNova)
                }else{
                    chamarAlerta()
                }
            }catch (e: NullPointerException) {
                chamarAlerta2()
            }
        }
    }

    fun chamarAlerta(){
        var alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle(R.string.alertTitle)
        alertDialog.setMessage(R.string.alertMessage)
        alertDialog.setNeutralButton( "OK") { _, _ ->

            Toast.makeText(this, "Tente Novamente",Toast.LENGTH_LONG).show()
        }
        alertDialog.show()
    }

    fun chamarAlerta2(){
        var alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle(R.string.alertTitle)
        alertDialog.setMessage(R.string.alertMessage2)
        alertDialog.setNeutralButton( "OK") { _, _ ->

            Toast.makeText(this, "Tente Novamente",Toast.LENGTH_LONG).show()
        }
        alertDialog.show()
    }

}