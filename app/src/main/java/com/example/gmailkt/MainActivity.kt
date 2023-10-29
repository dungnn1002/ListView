package com.example.gmailkt


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListAdapter
import android.widget.ListView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var listAdapter: ListAdapter
    private lateinit var gmail: Gmail
    var dataArrayList = ArrayList<Gmail?>()

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        var listImage = intArrayOf(
            R.drawable.boku ,
            R.drawable.vit,
            R.drawable.boku,
            R.drawable.vit,
            R.drawable.boku,
            R.drawable.vit,
            R.drawable.boku,
            R.drawable.vit,
            R.drawable.boku,
        )
        var title = arrayOf(
            "Xin chao",
            "Xin chao",
            "Xin chao",
            "Xin chao",
            "Xin chao",
            "Xin chao",
            "Xin chao",
            "Xin chao",
            "Xin chao",
        )

        var summary = arrayOf(
            "Xin chao chao moi nguoi ...",
            "Xin chao chao moi nguoi ..",
            "Xin chao chao moi nguoi ..",
            "Xin chao chao moi nguoi ..",
            "Xin chao chao moi nguoi ..",
            "Xin chao chao moi nguoi ..",
            "Xin chao chao moi nguoi ..",
            "Xin chao chao moi nguoi ..",
            "Xin chao chao moi nguoi ..",
        )

        var content = arrayOf(
            "Minh ten la Dung",
            "Minh ten la Dung",
            "Minh ten la Dung",
            "Minh ten la Dung",
            "Minh ten la Dung",
            "Minh ten la Dung",
            "Minh ten la Dung",
            "Minh ten la Dung",
            "Minh ten la Dung",
        )

        for(i in listImage.indices){
            gmail = Gmail(
                title[i],summary[i],content[i], listImage[i]
            )
            dataArrayList.add(gmail)
        }

        listAdapter = GmailAdapter(this@MainActivity,dataArrayList)
        var listview = findViewById<ListView>(R.id.listgmail)
        listview.adapter = listAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}