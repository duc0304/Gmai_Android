package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tạo danh sách email mẫu
        val emailList = listOf(
            Email("Edurila.com", "$19 Only (First 10 spots)", "12:34 PM", "E"),
            Email("Chris Abad", "Help make Campaign Monitor better", "11:22 AM", "C"),
            Email("Tuto.com", "8h de formation gratuite et les nouveaux cours", "11:04 AM", "T"),
            Email("Support", "Société OVH : suivi de vos services", "10:26 AM", "S"),
            Email("Matt from Ionic", "The New Ionic Creator Is Here!", "10:42 AM", "M")
        )

        // Thiết lập RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}