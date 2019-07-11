package com.example.androidlatihanchat_farrel.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.widget.Filterable
import com.example.androidlatihanchat_farrel.model.Friend
import java.util.*

class FriendListAdapter(private val mContext: Context, items: ArrayList<Friend>) :
    RecyclerView.Adapter<FriendListAdapter.ViewHolder>(),
    Filterable