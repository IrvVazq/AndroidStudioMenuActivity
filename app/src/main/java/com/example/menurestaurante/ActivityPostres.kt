package com.example.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_postres.*
import platillos.PlatillosListAdapter
import postres.PostresClass
import postres.PostresListAdapter

class ActivityPostres : AppCompatActivity() {
    var listaPostres: MutableList<PostresClass> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postres)
        //Para modificar el titulo que aparecera en el layout y agregar un boton de back
        //El SupportActionBar se refiere a la barra de la aplicacion
        val actionBar = supportActionBar
        //Cambiar el titulo que aparecera en la aplicacion
        actionBar!!.title="Postres"
        actionBar.setDisplayHomeAsUpEnabled(true)
        initPostresRecycler()
        createPostresList()
    }

    fun createPostresList(){
        listaPostres.add(PostresClass("Pastel de chocolate",35.0,"Pastel de chocolate negro con nueces y cerezas","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSfinVa6fRJuN-BiHAmxz3ZoyjdX3F3LJnmCw&usqp=CAU"))
        listaPostres.add(PostresClass("Pay de Fresa",30.0,"Pay de fresa con crema batida para dos personas","https://craftlog.com/m/i/4627745=s1280=h960"))
        listaPostres.add(PostresClass("Helado en vaso",18.0,"Helado en vaso de fresa, vainilla o chocolate","https://thumbs.dreamstime.com/b/helado-del-chocolate-de-la-fresa-y-vainilla-con-el-cono-127329952.jpg"))
        listaPostres.add(PostresClass("Pastel frio",20.0,"Porcion individual de pastel frio con piña y cereza","https://imgsnotigram.s3.amazonaws.com/uploads/2020/02/receta-carlota-de-frutas-300x199.jpg"))
        listaPostres.add(PostresClass("Crepa dulce",15.0,"Crepas de fresa con queso filadelfia o chocolate","https://latiendafrancesa.mx/wp-content/uploads/2018/09/blog-crepa-dulce.png"))
    }

    fun initPostresRecycler (){
        var adapter = PostresListAdapter(listaPostres)
        PO_postresrecyclerview.layoutManager = LinearLayoutManager(this)
        PO_postresrecyclerview.adapter = adapter
    }

    //Asignar un uso al boton de retroceso de la aplicacion
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}