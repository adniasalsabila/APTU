package com.pa.aptu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.pa.aptu.auth.Session
import com.pa.aptu.ui.*

class MainActivity : AppCompatActivity() {
    private var bottomNavigationView: BottomNavigationView? = null
    private var session: Session? = null
    private val isTwoPane = false
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()
        val user = mAuth.currentUser

        bottomNavigationView = findViewById(R.id.navigation)
        bottomNavigationView?.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            val id = menuItem.itemId
            if (id == R.id.homeMenu) {
                val fragment = HomeFragment()
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame_layout, fragment)
                fragmentTransaction.commit()
                title = "Beranda"
                //                    getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.));
            } else if (id == R.id.tiketMenu) {
                val fragment = TiketFragment()
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame_layout, fragment)
                fragmentTransaction.commit()
                title = "Tiket"
            } else if (id == R.id.historyMenu) {
                val fragment = RiwayatFragment()
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame_layout, fragment)
                fragmentTransaction.commit()
                title = "Riwayat Tiket"
            } else if (id == R.id.profileMenu) {
                val fragment = ProfileFragment()
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame_layout, fragment)
                fragmentTransaction.commit()
                title = "Profile"
            }
            true
        })
        bottomNavigationView?.setSelectedItemId(R.id.homeMenu)
    }

    private fun logout() {
        session!!.setLoggedin(false)
        finish()
        startActivity(Intent(this@MainActivity, LoginActivity::class.java))
    }
}
