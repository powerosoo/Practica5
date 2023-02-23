package mx.edu.itson.practica4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import java.util.*

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listView: ListView = findViewById(R.id.listview) as ListView

        var adaptador: AdaptadorProductos = AdaptadorProductos(this, menu)
        listView.adapter=adaptador
    }

    fun agregarProductos(option:String?)
    {
        when(option)
        {
            "Antojitos"->
            {
                menu.add(Product(name = "Quesadillas", R.drawable.quesadillas, description = "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", price = 5.69))
                menu.add(Product(name = "Huaraches", R.drawable.huaraches, description = "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream", price = 10.85))
                menu.add(Product(name = "Gringas", R.drawable.gringas, description = "Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple", price = 7.99))
                menu.add(Product(name = "Sincronizadas", R.drawable.sincronizadas, description = "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", price = 7.69))
                menu.add(Product(name = "Sopes", R.drawable.sopes, description = "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.56))
                menu.add(Product(name = "Tostadas", R.drawable.tostadas, description = "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.73))
            }
            "Especialidades"->
            {
                menu.add(Product(name = "Quesadillas", R.drawable.quesadillas, description = "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", price = 5.69))
                menu.add(Product(name = "Huaraches", R.drawable.huaraches, description = "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream", price = 10.85))
                menu.add(Product(name = "Gringas", R.drawable.gringas, description = "Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple", price = 7.99))
                menu.add(Product(name = "Sincronizadas", R.drawable.sincronizadas, description = "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", price = 7.69))
                menu.add(Product(name = "Sopes", R.drawable.sopes, description = "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.56))
                menu.add(Product(name = "Tostadas", R.drawable.tostadas, description = "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.73))
            }
            "Combinaciones"->
            {
                menu.add(Product(name = "Quesadillas", R.drawable.quesadillas, description = "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", price = 5.69))
                menu.add(Product(name = "Huaraches", R.drawable.huaraches, description = "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream", price = 10.85))
                menu.add(Product(name = "Gringas", R.drawable.gringas, description = "Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple", price = 7.99))
                menu.add(Product(name = "Sincronizadas", R.drawable.sincronizadas, description = "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", price = 7.69))
                menu.add(Product(name = "Sopes", R.drawable.sopes, description = "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.56))
                menu.add(Product(name = "Tostadas", R.drawable.tostadas, description = "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.73))
            }
            "Tortas"->
            {
                menu.add(Product(name = "Quesadillas", R.drawable.quesadillas, description = "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", price = 5.69))
                menu.add(Product(name = "Huaraches", R.drawable.huaraches, description = "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream", price = 10.85))
                menu.add(Product(name = "Gringas", R.drawable.gringas, description = "Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple", price = 7.99))
                menu.add(Product(name = "Sincronizadas", R.drawable.sincronizadas, description = "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", price = 7.69))
                menu.add(Product(name = "Sopes", R.drawable.sopes, description = "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.56))
                menu.add(Product(name = "Tostadas", R.drawable.tostadas, description = "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.73))
            }
            "Sopas"->
            {
                menu.add(Product(name = "Quesadillas", R.drawable.quesadillas, description = "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", price = 5.69))
                menu.add(Product(name = "Huaraches", R.drawable.huaraches, description = "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream", price = 10.85))
                menu.add(Product(name = "Gringas", R.drawable.gringas, description = "Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple", price = 7.99))
                menu.add(Product(name = "Sincronizadas", R.drawable.sincronizadas, description = "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", price = 7.69))
                menu.add(Product(name = "Sopes", R.drawable.sopes, description = "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.56))
                menu.add(Product(name = "Tostadas", R.drawable.tostadas, description = "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.73))
            }
            "Drinks"->
            {
                menu.add(Product(name = "Quesadillas", R.drawable.quesadillas, description = "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", price = 5.69))
                menu.add(Product(name = "Huaraches", R.drawable.huaraches, description = "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream", price = 10.85))
                menu.add(Product(name = "Gringas", R.drawable.gringas, description = "Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple", price = 7.99))
                menu.add(Product(name = "Sincronizadas", R.drawable.sincronizadas, description = "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", price = 7.69))
                menu.add(Product(name = "Sopes", R.drawable.sopes, description = "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.56))
                menu.add(Product(name = "Tostadas", R.drawable.tostadas, description = "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes", price = 3.73))
            }
        }
    }

    private class AdaptadorProductos: BaseAdapter {
        var productos=ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context,productos: ArrayList<Product>){
            this.productos=productos
            this.contexto= contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var prod=productos[p0]
            var inflador=LayoutInflater.from(contexto)
            var vista= inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre) as TextView
            var desc = vista.findViewById(R.id.producto_desc) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")
            return vista
        }
    }
}