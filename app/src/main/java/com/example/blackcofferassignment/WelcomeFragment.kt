package com.example.blackcofferassignment

import android.app.ActionBar
import android.opengl.Visibility
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_welcome.*


class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.login_text).setOnClickListener{
            findNavController().navigate(R.id.loginFragment,null)
        }
        view.findViewById<ImageButton>(R.id.facebook_image).setOnClickListener {
            findNavController().navigate(R.id.loginFragment,null)
        }
        view.findViewById<ImageButton>(R.id.google_image).setOnClickListener {
            findNavController().navigate(R.id.loginFragment,null)
        }
        view.findViewById<Button>(R.id.signup_button).setOnClickListener {
            findNavController().navigate(R.id.signUpFragment,null)
        }
    }

}


