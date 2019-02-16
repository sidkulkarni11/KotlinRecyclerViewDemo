package com.sid.kotlinrecyclerviewdemo.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.sid.kotlinrecyclerviewdemo.Model.User
import com.sid.kotlinrecyclerviewdemo.R
import com.sid.kotlinrecyclerviewdemo.ViewHolder.PersonVH

class UserAdapter(val personList: ArrayList<User>): RecyclerView.Adapter<PersonVH>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PersonVH {
        val v  = LayoutInflater.from(p0?.context).inflate(R.layout.list_layout,p0,false)
        return PersonVH(v)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(p0: PersonVH, p1: Int) {
        val user: User =personList[p1]
        p0?.textViewName?.text = user.name

    }

}