package com.example.navegacaoentretelas

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main02.*


class MainActivity02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main02)

        val i = intent
        val conteudoIntent = i.getStringExtra("chaveIntent")
        saidaIntent.text = conteudoIntent


        val sp = getSharedPreferences("shared",0)
        val name = sp.getString("info", "erro :(")
        saidaShared.text = name


    }

    fun voltarPagina(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)}
}