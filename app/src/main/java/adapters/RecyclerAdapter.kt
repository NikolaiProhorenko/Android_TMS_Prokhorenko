package adapters

import android.support.v7.widget.RecyclerView
import android.tms_prokhorenko.R
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView

class RecyclerAdapter {
    class RecyclerAdapter(
        private val items: List<PostModel>,
        private val event: (View) -> Unit
    ) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val titleTextView: TextView = itemView.findViewById(R.id.title)
            val descriptionTextView: TextView = itemView.findViewById(R.id.description)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyler_item, parent, false)

            itemView.setOnClickListener {
                event(it)
            }

            return MyViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.apply {
                titleTextView.text = items[position].title
                descriptionTextView.text = items[position].description
            }
        }

        override fun getItemCount(): Int {
            return items.size
        }
    }