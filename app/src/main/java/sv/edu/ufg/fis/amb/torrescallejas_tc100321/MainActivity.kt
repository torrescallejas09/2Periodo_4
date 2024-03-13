package sv.edu.ufg.fis.amb.torrescallejas_tc100321

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.title="Torres Callejas - Emiliano"
        supportActionBar?.subtitle="Universidad Francisco Gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_background)

        val boton = findViewById<Button>(R.id.btn)

        boton.setOnClickListener {
            val intent = Intent(this, SegundaPantalla::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater .inflate(R.menu.ufg_toolbar, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        return when(item.itemId) {
            R.id.configuracion -> {
                Toast.makeText(this, "Ha seleccionado la opción de configuración", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.perfil -> {
                Toast.makeText(this, "Ha seleccionado la opción de Ver Perfil", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.mapa -> {
                Toast.makeText(this, "Ha seleccionado la opción de Ubicacion", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nueva_cuenta -> {
                Toast.makeText(this, "Ha seleccionado la opción de Nueva Cuenta", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.salir -> {
                Toast.makeText(this, "Ha seleccionado la opción de Salir", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }

    }
}