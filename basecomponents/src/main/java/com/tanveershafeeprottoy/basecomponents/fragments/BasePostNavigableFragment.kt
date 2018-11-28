package com.tanveershafeeprottoy.basecomponents.fragments

import android.view.View

abstract class BasePostNavigableFragment(titleResId: Int) : BaseNavigableFragment(titleResId) {

    abstract fun onPostButtonClick(view: View)
}