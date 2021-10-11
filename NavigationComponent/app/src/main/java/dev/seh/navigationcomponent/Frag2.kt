package dev.seh.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.seh.navigationcomponent.databinding.Frag2Binding

class Frag2 : Fragment(){
    private lateinit var mBinding:Frag2Binding
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = Frag2Binding.inflate(layoutInflater)
        return mBinding.root
    }
}