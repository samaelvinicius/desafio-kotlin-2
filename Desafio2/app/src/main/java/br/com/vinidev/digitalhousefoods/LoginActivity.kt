package br.com.vinidev.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            val lIntent = Intent(this, MainActivity::class.java)
            startActivity(lIntent)
        }

        btnRegister.setOnClickListener {
            val rIntent = Intent(this,RegisterActivity::class.java)
            startActivity(rIntent)
        }

    }
}