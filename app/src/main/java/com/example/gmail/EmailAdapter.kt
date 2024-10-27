package com.example.gmail
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    // Màu sắc cho hình đại diện
    private val avatarColors = listOf(
        Color.parseColor("#FF5722"), // Orange
        Color.parseColor("#4CAF50"), // Green
        Color.parseColor("#2196F3"), // Blue
        Color.parseColor("#9C27B0"), // Purple
        Color.parseColor("#FFC107")  // Yellow
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gmail, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.sender.text = email.sender
        holder.subject.text = email.subject
        holder.time.text = email.time

        // Set hình đại diện
        holder.avatar.text = email.avatar
        holder.avatar.setBackgroundColor(avatarColors[position % avatarColors.size])
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sender: TextView = itemView.findViewById(R.id.sender)
        val subject: TextView = itemView.findViewById(R.id.subject)
        val time: TextView = itemView.findViewById(R.id.time)
        val avatar: TextView = itemView.findViewById(R.id.avatar)
    }
}
