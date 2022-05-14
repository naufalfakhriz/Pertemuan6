package com.naufalfakhrizakaria_19102074.practice5activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Practice5ReadDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_read_data)
        var lblProdiSaya = findViewById<TextView>(R.id.lblProdiSaya)
        var btnCallBrowser = findViewById<Button>(R.id.btnCallBrowser)
        var btnCallCamera = findViewById<Button>(R.id.btnCallCamera)
        var btnCallPhone = findViewById<Button>(R.id.btnCallPhone)
        var inputPhoneNumber = findViewById<EditText>(R.id.inputPhoneNumber)


        val prodi = intent.getStringExtra(EXTRA_PRODI)
        lblProdiSaya.text = "Prodi Saya Adalah $prodi"

        btnCallBrowser.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://ittelkom-pwt.ac.id/")
            startActivity(intent)
        }

        btnCallCamera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        btnCallPhone.setOnClickListener {
            val phoneNumber = inputPhoneNumber.getText()
            if (phoneNumber.isEmpty()) {
                inputPhoneNumber.error = "Nomor Telpon Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:" + phoneNumber)
            startActivity(intent)
        }
    }
}