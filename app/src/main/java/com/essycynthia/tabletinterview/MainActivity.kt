package com.essycynthia.tabletinterview

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.essycynthia.tabletinterview.adaapters.FirstAdapter
import com.essycynthia.tabletinterview.adaapters.SecondAdapter
import com.essycynthia.tabletinterview.adaapters.ThirdAdapter
import com.essycynthia.tabletinterview.data.Icons
import com.essycynthia.tabletinterview.data.SecondRecyclerData
import com.essycynthia.tabletinterview.data.ThirdRecyclerData
import com.essycynthia.tabletinterview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var iconsList: ArrayList<Icons>
    private lateinit var secondList: ArrayList<SecondRecyclerData>
    private lateinit var thirdList: ArrayList<ThirdRecyclerData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        iconsList = arrayListOf(
            Icons(R.drawable.dashboard),
            Icons(R.drawable.orders),
            Icons(R.drawable.products),
            Icons(R.drawable.customers),
            Icons(R.drawable.payments),
            Icons(R.drawable.outline_settings_24),
            Icons(R.drawable.outline_logout_24)
        )
        secondList = arrayListOf(
            SecondRecyclerData(R.drawable.__seater, "02/02","20.00.00","T1","Unpaid","$240.00"),
            SecondRecyclerData(R.drawable.__3seater, "03/03","15.45.20","T2","Unpaid","$168.48"),
            SecondRecyclerData(R.drawable.__4seater, "04/04","19.48.21","T3","Unpaid","$316.20"),
            SecondRecyclerData(R.drawable.__5seater, "05/05","20.00.00","T4","Unpaid","$499.99"),
            SecondRecyclerData(R.drawable.__6seater, "06/06","16.43.28","T5","Unpaid","$469.29"),
            SecondRecyclerData(R.drawable.__7seater, "07/07","19.51.19","T6","Unpaid","$499.99"),
            SecondRecyclerData(R.drawable.__8seater, "08/08","18.45.55","T7","Unpaid","$479.99"),
            SecondRecyclerData(R.drawable.__9seater, "09/09","15.45.20","T8","Unpaid","$168.48"),
            SecondRecyclerData(R.drawable._10_seater, "10/10","15.45.20","T9","Unpaid","$316.20"),
            SecondRecyclerData(R.drawable._11_seater, "11/11","13.45.20","T10","Unpaid","$112.20"),
            SecondRecyclerData(R.drawable._12_seater, "12/12","19.19.20","T11","Unpaid","$510.20"),
            SecondRecyclerData(R.drawable._3_seater, "13/13","20.00.00","T12","Unpaid","$618.00"),

        )
        thirdList = arrayListOf(
            ThirdRecyclerData(R.drawable.food_1,"x2","Chicken Fried rice","$7.92","$3.96","Large" ),
            ThirdRecyclerData(R.drawable.food_2,"x1","Mushroom Biryani","$4.06","$4.06","Regular"),
            ThirdRecyclerData(R.drawable.food_3,"x1","Hyderabadi Biryani","$4.24","$4.24","Large"),
            ThirdRecyclerData(R.drawable.food_4,"x2","Pepsi (350ml)","3.32","$1.66","Regular")
        )
        val firstAdapter = FirstAdapter(iconsList)
        val secondAdapter = SecondAdapter(secondList)
        val thirdAdapter = ThirdAdapter(thirdList)

        binding.firstRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.firstRecyclerView.adapter = firstAdapter
        binding.firstRecyclerView.setHasFixedSize(true)
        binding.secondRecyclerView.layoutManager = GridLayoutManager(this,2)
        binding.secondRecyclerView.adapter = secondAdapter
        binding.secondRecyclerView.setHasFixedSize(true)
        binding.thirdRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.thirdRecyclerView.adapter = thirdAdapter
        binding.thirdRecyclerView.setHasFixedSize(true)




    }


}