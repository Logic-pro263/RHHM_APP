package ml.malikadigitalsolutions.rhhm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcome_btn = findViewById<Button>(R.id.commencer)

        welcome_btn.setOnClickListener {
            val gotologin = Intent(this, LoginActivity::class.java)
            startActivity(Intent(gotologin))
        }
    }
}