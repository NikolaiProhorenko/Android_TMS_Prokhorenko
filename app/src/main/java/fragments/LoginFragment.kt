package fragments

import android.os.Bundle
import android.tms_prokhorenko.R
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.NavHostFragment.findNavController

class LoginFragment () {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
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
