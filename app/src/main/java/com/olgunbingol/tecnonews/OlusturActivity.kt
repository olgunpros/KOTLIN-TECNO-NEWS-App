package com.olgunbingol.tecnonews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.olgunbingol.tecnonews.databinding.ActivityMainBinding
import com.olgunbingol.tecnonews.databinding.ActivityOlusturBinding

class OlusturActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOlusturBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olustur)
        binding = ActivityOlusturBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun shareClicked(view: View) {

    }
    fun imageViewClicked(view: View) {

    }
}