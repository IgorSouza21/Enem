package com.example.enem

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout


class Calendario() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_disciplina_calendario)

        var mainNav = findViewById<BottomNavigationView>(R.id.main_nav)
        var mainFrame = findViewById<FrameLayout>(R.id.main_frame)

//        mainNav.setOnNavigationItemSelectedListener {
//
//        }

    }
}