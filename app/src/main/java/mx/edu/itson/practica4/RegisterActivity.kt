package mx.edu.itson.practica4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button: Button = findViewById(R.id.btn_sign_in)

        button.setOnClickListener {
            var intent: Intent= Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}