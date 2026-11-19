package com.c69mstar.screensaver

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent("onyx.settings.action.DREAM_STYLE_SETTING").apply {
            setClassName("com.onyx", "com.onyx.common.setting.ui.SettingContainerActivity")
        }
        startActivity(intent)
        finish()
    }
}