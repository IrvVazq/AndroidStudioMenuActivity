package bebidas

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.menurestaurante.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.*

class BebidasListAdapter(val bebidasClass:MutableList<BebidasClass>): RecyclerView.Adapter<BebidasListAdapter.BebidasHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BebidasListAdapter.BebidasHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BebidasHolder(layoutInflater.inflate(R.layout.bebidas_activity_bebidas,parent,false))
    }

    override fun onBindViewHolder(holder: BebidasListAdapter.BebidasHolder, position: Int) {
        holder.render(bebidasClass[position])
    }

    override fun getItemCount(): Int {
        return bebidasClass.size
    }

    class BebidasHolder (val view:View):RecyclerView.ViewHolder(view){
        fun render(item:BebidasClass){
            view.nombre.text = item.nombre
            view.precio.text = item.precio.toString()
            view.descripcion.text = item.gramaje.toString()
            view.presentacion.text = item.presentacion
            Picasso.get().load(item.imagen).into(view.imagenbebida)
        }
    }
}
