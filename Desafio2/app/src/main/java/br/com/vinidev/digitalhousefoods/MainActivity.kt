package br.com.vinidev.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<Image>(
            Image(
                R.drawable.tony_romas,
                "Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo\nFecha às 22:00"
            ),
            Image(
                R.drawable.aoyama_moema,
                "Aoyama Moema",
                "Alameda dos Arapanés, 532 - Moema, São Paulo\nFecha às 00:00"
            ),
            Image(
                R.drawable.outback_moema,
                "Outback Moema",
                "Av. Moaci 187, 187 - Moema, São Paulo\nFecha às 00:00"
            ),
            Image(
                R.drawable.si_senor,
                "Sí Señor!",
                "Av. Moaci 187, 187 - Moema, São Paulo\nFecha às 00:00"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, GridActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}
