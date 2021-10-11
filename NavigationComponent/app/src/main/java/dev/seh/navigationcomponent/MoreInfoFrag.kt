package dev.seh.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dev.seh.navigationcomponent.databinding.FragMoreInfoBinding

class MoreInfoFrag :Fragment(){
    private lateinit var mBinding:FragMoreInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragMoreInfoBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.btnMoreInfo.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key","key")
            it.findNavController().navigate(R.id.moreMoreInfoFrag,bundle)
        }
    }
}