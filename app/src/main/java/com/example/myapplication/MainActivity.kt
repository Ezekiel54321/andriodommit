package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val USERNAME : String ="admin"
    val PASSWORD : String = "admin"
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.button)
        usernameInput = findViewById(R.id.editTextTextPassword2)
        usernameInput = findViewById(R.id.editTextTextPersonName)

        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)

        }
    }

    fun login(username: String, Password:String){
        if((isValidCredentials(username, Password))) {
            val intent: Intent = Intent(this, HomeActivity::class.java)
        }else{
                Toast.makeText(applicationContext,"Login unsuccessful", Toast.LENGTH_SHORT)
            }

        }

    }
    private fun isValidCredentials(username: String, password: String): Boolean{
        if(username == username && password == password) return true
        return false
    }
