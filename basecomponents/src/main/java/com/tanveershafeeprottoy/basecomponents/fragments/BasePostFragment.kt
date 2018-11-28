package com.tanveershafeeprottoy.basecomponents.fragments

import android.view.View
import androidx.fragment.app.Fragment

abstract class BasePostFragment : Fragment() {

    abstract fun onPostButtonClick(view: View)
}