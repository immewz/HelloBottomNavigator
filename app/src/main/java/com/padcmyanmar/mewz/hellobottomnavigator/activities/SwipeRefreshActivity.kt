package com.padcmyanmar.mewz.hellobottomnavigator.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.mewz.hellobottomnavigator.R
import kotlinx.android.synthetic.main.activity_swipe_refresh.*

class SwipeRefreshActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_refresh)

        btnEnd.setOnClickListener{
            swlMain.isRefreshing = false
        }
    }
}