package com.example.bdlocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bdlocal.database.DatabaseHelper
import com.example.bdlocal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val bancoDados by lazy {  DatabaseHelper(this) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //val dbHelper = DatabaseHelper(this)

        with(binding){
            btnSalvar.setOnClickListener {
                salvar()
            }
        }



    }
}