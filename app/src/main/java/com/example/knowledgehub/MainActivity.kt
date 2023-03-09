package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.knowledgehub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.letsGoBtn.setOnClickListener {
//          Open A new Activity with Explicit Intents
            intent = Intent(applicationContext,KnowledgeCards::class.java)
            startActivity(intent)
        }
        if(supportActionBar!=null){
            supportActionBar!!.hide()
        }
    }
}