package com.home.kotlinespressodemo.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.home.kotlinespressodemo.R
import com.home.kotlinespressodemo.databinding.FragmentMainBinding
import com.home.kotlinespressodemo.viewmodel.MainViewModel

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setDataBinding(view)
    }

    private fun setDataBinding(view: View) {
        DataBindingUtil.bind<FragmentMainBinding>(view)?.let { binding ->
            binding.viewModel = viewModel
            viewModel.signInValue.observe(viewLifecycleOwner) { value ->
                Toast.makeText(context, value, Toast.LENGTH_LONG).show()
            }
            binding.button.setOnClickListener {
                val account = binding.textInputEditTextAccount.text.toString()
                val password = binding.textInputEditTextPassword.text.toString()
                viewModel.signIn(account, password)
            }
        }
    }
}
