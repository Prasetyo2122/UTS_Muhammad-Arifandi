package com.example.pnjutstimuhammad_arifandi1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Berita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
    }

    // Fungsi untuk navigasi ke halaman detail berita 1
    fun navigateToDetailBerita1(view: View) {
        val intent = Intent(this, DetailBerita1::class.java)
        startActivity(intent)
    }

    // Fungsi untuk navigasi ke halaman detail berita 2
    fun navigateToDetailBerita2(view: View) {
        val intent = Intent(this, DetailBerita2::class.java)
        startActivity(intent)
    }

    // Fungsi untuk navigasi ke halaman Home
    fun navigateToHome(view: View) {
        val intent = Intent(this, Hal2::class.java)
        startActivity(intent)
    }

    // Fungsi untuk navigasi ke halaman Profile
    fun navigateToProfile(view: View) {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
}
