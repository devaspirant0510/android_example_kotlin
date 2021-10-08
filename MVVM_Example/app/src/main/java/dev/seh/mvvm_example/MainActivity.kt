package dev.seh.mvvm_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import dev.seh.mvvm_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG:String = this.javaClass.simpleName
    }
    private lateinit var mViewModel:MainActivityViewModel
    private lateinit var mBinding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        mViewModel.currentValue.observe(this,  {
            Log.e(TAG, "onCreate: $it")
            mBinding.textView.text = it.toString()
        })
        event()
    }
    private fun event(){
        mBinding.btnShiftLeft.setOnClickListener {
            mViewModel.updateValue(ActionType.SHIFT_LEFT,mBinding.editText.text.toString().toInt())
        }
        mBinding.btnShiftRight.setOnClickListener {

            mViewModel.updateValue(ActionType.SHIFT_RIGHT,mBinding.editText.text.toString().toInt())
        }
    }
}