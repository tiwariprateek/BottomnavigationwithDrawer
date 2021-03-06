package com.example.blackcofferassignment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 */
class SignUpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view:View,savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)

        view.findViewById<Button>(R.id.login_button).setOnClickListener {
            findNavController().navigate(R.id.editTagFragment,null)
        }
        view.findViewById<ImageButton>(R.id.google_image).setOnClickListener {
            findNavController().navigate(R.id.otpFragment,null)
        }
        view.findViewById<ImageButton>(R.id.facebook_image).setOnClickListener {
            findNavController().navigate(R.id.otpFragment,null)

        }
        view.findViewById<TextView>(R.id.login_text).setOnClickListener {
            findNavController().navigate(R.id.loginFragment,null)
        }
    }
}
