package dev.seh.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dev.seh.navigationcomponent.databinding.Frag1Binding

class Frag1: Fragment() {
    private lateinit var mBinding: Frag1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = Frag1Binding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.btnClick.setOnClickListener {
            it.findNavController().navigate(R.id.moreInfoFrag)
        }
    }
}