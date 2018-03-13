package com.demo.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

var i: Float = 0f
val TAG = "ClassName"

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        i = 9f
        initView(TAG)
    }

   private fun initView(str: String) {
        Log.i("",str)
    }
}
