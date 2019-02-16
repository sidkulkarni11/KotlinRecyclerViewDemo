package com.sid.kotlinrecyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.sid.kotlinrecyclerviewdemo.Adapter.UserAdapter
import com.sid.kotlinrecyclerviewdemo.Model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.MyRecyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val users = ArrayList<User>()

        for(i in 0..100) {
            users.add(User("Sid"))
            users.add(User("sds"))
            users.add(User("assa"))
            users.add(User("Sid"))
            users.add(User("sds"))
            users.add(User("assa"))
            users.add(User("Sid"))
            users.add(User("sds"))
            users.add(User("assa"))
            users.add(User("Sid"))
            users.add(User("sds"))
            users.add(User("assa"))
        }


        val adapter = UserAdapter(users)
        recyclerView.adapter = adapter

    }
}
