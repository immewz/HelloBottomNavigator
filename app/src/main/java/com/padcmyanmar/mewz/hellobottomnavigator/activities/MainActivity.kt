package com.padcmyanmar.mewz.hellobottomnavigator.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padcmyanmar.mewz.hellobottomnavigator.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnBottomNavigator.setOnClickListener {
            val intent = Intent(this,AppBarBottomActivity::class.java)
            startActivity(intent)
        }

        BtnBottomNavigatorWithViewPager.setOnClickListener {
            val intent = Intent(this,BottomNavigationWithViewPagerActivity::class.java)
            startActivity(intent)
        }

        BtnAppBar.setOnClickListener {
            val intent = Intent(this,AppBarBottomActivity::class.java)
            startActivity(intent)
        }

        BtnMaterialComponent.setOnClickListener {
            val intent = Intent(this,OtherCommonUIElement::class.java)
            startActivity(intent)
        }

        BtnBottomSheet.setOnClickListener {
            val intent = Intent(this,BottomSheetActivity::class.java)
            startActivity(intent)
        }

        BtnCollapsing.setOnClickListener {
            val intent = Intent(this,CollapsingToolbarActivity::class.java)
            startActivity(intent)
        }

        BtnCoordinator.setOnClickListener {
            val intent = Intent(this,CoordinatorActivity::class.java)
            startActivity(intent)
        }

        BtnDrawer.setOnClickListener {
            val intent = Intent(this,NavigationViewActivity::class.java)
            startActivity(intent)
        }

        BtnSwipe.setOnClickListener {
            val intent = Intent(this,SwipeRefreshActivity::class.java)
            startActivity(intent)
        }

        BtnConstraint.setOnClickListener {
            val intent = Intent(this,ConstraintActivity::class.java)
            startActivity(intent)
        }
    }
}