package com.example.navegacaoentretelas

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View) {
        val valor = entradaIntent.text.toString()



        val sp = getSharedPreferences("shared",0)
        val editor = sp.edit()
        editor.putString("info", entradaShared.text.toString())
        editor.apply()

        val i = Intent(this, MainActivity02::class.java)
        i.putExtra("chaveIntent", valor)
        startActivity(i)
    }
}