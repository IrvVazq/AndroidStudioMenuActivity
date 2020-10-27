package com.example.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import bebidas.BebidasClass
import bebidas.BebidasListAdapter
import kotlinx.android.synthetic.main.activity_bebidas.*

class ActivityBebidas : AppCompatActivity() {
    var listaBebidas:MutableList<BebidasClass> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebidas)
        val actionBar = supportActionBar
        actionBar!!.title="Bebidas"
        actionBar.setDisplayHomeAsUpEnabled(true)
        createBebidasList()
        initBebidasRecycler()
    }

    fun createBebidasList(){
        listaBebidas.add(BebidasClass("Coca-cola",13.00,500.00,"Botella retornable","https://images-na.ssl-images-amazon.com/images/I/61v0iC6vyZL._SX679_PIbundle-24,TopRight,0,0_AA679SH20_.jpg"))
        listaBebidas.add(BebidasClass("Pepsi-cola",13.00,500.00,"Botella retornable","https://elalmacendebebidas.es/741-home_default/pepsi-cola-botella-cristal-sr-35-cl-24-u.jpg"))
        listaBebidas.add(BebidasClass("Sprite",12.00,500.00,"Botella retornable","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRjGTn9APBcMc3WiBG1Yz_SLwJFW3QKwplg2A&usqp=CAU"))
        listaBebidas.add(BebidasClass("Te Helado",12.00,400.00,"Vaso de vidrio","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/NCI_iced_tea.jpg/220px-NCI_iced_tea.jpg"))
        listaBebidas.add(BebidasClass("Agua de Jamaica",12.00,400.00,"Vaso de vidrio","https://www.sistemadigitaldealimentos.org/images/platos/big/608.png"))
    }

    fun initBebidasRecycler(){
        var adapter = BebidasListAdapter(listaBebidas)
        B_bebidasrecyclerview.layoutManager = LinearLayoutManager(this)
        B_bebidasrecyclerview.adapter = adapter
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }


}