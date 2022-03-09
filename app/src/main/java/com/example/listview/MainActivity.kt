package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val kucing = arrayOf("Oren", "Anggora", "British Short Hair", "Persia", "Kampung")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,kucing)
        lv_kucing.adapter = adapter
        
        lv_kucing.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Ini adalah kucing ${kucing[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}