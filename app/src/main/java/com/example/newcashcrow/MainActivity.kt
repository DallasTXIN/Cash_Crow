package com.example.newcashcrow

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.newcashcrow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //DO NOT GET RID OF THIS! IT HELPS RUN THE APP!
        setSupportActionBar(binding.toolbar)
        //DO NOT GET RID OF THIS! IT HELPS RUN THE APP!

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        //This is the functioning part of the dollar sign in the bottom right corner.
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Pressing This Does Nothing Right Now. Find A Way To Replace This Function.", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()
        }
        //This is the functioning part of the dollar sign in the bottom right corner.

        //This is the design of the help button in the top right corner.
        binding.button.setOnClickListener { view ->
            Snackbar.make(view, "This Is The Help Button. Try Fixing This Before Adding Stuff In.", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()
        }
        //This is the design of the help button in the top right corner.
    }
}