package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.ContactModel

class RecyclerViewContactAdapter(val context: Context, val arrContact: ArrayList<ContactModel>) :
    RecyclerView.Adapter<RecyclerViewContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrContact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgContactImage.setImageResource(arrContact[position].contactImg)
        holder.txtContactName.text = arrContact[position].contactName
        holder.txtContactNumber.text = arrContact[position].contactNumber
    }


    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgContactImage = itemView.findViewById<ImageView>(R.id.imgContactImage)
        val txtContactName = itemView.findViewById<TextView>(R.id.txtContactName)
        val txtContactNumber = itemView.findViewById<TextView>(R.id.txtContactNumber)
    }
}