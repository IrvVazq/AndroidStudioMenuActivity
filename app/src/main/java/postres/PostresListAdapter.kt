package postres

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menurestaurante.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.*
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.descripcion
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.nombre
import kotlinx.android.synthetic.main.bebidas_activity_bebidas.view.precio
import kotlinx.android.synthetic.main.postres_activity_postres.view.*

class PostresListAdapter(val postresClass:MutableList<PostresClass>): RecyclerView.Adapter<PostresListAdapter.PostresHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostresHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PostresListAdapter.PostresHolder(layoutInflater.inflate(R.layout.postres_activity_postres,parent, false))
    }

    override fun onBindViewHolder(holder: PostresHolder, position: Int) {
        holder.render(postresClass[position])
    }

    override fun getItemCount(): Int {
        return postresClass.size
    }

    class PostresHolder (val view: View): RecyclerView.ViewHolder(view){
        fun render (item:PostresClass){
            view.nombre.text = item.nombre
            view.precio.text = item.precio.toString()
            view.descripcion.text = item.descricion
            Picasso.get().load(item.imagen).into(view.imagenpostres)
        }
    }
}