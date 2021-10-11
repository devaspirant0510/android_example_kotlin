package dev.seh.navigationcomponent

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.seh.navigationcomponent.databinding.FragMoreMoreInfoBinding

class MoreMoreInfoFrag:Fragment() {
    private lateinit var mBinding:FragMoreMoreInfoBinding
    companion object{
        private val TAG:String = this.javaClass.simpleName
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragMoreMoreInfoBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getBundle = arguments
        Log.e(TAG, "onViewCreated: $getBundle")
        getBundle?.get("key")

    }
}