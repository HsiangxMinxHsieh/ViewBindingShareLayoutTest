package com.timmy.startmodetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.timmy.startmodetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activity = this
    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = (DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding).apply {
            title = "第一頁"
            btnTo1.isVisible = false
            btnTo3.text = "我是第一頁，到第二頁"
            btnTo3.setOnClickListener {
                startActivity(Intent(activity, SecondActivity::class.java))
            }
        }

    }
}