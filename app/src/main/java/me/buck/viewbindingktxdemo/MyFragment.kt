package me.buck.viewbindingktxdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.buck.viewbindingktx.viewBinding
import me.buck.viewbindingktxdemo.databinding.FragmentMyBinding

class MyFragment : Fragment(R.layout.fragment_my) {

    val binding by viewBinding(FragmentMyBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding not init
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tv.text = "fragment by viewbinding-ktx"
    }

    override fun onDestroyView() {
        // binding == null
        super.onDestroyView()
    }
}