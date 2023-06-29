package com.example.gmailuidesign

import InboxRecyclerViewAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class InboxActivity : AppCompatActivity() {
    var inboxModels: ArrayList<InboxModel> = ArrayList<InboxModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inbox)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        setUpMails()
        val adapter = InboxRecyclerViewAdapter(this,inboxModels )
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun setUpMails() {
        val mailSubjects = resources.getStringArray(R.array.first)
        val mailSenders = resources.getStringArray(R.array.second)
        val mailDates = resources.getStringArray(R.array.dates)

        Log.i("TAAAAAG", " + " + mailSubjects)
        for (i in mailSubjects.indices) {
            val first = mailSubjects[i]
            val second = mailSenders[i]
            val date = mailDates[i]
            val inboxModel = InboxModel(first, second, date)
            inboxModels.add(inboxModel)
        }
    }

}