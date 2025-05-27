package com.example.myrecyclerview

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var articleApp: RecyclerView
    private val list = ArrayList<Article>()
    private lateinit var aboutButton: Button  // Ubah dari RecyclerView menjadi Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        articleApp = findViewById(R.id.article_app)
        articleApp.setHasFixedSize(true)
        list.addAll(getListHeroes())
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_list -> {
                articleApp.layoutManager = LinearLayoutManager(this)
            }
            R.id.action_grid -> {
                articleApp.layoutManager = GridLayoutManager(this, 2)
            }
            R.id.action_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getListHeroes(): ArrayList<Article> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listArticle = ArrayList<Article>()
        for (i in dataName.indices) {
            val hero = Article(dataName[i], dataDescription[i], dataPhoto[i])
            listArticle.add(hero)
        }
        return listArticle
    }

    private fun showRecyclerList() {
        articleApp.layoutManager = LinearLayoutManager(this)
        val listArticleAdapter = ListArticleAdapter(list)
        articleApp.adapter = listArticleAdapter

        listArticleAdapter.setOnItemClickCallback(object : ListArticleAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Article) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(article: Article) {
        Toast.makeText(this, "Kamu memilih " + article.title, Toast.LENGTH_SHORT).show()
    }
}
