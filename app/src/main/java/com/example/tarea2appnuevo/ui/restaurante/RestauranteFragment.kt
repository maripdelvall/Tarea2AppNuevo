package com.example.tarea2appnuevo.ui.restaurante

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.dynamicfeatures.fragment.R
import com.example.tarea2appnuevo.databinding.FragmentRestauranteBinding
import com.example.tarea2appnuevo.viewmodel.RestauranteViewModel

class RestauranteFragment : Fragment() {

    private lateinit var RestauranteViewModel: RestauranteViewModel
    private var _binding: FragmentRestauranteBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         RestauranteViewModel =
            ViewModelProvider(this).get(RestauranteViewModel::class.java)

        _binding = FragmentRestauranteBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        RestauranteViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}