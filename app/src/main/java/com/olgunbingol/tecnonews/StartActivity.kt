package com.olgunbingol.tecnonews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }
    fun newsClicked(view: View) {
        val intent = Intent(this@StartActivity,HaberlerActivity::class.java)
        startActivity(intent)

    }
    fun kesfetClicked (view: View) {
        val intent = Intent(this@StartActivity,KesfetActivity::class.java)
        startActivity(intent)

    }
    fun profilClicked (view: View){
        val intent = Intent(this@StartActivity,ProfilActivity::class.java)
        startActivity(intent)

    }
   fun  createClicked (view: View){
       val intent = Intent(this@StartActivity,OlusturActivity::class.java)
       startActivity(intent)

   }
}