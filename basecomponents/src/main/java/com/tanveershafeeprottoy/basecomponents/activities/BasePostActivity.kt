package com.tanveershafeeprottoy.basecomponents.activities

import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BasePostActivity : AppCompatActivity() {

    abstract fun onPostButtonClick(view: View)
}