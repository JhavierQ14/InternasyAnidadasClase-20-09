package com.example.internasyanidadascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etn_Num1:EditText?=null
    // otra forma es
    lateinit var etn_Num2:EditText
    lateinit var tv_Resultado:TextView
    lateinit var rb_Suma: RadioButton
    lateinit var rb_Resta:RadioButton
    lateinit var rb_Multiplicacion:RadioButton
    lateinit var rb_Divicion:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //claseAnidadasyInternas()
        etn_Num1=findViewById(R.id.etn_Valor1)
        etn_Num2=findViewById(R.id.etn_Valor2)
        tv_Resultado=findViewById(R.id.tv_Resultado)
        rb_Suma =findViewById(R.id.rb_Suma)
        rb_Resta =findViewById(R.id.rb_Resta)
        rb_Multiplicacion =findViewById(R.id.rb_Multi)
        rb_Divicion =findViewById(R.id.rb_Division)
    }
    fun Calcular(vista:View){
        val valor1_String=etn_Num1?.text.toString()
        val valor2_String=etn_Num2.text.toString()

        var num1 = valor1_String.toInt()
        var num2 = valor2_String.toInt()

        if(rb_Suma.isChecked==true){
            val suma = num1+num2

            val resultado = suma.toString()
            tv_Resultado.setText(resultado)
        }else if(rb_Resta.isChecked==true){
            val resta = num1-num2

            val resultado = resta.toString()
            tv_Resultado.setText(resultado)
        }else if(rb_Divicion.isChecked==true){
            if(num2 != 0 && num1 != 0){
                val divicion = num1/num2

                val resultado = divicion.toString()
                tv_Resultado.setText(resultado)}else{
                Toast.makeText(this, "valor indefinido", Toast.LENGTH_SHORT).show()
            }
        }else if(rb_Multiplicacion.isChecked==true) {
            val multiplicacion = num1*num2

            val resultado = multiplicacion.toString()
            tv_Resultado.setText(resultado)
        }else{
            Toast.makeText(this, "Seleccione una opcion", Toast.LENGTH_LONG).show()
        }

    }

    private fun claseAnidadasyInternas (){

        //Clase anidada (nested class)
        val miClaseAnidada = miClaseAnidadayInterna.miClaseAnidada()
        val sumarDosNumeros = miClaseAnidada.suma(n1 = 21, n2 = 19)
        println("El resultado de la suma es $sumarDosNumeros")


        //Clase interna
        val miClaseInterna1 = miClaseAnidadayInterna().miClaseInterna()
        val  sumarDos = miClaseInterna1.sumarDos(4)
        println("El resultado de la suma dos es $sumarDos")
    }


    fun Calculadora (vista:View){


        val valor1_String = etn_Num1?.text.toString()
        val valor2_String = etn_Num2.text.toString()

        val valor1_Int = valor1_String.toInt()
        val valor2_Int = Integer.parseInt(valor2_String)

        val suma = valor1_Int+valor2_Int
        val resultado = suma.toString()
        tv_Resultado.setText(resultado)
    }

}