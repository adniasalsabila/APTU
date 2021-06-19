package com.pa.aptu.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.pa.aptu.R
import com.pa.aptu.auth.Session

class ProfileFragment : Fragment() {
    private var databaseReference: DatabaseReference? = null
    private var mUserID: String? = null
    private var mNamaUser: TextView? = null
    private var mEmailUser: TextView? = null
    private var mLogout: Button? = null
    private var session: Session? = null
    private lateinit var mAuth: FirebaseAuth
    //    var methodFunction = MethodFunction()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        mAuth = FirebaseAuth.getInstance()
        val currentUser = mAuth.currentUser
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view_profil = inflater.inflate(R.layout.fragment_profile, container, false)
        setHasOptionsMenu(true)




        return view_profil
    }
}
