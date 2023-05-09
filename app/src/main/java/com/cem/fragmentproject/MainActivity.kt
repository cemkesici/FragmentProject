package com.cem.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cem.fragmentproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }
    fun solaGit(view: View){
        val fragment=supportFragmentManager
        val fragmentTransaction=fragment.beginTransaction()
        val firstFragment=BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout1,firstFragment).commit()
    }
    fun sagaGit(view: View){
        val fragment=supportFragmentManager
        val fragmentTransaction=fragment.beginTransaction()
        val firstFragment=BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout1,firstFragment).commit()
    }
}