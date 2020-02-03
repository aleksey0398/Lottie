package com.example.lottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lottie.extensions.Full
import com.example.lottie.extensions.setupWithViewPager
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        setupUI()
    }

    private fun setupUI() {
        val adapter = Adapter(getList(), supportFragmentManager)
        viewPager.adapter = adapter
        lottie.setupWithViewPager(viewPager, Full)
    }

    fun getList() = listOf("List 1", "List 2", "List3", "List4")
}
