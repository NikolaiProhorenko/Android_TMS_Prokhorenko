package android.tms_prokhorenko

import android.os.Bundle
import android.support.v4.app.Fragment
import android.tms_prokhorenko.databinding.RegistrationFormBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController

class LoginActivity : Fragment() {

    private lateinit var binding: RegistrationFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RegistrationFormBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        isLoginButtonEnabled()
    }

    private fun isLoginButtonEnabled() {
        binding.passwordEditText.doAfterTextChanged { password ->
            password?.length?.let {
                if (password.length >= 8) {
                    binding.buttonLogin.apply {
                        isEnabled = true
                        setOnClickListener {
                            findNavController().navigate(R.id.action_LoginFragment_to_NewsFragment)
                        }
                    }
                } else {
                    binding.buttonLogin.apply {
                        isEnabled = false
                    }
                }
            }
        }
    }
}