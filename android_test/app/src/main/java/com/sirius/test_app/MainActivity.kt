package com.sirius.test_app

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sirius.test_app.databinding.ActivityMainBinding
import com.sirius.test_app.databinding.CommentItemBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //private lateinit var adapter: ItemAdapter

    private val dataModel = DataModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            getSupportActionBar()?.hide();
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val layoutManager : LinearLayoutManager = LinearLayoutManager (this)
        binding.recView.layoutManager = layoutManager
        //binding.recView.adapter = adapter

        setValues()

    }

    fun setValues() {
        binding.gameImage.setImageResource(R.drawable.game_image)
        binding.gameLogo.setImageResource(R.drawable.game_logo)
        binding.gameName.text = dataModel.name
        binding.ratingBar.rating = dataModel.rating
        binding.downloadsText.text = dataModel.gradeCnt
        binding.tag1.text = dataModel.tags[0]
        binding.tag2.text = dataModel.tags[1]
        binding.tag3.text = dataModel.tags[2]
        binding.desc.text = dataModel.description
        binding.bigRatingNum.text = dataModel.rating.toString()
        binding.reviewRateBar.rating = dataModel.rating
        binding.reviewCounter.text = dataModel.gradeCnt

    }

    // Здесь должно было быть описание RecyclerView, но его тут нет /(;O;)\
    // comment_item есть, а остального нет /(X.X)\
}