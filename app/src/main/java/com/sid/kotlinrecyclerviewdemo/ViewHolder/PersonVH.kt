package com.sid.kotlinrecyclerviewdemo.ViewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.sid.kotlinrecyclerviewdemo.R

class PersonVH (itemview : View):RecyclerView.ViewHolder(itemview) {
        val textViewName = itemView.findViewById(R.id.UserTv) as TextView

}