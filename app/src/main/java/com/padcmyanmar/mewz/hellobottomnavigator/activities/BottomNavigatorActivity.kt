package com.padcmyanmar.mewz.hellobottomnavigator.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.padcmyanmar.mewz.hellobottomnavigator.R
import com.padcmyanmar.mewz.hellobottomnavigator.fragment.HomeFragment
import com.padcmyanmar.mewz.hellobottomnavigator.fragment.NotificationFragment
import com.padcmyanmar.mewz.hellobottomnavigator.fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_bottom_navigator.*
import kotlinx.android.synthetic.main.activity_main.*

class BottomNavigatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigator)
        switchFragment(HomeFragment())


        bottom_navi.setOnNavigationItemSelectedListener { menuItem : MenuItem ->
            when(menuItem.itemId){
                R.id.action_home -> {
                    switchFragment(HomeFragment())
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fl_container, HomeFragment())
//                        .commit()
                }
                R.id.action_notification -> {
                    switchFragment(NotificationFragment())
//                    supportFragmentManager.commit {
//                        replace<NotificationFragment>(R.id.fl_container)
//                    }
                }
                R.id.action_profile -> {
                    switchFragment(ProfileFragment())
//                    supportFragmentManager.commit {
//                        replace<ProfileFragment>(R.id.fl_container)
//                    }
                }
            }
            false
        }

    }

    private fun switchFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container, fragment)
            .commit()
    }

}