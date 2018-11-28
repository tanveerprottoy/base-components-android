package com.tanveershafeeprottoy.basecomponents.activities

import android.view.View

abstract class BasePostNavigableActivity : BaseNavigableActivity() {

    abstract fun onPostButtonClick(view: View)
}
