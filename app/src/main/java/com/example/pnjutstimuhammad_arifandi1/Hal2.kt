package com.example.pnjutstimuhammad_arifandi1
import android.view.View

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.pnjutstimuhammad_arifandi1.R
import com.example.pnjutstimuhammad_arifandi1.tampilanda

class Hal2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal3)

        val toolbar = findViewById<Toolbar>(R.id.option_menu)
        setSupportActionBar(toolbar)

        // Menghilangkan judul dari toolbar
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                // Pindah ke halaman tampilanda
                val intent = Intent(this, tampilanda::class.java)
                startActivity(intent)
                true
            }
            R.id.action_about -> {
                // Tindakan untuk "Data Alumni"
                true
            }
            R.id.action_help -> {
                // Tindakan untuk "Logout"
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // Fungsi yang dipanggil saat tombol "Profile" ditekan
    fun navigateToProfile(view: View) {
        // Buat Intent untuk berpindah ke halaman profil
        val intent = Intent(this, Profile::class.java)
        startActivity(intent) // Navigasi ke halaman profil
    }

    // Fungsi yang dipanggil saat tombol "Berita" ditekan
    fun navigateToBerita(view: View) {
        // Buat Intent untuk berpindah ke halaman berita
        val intent = Intent(this, Berita::class.java)
        startActivity(intent) // Navigasi ke halaman berita
    }
}
