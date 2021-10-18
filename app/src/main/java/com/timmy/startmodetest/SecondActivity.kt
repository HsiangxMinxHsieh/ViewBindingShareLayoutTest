package com.timmy.startmodetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.timmy.startmodetest.databinding.ActivityMainBinding

class SecondActivity : AppCompatActivity() {
    private val activity = this
    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = (DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding).apply {
            title = "第二頁"
            btnTo3.apply {
                text = "我是第二頁，到第三頁"
                setOnClickListener {
                    startActivity(Intent(activity, ThirdActivity::class.java))
                }
            }

            btnTo1.apply {
                text = "我是第二頁，到第一頁"
                setOnClickListener {
                    startActivity(Intent(activity, MainActivity::class.java))
                }

            }
        }
    }
}