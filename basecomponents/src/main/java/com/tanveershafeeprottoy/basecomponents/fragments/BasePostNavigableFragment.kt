package com.tanveershafeeprottoy.basecomponents.fragments

abstract class BasePostNavigableFragment(title: String) : BaseNavigableFragment(title) {

    abstract fun onPostButtonClick()
}