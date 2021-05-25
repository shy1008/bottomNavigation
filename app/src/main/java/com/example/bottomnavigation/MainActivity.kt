package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(BlankFragment1())

        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_search ->{
                    replaceFragment(BlankFragment1())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_settings ->{
                    replaceFragment(BlankFragment2())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_navigation ->{
                    replaceFragment(BlankFragment3())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.setting ->{
                    replaceFragment(BlankFragment4())
                    return@setOnNavigationItemSelectedListener true
                }
                else->{
                    return@setOnNavigationItemSelectedListener true
                }
            }
        }

    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}