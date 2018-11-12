package com.tanveershafeeprottoy.basecomponents.activities

import androidx.appcompat.app.AppCompatActivity

abstract class BaseNavigableActivity : AppCompatActivity() {

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
            return
        }
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}