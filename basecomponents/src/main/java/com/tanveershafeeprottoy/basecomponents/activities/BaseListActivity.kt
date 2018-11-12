package com.tanveershafeeprottoy.basecomponents.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

abstract class BaseListActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null

    abstract fun getAll()
}