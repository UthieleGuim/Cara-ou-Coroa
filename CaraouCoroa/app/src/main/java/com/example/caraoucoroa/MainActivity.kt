package com.example.caraoucoroa

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val caraButton = findViewById<Button>(R.id.caraButton)
        val coroaButton = findViewById<Button>(R.id.coroaButton)

        caraButton.setOnClickListener {
            jogarMoeda("cara")
        }

        coroaButton.setOnClickListener {
            jogarMoeda("coroa")
        }
    }

    private fun jogarMoeda(escolhaUsuario: String) {
        val random = Random.nextInt(2)
        val escolhaApp = if (random == 0) "cara" else "coroa"

        val mensagem = if (escolhaUsuario == escolhaApp) {
            "Você ganhou! A moeda caiu em $escolhaUsuario."
        } else {
            "Você perdeu! A moeda caiu em $escolhaApp."
        }

        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }
}
