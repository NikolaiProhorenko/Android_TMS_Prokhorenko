package fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class NewsFragment() {
    private lateinit var binding: FragmentNewsBinding

    override fun OncreatedView (
        inflate: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false);
        return binding.root
    }
}