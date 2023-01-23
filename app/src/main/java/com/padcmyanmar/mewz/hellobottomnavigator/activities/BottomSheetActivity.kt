package com.padcmyanmar.mewz.hellobottomnavigator.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.padcmyanmar.mewz.hellobottomnavigator.R
import kotlinx.android.synthetic.main.activity_bottom_sheet.*

class BottomSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        val sheet = BottomSheetBehavior.from(bottomSheet)

        BtnShow.setOnClickListener {
            when{
                sheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                    sheet.state = BottomSheetBehavior.STATE_EXPANDED
                }
                else -> {
                    sheet.state = BottomSheetBehavior.STATE_COLLAPSED
                }
            }
        }
    }
}