package com.tanveershafeeprottoy.basecomponents.activities

import androidx.recyclerview.widget.RecyclerView

abstract class BaseListNavigableActivity : BaseNavigableActivity() {
    var recyclerView: RecyclerView? = null

    abstract fun getAll()
}