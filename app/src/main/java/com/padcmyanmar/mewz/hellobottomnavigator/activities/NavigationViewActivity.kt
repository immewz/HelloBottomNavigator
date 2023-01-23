package com.padcmyanmar.mewz.hellobottomnavigator.activities

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
import com.padcmyanmar.mewz.hellobottomnavigator.R
import kotlinx.android.synthetic.main.activity_navigation_view.*


class NavigationViewActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_view)

        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(resources.getColor(R.color.white_full))

        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.drawer_open,
            R.string.drawer_close
        )

        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {

        when {
            drawer_layout.isDrawerOpen(GravityCompat.START) -> {
                drawer_layout.closeDrawer(GravityCompat.START)
            }
            else -> {
                super.onBackPressed()
            }
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.nav_camera -> {
                Toast.makeText(this, "This is Camera", Toast.LENGTH_SHORT).show()
                drawer_layout.closeDrawer(GravityCompat.START)
            }
            R.id.nav_gallery -> Toast.makeText(this, "This is Gallery", Toast.LENGTH_SHORT).show()
            R.id.nav_slideshow -> Toast.makeText(this, "This is SlideShow", Toast.LENGTH_SHORT).show()
            R.id.nav_manage -> Toast.makeText(this, "This is Manage", Toast.LENGTH_SHORT).show()
        }
        return true
    }

}