package com.example.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_platillos.*
import platillos.PlatillosClass
import platillos.PlatillosListAdapter

class ActivityPlatillos : AppCompatActivity() {
    var listaPlatillos:MutableList<PlatillosClass> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platillos)
        val actionBar = supportActionBar
        actionBar!!.title="Platillos"
        actionBar.setDisplayHomeAsUpEnabled(true)
        initPlatillosRecycler()
        createPlatillosList()
    }

    fun createPlatillosList (){
        listaPlatillos.add(PlatillosClass("Tacos al pastor",18.0,"Cada taco se vende a 18 pesos en una tortilla de maiz con carne al pastor, cilantro y cebolla","https://www.bestmex.com/en/mexico-insurance-blog/wp-content/uploads/2017/06/distrito-federal-tacos-al-pastor-1.jpg"))
        listaPlatillos.add(PlatillosClass("Tacos de cabeza",18.0,"Cada taco se vende a 18 pesos en una tortilla de maiz con carne de cabeza de res, cebolla y cilantro","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQOlZijgSdDARwWPKy6DnZfTmDOeWbiZ5gbdQ&usqp=CAU"))
        listaPlatillos.add(PlatillosClass("Hamburgesas",35.0,"Hamburgesas con doble carne, queso, rodajas de tomate, lechuga, aguacate y cebolla morada","https://static3.diariosur.es/www/pre2017/multimedia/prensa/noticias/200909/14/fotos/2030998.jpg"))
        listaPlatillos.add(PlatillosClass("Papas rellenas con carne asada",30.0,"Porcion individual de papas rellenas con queso y carne asada","https://papasalhorno.net/wp-content/uploads/2018/09/26.-papa-asada-con-carne.jpg"))
        listaPlatillos.add(PlatillosClass("Costillas en salsa BBQ",20.0,"Cada costilla se vende a 20 pesos bañadas en salsa BBQ","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRzUA-Z5ZHrP-HL0Bu5oVdLNtXqwXOJcgciew&usqp=CAU"))

    }

    fun initPlatillosRecycler(){
        var adapter = PlatillosListAdapter(listaPlatillos)
        PL_platillosrecyclerview.layoutManager = LinearLayoutManager(this)
        PL_platillosrecyclerview.adapter = adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}