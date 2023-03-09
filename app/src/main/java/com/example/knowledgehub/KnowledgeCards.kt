package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.knowledgehub.databinding.ActivityKnowledgeCardsBinding
import com.example.knowledgehub.databinding.ActivityMainBinding

class KnowledgeCards : AppCompatActivity() {
    private lateinit var binding: ActivityKnowledgeCardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKnowledgeCardsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ktCard.setOnClickListener {
//            Call Intent
            intent = Intent(applicationContext,KotlinActivity::class.java)
            startActivity(intent)
        }
        binding.reactCard.setOnClickListener {
//            Call Intent
            intent = Intent(applicationContext,ReactActivity::class.java)
            startActivity(intent)
        }

        binding.blockCard.setOnClickListener {
//            Call Intent
            intent = Intent(applicationContext,BlockChainActivity::class.java)
            startActivity(intent)
        }

        binding.supportBtn.setOnClickListener {
            intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "222000953"))
            startActivity(intent)
        }
    }
}