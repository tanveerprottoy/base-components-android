package com.tanveershafeeprottoy.basecomponents.fragments

import androidx.recyclerview.widget.RecyclerView

abstract class BaseListNavigableFragment(titleResId: Int) : BaseNavigableFragment(titleResId) {
    var recyclerView: RecyclerView? = null

    abstract fun getAll()
}