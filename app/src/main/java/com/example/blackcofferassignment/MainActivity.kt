package com.example.blackcofferassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toolbar.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var appBarConfiguration : AppBarConfiguration
    private lateinit var navigationView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.custom_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return

        val navController = host.navController
        drawerLayout = findViewById(R.id.drawer_layout)
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.editTagFragment, R.id.exploreFragment, R.id.savedFragment, R.id.trendingFragment),
            drawerLayout)

        setupActionBarWithNavController(navController, appBarConfiguration)
        setupBottomNavMenu(navController)
        setupNavigationMenu(navController)

        navController.addOnDestinationChangedListener{_,destination,_->
            when(destination.id) {
                R.id.editTagFragment -> toolbar_text.setText("#tags")
                R.id.trendingFragment -> toolbar_text.setText("Trending Now")
                R.id.exploreFragment -> toolbar_text.setText("Explore #tags")
                R.id.savedFragment -> toolbar_text.setText("Saved #tags")
            }
        }


        navController.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.welcomeFragment || destination.id == R.id.loginFragment
                || destination.id==R.id.signUpFragment || destination.id==R.id.otpFragment){
                toolbar.visibility=View.GONE
                bottomNavigationView.visibility=View.GONE
                navigationView.visibility=View.GONE
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            }
            else{
                toolbar.visibility=View.VISIBLE
                bottomNavigationView.visibility=View.VISIBLE
                navigationView.visibility=View.VISIBLE
                //If drawer Doesn't work then make it visible

            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.up_menu, menu)
        return true
    }
    private fun setupNavigationMenu(navController: NavController) {
        navigationView = findViewById(R.id.nav_view)
        navigationView.setupWithNavController(navController)
    }
    private fun setupBottomNavMenu(navController: NavController) {
        bottomNavigationView = findViewById(R.id.bottom_nav_view)
        bottomNavigationView.setupWithNavController(navController)
    }
        override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.my_nav_host_fragment).navigateUp(appBarConfiguration)
    }
}
