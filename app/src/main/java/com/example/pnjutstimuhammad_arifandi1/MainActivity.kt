
package com.example.pnjutstimuhammad_arifandi1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private lateinit var emailEditText1: EditText
    private lateinit var emailEditText2: EditText
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Ensure this matches your actual layout file name

        // Set edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("Hal2", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        // Find views
        emailEditText1 = findViewById(R.id.email1)
        emailEditText2 = findViewById(R.id.email2)
        saveButton = findViewById(R.id.button)

        // Load saved data if available
        val savedEmail1 = sharedPreferences.getString("email1_key", "")
        val savedEmail2 = sharedPreferences.getString("email2_key", "")
        emailEditText1.setText(savedEmail1)
        emailEditText2.setText(savedEmail2)

        // Save data on button click and navigate to another activity
        saveButton.setOnClickListener {
            val email1 = emailEditText1.text.toString()
            val email2 = emailEditText2.text.toString()
            editor.putString("email1_key", email1)  // Save email1
            editor.putString("email2_key", email2)  // Save email2
            editor.putString("email", "@muhammad_arifandi")
            editor.putString("nim", "2207411015")
            editor.putString("nama", "Muhammad_Arifandi_Prasetyo")
            editor.putString("kelas", "TI 4A")
            editor.apply()

            // Display a toast message for successful login
            Toast.makeText(this@MainActivity, "Login berhasil", Toast.LENGTH_SHORT).show()

            // Create an intent to start a new activity
            val intent = Intent(this@MainActivity, Hal2::class.java)
            startActivity(intent)
        }
    }
}

