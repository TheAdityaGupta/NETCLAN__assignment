package com.assignment.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout



class MainActivity : AppCompatActivity() {
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpDrawerLayout()

        val checklistButton = findViewById<ImageButton>(R.id.checklistButton)
        checklistButton.setOnClickListener {
            // Create an intent to start the Rekine.kt activity
            val intent = Intent(this, Refine::class.java)
            startActivity(intent)
        }
    }
    private fun setUpDrawerLayout() {
        val appbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.appBar)
        setSupportActionBar(appbar)
        val mainDraawer = findViewById<DrawerLayout>(R.id.mainDrawer)
        actionBarDrawerToggle = ActionBarDrawerToggle(
            this, mainDraawer,
            R.string.app_name,
            R.string.app_name
        )
        actionBarDrawerToggle.syncState()
    }

}