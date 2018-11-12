package com.tanveershafeeprottoy.basecomponents.fragments

import androidx.recyclerview.widget.RecyclerView

abstract class BaseListNavigableFragment(title:String) : BaseNavigableFragment(title) {
    var recyclerView: RecyclerView? = null

    abstract fun getAll()
}