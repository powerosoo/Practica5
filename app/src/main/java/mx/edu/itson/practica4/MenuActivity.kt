package mx.edu.itson.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.button_antojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.button_especialidades) as Button
        var btnCombinaciones: Button = findViewById(R.id.button_combinaciones) as Button
        var btnTortas: Button = findViewById(R.id.button_tortas) as Button
        var btnSopas: Button = findViewById(R.id.button_sopas) as Button
        var btnDrinks: Button = findViewById(R.id.button_drinks) as Button

        btnAntojitos.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }

        btnCombinaciones.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Combinaciones")
            startActivity(intent)
        }

        btnTortas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
        }

        btnSopas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)
        }

    }
}