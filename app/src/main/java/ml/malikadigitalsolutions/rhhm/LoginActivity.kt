package ml.malikadigitalsolutions.rhhm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val back = findViewById<ImageView>(R.id.back)
        val noaccount = findViewById<TextView>(R.id.newaccount)
        val forgot_password = findViewById<TextView>(R.id.forget_password)

        back.setOnClickListener {
            val backToHello = Intent(this, MainActivity::class.java)
            startActivity(Intent(backToHello))
        }
        noaccount.setOnClickListener {
            val goToSignUp = Intent(this, SignUpActivity::class.java)
            startActivity(Intent(goToSignUp))
        }
        forgot_password.setOnClickListener {
            val goToForgot = Intent(this, ResetPasswordActivity::class.java)
            startActivity(Intent(goToForgot))
        }
    }
}