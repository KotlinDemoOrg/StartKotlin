package com.abt.startkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * @描述：   @StartActivity
 * @作者：    @黄卫旗
 * @创建时间： @19/07/2018
 */
class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "onCreate()");
    }
}