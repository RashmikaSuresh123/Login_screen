package com.example.login_screen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        // Set click listener for the login button
        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            // Log the credentials for debugging
            Log.i("Test Credential", "Username : $username and Password : $password")

            // Show a Toast message
            Toast.makeText(this, "Login button clicked!", Toast.LENGTH_SHORT).show()

            // Redirect to the dashboard project
            val intent = Intent()
            intent.setClassName("com.example.dasboard", "com.example.dasboard.MainActivity")
            startActivity(intent)
        }
    }
}
