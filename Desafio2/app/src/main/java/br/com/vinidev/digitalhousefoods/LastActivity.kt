package br.com.vinidev.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }


}