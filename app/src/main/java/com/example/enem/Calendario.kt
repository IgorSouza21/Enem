package com.example.enem

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.tela_disciplina_calendario.*


class Calendario() : AppCompatActivity() {
    val manager = supportFragmentManager
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menu ->
        when(menu.itemId){
            R.id.nav_calender ->{
                createFragmentCalendario()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_list ->{
                createFragmentListaAtividades()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_add_alarm ->{
                createFragmentAddAlarme()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_disciplina_calendario)
        main_nav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        createFragmentCalendario()

    }

    fun createFragmentCalendario(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentCalendario()
        transaction.replace(R.id.main_frame,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createFragmentListaAtividades(){
        val transaction = manager.beginTransaction()
        val fragment = ListaAtividades()
        transaction.replace(R.id.main_frame,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createFragmentAddAlarme(){
        val transaction = manager.beginTransaction()
        val fragment = AddAlarme()
        transaction.replace(R.id.main_frame,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}