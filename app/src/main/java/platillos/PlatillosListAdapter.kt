package platillos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bebidas.BebidasClass
import bebidas.BebidasListAdapter
import com.example.menurestaurante.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.*
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.descripcion
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.nombre
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.precio
import kotlinx.android.synthetic.main.platillos_activity_platillos.view.*

class PlatillosListAdapter (val platillosClass:MutableList<PlatillosClass>): RecyclerView.Adapter<PlatillosListAdapter.PlatillosHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): PlatillosListAdapter.PlatillosHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PlatillosListAdapter.PlatillosHolder(layoutInflater.inflate(R.layout.platillos_activity_platillos,parent, false))
    }

    override fun onBindViewHolder(holder: PlatillosListAdapter.PlatillosHolder, position: Int) {
        holder.render(platillosClass[position])
    }

    override fun getItemCount(): Int {
        return platillosClass.size
    }

    class PlatillosHolder(val view:View): RecyclerView.ViewHolder(view){
            fun render (item:PlatillosClass){
                view.nombre.text = item.nombre
                view.precio.text = item.precio.toString()
                view.descripcion.text = item.descripcion
                Picasso.get().load(item.imagen).into(view.imagenplatillo)
            }
    }
}

