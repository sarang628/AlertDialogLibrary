package com.example.alertdialoglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import AlertDialogTest
import com.example.alertdialog.sample.SampleFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SampleFragment.enter(supportFragmentManager, R.id.container)
    }
}