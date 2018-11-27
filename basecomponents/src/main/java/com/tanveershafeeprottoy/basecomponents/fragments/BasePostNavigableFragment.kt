package com.tanveershafeeprottoy.basecomponents.fragments

abstract class BasePostNavigableFragment(titleResId: Int) : BaseNavigableFragment(titleResId) {

    abstract fun onPostButtonClick()
}