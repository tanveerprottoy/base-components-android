package com.tanveershafeeprottoy.basecomponents.fragments

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

abstract class BaseListFragment : Fragment() {
    var recyclerView: RecyclerView? = null

    abstract fun getAll()
}