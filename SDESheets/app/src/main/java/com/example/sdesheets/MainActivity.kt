package com.example.sdesheets

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager = findViewById(R.id.viewPager)

        val pagerAdapter = CategoryAdapter(supportFragmentManager, viewPager.context)

        viewPager.adapter = pagerAdapter

        supportActionBar?.elevation = 0F
        supportActionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.colorPrimary)))
    }

}