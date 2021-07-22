package com.example.test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.test.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener(){
            //val telNo = Uri.parse("tel:012344546")
            //val intent = Intent(Intent.ACTION_DIAL,telNo)

            val geo = Uri.parse("geo:3.1398, 101.6869")
            val intent = Intent(Intent.ACTION_VIEW,geo)

            try{
                startActivity(intent)
            }catch (e:ActivityNotFoundException){
                Toast.makeText(this,"Action no found", Toast.LENGTH_LONG)
            }
        }

    }

}