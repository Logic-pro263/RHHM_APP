package ml.malikadigitalsolutions.rhhm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val resetlink_sent = findViewById<Button>(R.id.reset_sent_btn)

        resetlink_sent.setOnClickListener {
            val goToSentSuccess = Intent(this, ResetPasswordLinkSentActivity::class.java)
            startActivity(Intent(goToSentSuccess))
        }
    }
}