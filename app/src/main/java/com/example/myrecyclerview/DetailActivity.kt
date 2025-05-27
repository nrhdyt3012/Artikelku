package com.example.myrecyclerview

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.myrecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "key_hero"
    }
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil artikel dari Intent
        val article = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra<Article>(EXTRA_NAME, Article::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Article>(EXTRA_NAME)
        }

        // Menampilkan data article jika tidak null
        article?.let {
            // Menampilkan data artikel
            binding.tvItemName.text = it.title
            binding.tvItemDescription.text = it.description

            // Memuat gambar menggunakan Glide
            Glide.with(this)
                .load(it.photo)
                .into(binding.imgItemPhoto)
        }
    }
}
