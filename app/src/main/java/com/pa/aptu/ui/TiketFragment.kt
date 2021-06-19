package com.pa.aptu.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.pa.aptu.R

class TiketFragment : Fragment() {
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
        val fotm_tiket = inflater.inflate(R.layout.fragment_tiket, container, false)
        setHasOptionsMenu(true)




        return fotm_tiket
    }
}