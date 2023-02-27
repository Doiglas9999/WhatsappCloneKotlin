package com.example.whatsappclone_kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.whatsappclone_kotlin.R

import com.example.whatsappclone_kotlin.viewmodel.ViewPagerAdapter
import com.example.whatsappclone_kotlin.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentAdapter = ViewPagerAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(ConversationsFragment(), "Conversations")
        fragmentAdapter.addFragment(StatusFragment(), "Status")
        fragmentAdapter.addFragment(CallsFragment(), "Calls")

        binding.viewPager.adapter = fragmentAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_main -> {
                println("main menu clicado")
                true
            }
            R.id.configurações -> {
                println("main 2 clicado")
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }


}

