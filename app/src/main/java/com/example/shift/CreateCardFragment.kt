package com.example.shift

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shift.databinding.FragmentCreateCardBinding

class CreateCardFragment : Fragment() {
private lateinit var binding: FragmentCreateCardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateCardBinding.inflate(inflater, container, false)

        return binding.root
    }
}