package com.tanveershafeeprottoy.basecomponents.fragments

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

abstract class BaseNavigableFragment(private val titleResId: Int) : Fragment() {

    override fun onResume() {
        super.onResume()
        val title = getString(titleResId)
        if((activity as AppCompatActivity).supportActionBar?.title != title) {
            (activity as AppCompatActivity).supportActionBar?.title = title
        }
    }
}
