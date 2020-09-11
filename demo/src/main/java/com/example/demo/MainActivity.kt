package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.lifecycleOwner = this
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        mBinding.vm = viewModel

        mBinding.floatingActionButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setPositiveButton("positive".put(viewModel.isPositive.value!!), null)
                .setNegativeButton("negative".put(viewModel.isNegative.value!!), null)
                .setNeutralButton("neutral".put(viewModel.isNeutral.value!!), null)
                .show()
        }
    }

    fun String.put(boolean: Boolean) : String?{
        return if(boolean) this else null
    }
}