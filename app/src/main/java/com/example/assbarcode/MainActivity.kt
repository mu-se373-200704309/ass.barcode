package com.example.barcode

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.assbarcode.R

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "www.maltepe.edu.tr"

        val encoder = BarcodeEncoder()
        val bitmap = encoder.encodeBitmap(text, BarcodeFormat.QR_CODE, 800, 800)
        val myImageView = findViewById<ImageView>(R.id.mImageView)
        myImageView.setImageBitmap(bitmap)
    }
}
