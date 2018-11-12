package com.tanveershafeeprottoy.basecomponents.fragments

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

abstract class BaseNavigableFragment(private val title:String) : Fragment() {

    override fun onResume() {
        super.onResume()
        if((activity as AppCompatActivity).supportActionBar?.title != title) {
            (activity as AppCompatActivity).supportActionBar?.title = title
        }
    }
}
