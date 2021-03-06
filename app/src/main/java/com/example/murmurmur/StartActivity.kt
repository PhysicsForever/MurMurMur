package com.example.murmurmur

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        GlobalScope.launch {
            Thread.sleep(2000)
            startActivity(Intent(this@StartActivity, MainActivity::class.java))
            finish()
        }

    }

}