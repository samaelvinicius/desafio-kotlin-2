package br.com.vinidev.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_grid.*

class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recipes.setOnClickListener {
            val tIntent = Intent(this, LastActivity::class.java)
            startActivity(tIntent)
        }

    }

}