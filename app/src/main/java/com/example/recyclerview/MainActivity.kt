package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.RecyclerViewContactAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.ContactModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrContacts = ArrayList<ContactModel>().apply {
            add(ContactModel(R.drawable.avatar_1, "Dipesh", "9867990635"))
            add(ContactModel(R.drawable.avatar_2, "Sachin", "9867990123"))
            add(ContactModel(R.drawable.avatar_3, "Sapna", "9867990345"))
            add(ContactModel(R.drawable.avatar_4, "Pawan", "9867990456"))
            add(ContactModel(R.drawable.avatar_5, "Kushboo", "9867990567"))
            add(ContactModel(R.drawable.avatar_6, "Manish", "9867990678"))
            add(ContactModel(R.drawable.avatar_7, "Navin", "9867990789"))
            add(ContactModel(R.drawable.avatar_8, "Deepak", "9867990890"))

            add(ContactModel(R.drawable.avatar_1, "Dipesh", "9867990635"))
            add(ContactModel(R.drawable.avatar_2, "Sachin", "9867990123"))
            add(ContactModel(R.drawable.avatar_3, "Sapna", "9867990345"))
            add(ContactModel(R.drawable.avatar_4, "Pawan", "9867990456"))
            add(ContactModel(R.drawable.avatar_5, "Kushboo", "9867990567"))
            add(ContactModel(R.drawable.avatar_6, "Manish", "9867990678"))
            add(ContactModel(R.drawable.avatar_7, "Navin", "9867990789"))
            add(ContactModel(R.drawable.avatar_8, "Deepak", "9867990890"))

            add(ContactModel(R.drawable.avatar_1, "Dipesh", "9867990635"))
            add(ContactModel(R.drawable.avatar_2, "Sachin", "9867990123"))
            add(ContactModel(R.drawable.avatar_3, "Sapna", "9867990345"))
            add(ContactModel(R.drawable.avatar_4, "Pawan", "9867990456"))
            add(ContactModel(R.drawable.avatar_5, "Kushboo", "9867990567"))
            add(ContactModel(R.drawable.avatar_6, "Manish", "9867990678"))
            add(ContactModel(R.drawable.avatar_7, "Navin", "9867990789"))
            add(ContactModel(R.drawable.avatar_8, "Deepak", "9867990890"))


        }

        binding.rcViewContact.layoutManager = LinearLayoutManager(this@MainActivity)

        val contactAdapter = RecyclerViewContactAdapter(this, arrContacts)

        binding.rcViewContact.adapter = contactAdapter

    }
}