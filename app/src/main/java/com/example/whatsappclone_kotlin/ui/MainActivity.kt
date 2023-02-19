package com.example.whatsappclone_kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.whatsappclone_kotlin.viewmodel.ViewPagerAdapter
import com.example.whatsappclone_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentAdapter = ViewPagerAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(ConversationsFragment(),"Conversations")
        fragmentAdapter.addFragment(StatusFragment(),"Status")
        fragmentAdapter.addFragment(CallsFragment(),"Calls")

        binding.viewPager.adapter = fragmentAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}