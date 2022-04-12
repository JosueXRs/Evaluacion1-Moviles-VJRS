package com.tecsup.rodriguezapp.vistas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.tecsup.rodriguezapp.MainActivity
import com.tecsup.rodriguezapp.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity: AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val listaOpciones = arrayOf("A: 30% T + 70% L","B: 40% T + 60% L","C: 50% T + 50% L")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val actionBar = supportActionBar
        actionBar?.setDisplayShowHomeEnabled(true)
        title = "Calculadora del Trica  -  VJRS"

        spinnerEvaluacion.onItemSelectedListener = this
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaOpciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerEvaluacion.adapter = adapter


    }
    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
    }
    override fun onNothingSelected(p0: AdapterView<*>?) {
    }
}