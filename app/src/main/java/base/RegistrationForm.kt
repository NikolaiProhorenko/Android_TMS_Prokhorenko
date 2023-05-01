package base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.tms_prokhorenko.databinding.FragmentRegistrationFormBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RegistrationForm : Fragment () {
    private var binding: FragmentRegistrationFormBinding? = null
    private var binding get() = binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRegistrationFormBinding.inflate(inflater, container, false)
        return binding.root
}