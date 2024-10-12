package com.fleon.botoescomponentesbasicosdeui

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val button: Button by lazy {findViewById(R.id.button)}
    private val imageButton: ImageButton by lazy {findViewById(R.id.imageButton)}
    private val toggleButton: ToggleButton by lazy {findViewById(R.id.toggleButton)}
    private val fab: FloatingActionButton by lazy {findViewById(R.id.fab)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupButton()
        setupImageButton()
        setupToggleButton()
        setupFAB()

    }

    private fun setupButton() {
        button.setOnClickListener{
            Toast.makeText(this, "Clique rápido no Button", Toast.LENGTH_SHORT).show()
        }
        button.setOnLongClickListener {
            Toast.makeText(this, "Clique longo no Button", Toast.LENGTH_SHORT).show()
            true
        }

    }

    private fun setupImageButton() {
        imageButton.setOnClickListener {
            Toast.makeText(this, "Clique rápido no Image Button", Toast.LENGTH_SHORT).show()
        }

        imageButton.setOnLongClickListener{
            Toast.makeText(this, "Clique longo no Image Button", Toast.LENGTH_SHORT).show()
            true
        }

    }

    private fun setupToggleButton() {
        toggleButton.setOnCheckedChangeListener {_, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Toggle ligado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Toggle desligado", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupFAB() {
        fab.setOnClickListener {
            Toast.makeText(this, "Clique no FAB: ALERTA!", Toast.LENGTH_SHORT).show()
        }
    }

}