package com.example.hoteligo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MumbaiListActivity extends AppCompatActivity {

    ListView list;
    String hotels[]= {
            "Raddison Blu Mumbai"
            ,"Taj hotel"
            ,"JW Marriot"
            ,"Hotel New Palace"
            ,"Hotel Raj Palace"
            ,"Greenwood Resort"
            ,"Hotel Counter"
            ,"Hotel Royal De Casa",
            "Hotel Lalit",
            "Hotel Mayflower",
            "Hotel Millenium"
    };

    Integer image[] = {
            R.drawable.food8,
            R.drawable.food1,
            R.drawable.food2,
            R.drawable.food3,
            R.drawable.food4,
            R.drawable.food5,
            R.drawable.food6,
            R.drawable.food7,
            R.drawable.food8,
            R.drawable.food1,
            R.drawable.food2,
            R.drawable.food3,
            R.drawable.food5
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai_list);
    }
}