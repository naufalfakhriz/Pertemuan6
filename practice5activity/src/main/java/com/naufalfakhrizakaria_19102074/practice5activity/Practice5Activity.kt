package com.naufalfakhrizakaria_19102074.practice5activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5)
        var btnProdi = findViewById<Button>(R.id.btnProdi)
        var inputProdi = findViewById<EditText>(R.id.inputProdi)

        btnProdi.setOnClickListener {
            val namaProdi = inputProdi.text.toString()
            if (namaProdi.isEmpty()) {
                inputProdi.error = getString(R.string.error_input_prodi)
                return@setOnClickListener
            }

            val moveWithDataIntent = Intent(this@MainActivity, Practice5ReadDataActivity::class.java)
            moveWithDataIntent.putExtra(Practice5ReadDataActivity.EXTRA_PRODI, namaProdi)
            startActivity(moveWithDataIntent)
        }
    }
}