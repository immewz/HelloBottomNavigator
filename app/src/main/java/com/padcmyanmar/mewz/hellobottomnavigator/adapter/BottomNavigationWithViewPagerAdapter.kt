package com.padcmyanmar.mewz.hellobottomnavigator.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padcmyanmar.mewz.hellobottomnavigator.fragment.HomeFragment
import com.padcmyanmar.mewz.hellobottomnavigator.fragment.NotificationFragment
import com.padcmyanmar.mewz.hellobottomnavigator.fragment.ProfileFragment

class BottomNavigationWithViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return HomeFragment()
            1 -> return NotificationFragment()
            2 -> return ProfileFragment()
        }
        return HomeFragment()
    }

}