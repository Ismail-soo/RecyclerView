package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "08172888399", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),

        )
        CardView(listStudent)


    }

    private fun lisView(value : ArrayList<MyContact>){
        val adapter = ListViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value : ArrayList<MyContact>){
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun CardView(value : ArrayList<MyContact>){
        val adapter = CardViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}