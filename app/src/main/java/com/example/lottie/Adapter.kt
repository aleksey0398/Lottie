package com.example.lottie

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class Adapter(
    private val data: List<String>,
    fm: FragmentManager
) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) = ItemFragment(data[position])

    override fun getCount() = data.size

    override fun getPageTitle(position: Int) = data[position]
}