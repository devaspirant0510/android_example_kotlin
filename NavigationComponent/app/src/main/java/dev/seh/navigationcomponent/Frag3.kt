package dev.seh.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.seh.navigationcomponent.databinding.Frag3Binding

class Frag3 :Fragment(){
    private lateinit var mBinding:Frag3Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = Frag3Binding.inflate(layoutInflater)
        return mBinding.root
    }
}