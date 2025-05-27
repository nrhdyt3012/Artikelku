package com.example.myrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.myrecyclerview.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil data dari string resource
        val name = resources.getString(R.string.dayat) // Misalnya ada di strings.xml
        val email = resources.getString(R.string.email) // Misalnya ada di strings.xml

        // Mengambil gambar dari drawable resource
        val photoResId = R.drawable.unnamed // Ganti 'your_image' dengan nama file gambar Anda

        // Mengisi data ke UI
        binding.tvName.text = name
        binding.tvEmail.text = email

        // Menggunakan Glide untuk memuat gambar dari drawable resource
        Glide.with(this)
            .load(photoResId) // Gunakan id resource untuk drawable
            .into(binding.imgProfile)
    }
}