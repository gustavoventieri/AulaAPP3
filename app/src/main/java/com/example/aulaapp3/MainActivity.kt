package com.example.aulaapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEnderço:EditText = findViewById(R.id.edtEndereço)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCep:EditText = findViewById(R.id.edtCep)
        val edtCidade:EditText = findViewById(R.id.edtCidade)
        val edtEstado:EditText = findViewById(R.id.edtEstado)

        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener {

            val texto:String = edtNome.text.toString() +  edtEnderço.text.toString() + edtBairro.text.toString() + edtCep.text.toString() +  edtCidade.text.toString() + edtEstado.text.toString()
            val toast = Toast.makeText(this, texto, Toast.LENGTH_SHORT)
            toast.show()

        }



    }
}