package com.olgunbingol.tecnonews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
    }
    fun signinClicked(view: View) {

    }
    fun signupClicked(view: View) {
        val intent = Intent(this@ProfilActivity,KayitActivity::class.java)
        startActivity(intent)

    }
}