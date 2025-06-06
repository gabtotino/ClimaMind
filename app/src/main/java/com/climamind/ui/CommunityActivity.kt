package com.climamind.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.climamind.R
import com.climamind.model.Post

class CommunityActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val posts = mutableListOf(
        Post("Fonso011", "Me sinto sobrecarregada, mas compartilhar aqui ajuda."),
        Post("TunicoOS", "Estou me sentindo muito mal por causado meu trabalho."),
        Post("Dafine20", "Estamos juntos nessa, seja forte!")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PostAdapter(posts)
    }
}