package com.example.internasyanidadascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.view.WindowId
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import java.text.FieldPosition

class ListViewApp : AppCompatActivity() {
    private var lvLenguajes:ListView?=null
    private var tvSeleccion:TextView?=null


    private val lenguajes = arrayOf("Kotlin","Java","C++","C#","PHP","VB.net")
    private val  posicion = arrayOf("1","6","3","2","4","5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_app)

        lvLenguajes=findViewById(R.id.lv_Lenguajes)
        tvSeleccion=findViewById(R.id.tv_Seleccion)

        var  adaptador:ArrayAdapter <String> = ArrayAdapter<String>(this,R.layout.nuevo,lenguajes)
        lvLenguajes?.adapter=adaptador

        lvLenguajes?.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id:  Long
            ) {
                tvSeleccion?.text="La posición del lenguaje ${lvLenguajes?.getItemAtPosition(position)} es ${posicion[position]}"

            }


        }
    }
}