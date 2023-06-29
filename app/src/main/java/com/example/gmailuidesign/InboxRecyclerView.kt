import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailuidesign.InboxActivity
import com.example.gmailuidesign.InboxModel
import com.example.gmailuidesign.R

class InboxRecyclerViewAdapter(
    inboxModels1: InboxActivity,
    private val inboxModels: ArrayList<InboxModel>
) : RecyclerView.Adapter<InboxRecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.inbox_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val inboxModel = inboxModels[position]

        holder.firstTextView.text = inboxModel.First
        holder.secondTextView.text = inboxModel.Second
        holder.dateTextView.text = inboxModel.Date
    }

    override fun getItemCount(): Int {
        return inboxModels.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstTextView: TextView = itemView.findViewById(R.id.firstTextView)
        val secondTextView: TextView = itemView.findViewById(R.id.secondTextView)
        val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
    }
}
