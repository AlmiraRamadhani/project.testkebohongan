package com.example.pendeteksikebohongan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //harus ada
        FragmentManager fm = getSupportFragmentManager(); // menyediakan lem untuk menempelkan fragment
        FragmentTransaction ft = fm.beginTransaction(); //buka tutup lemnya

        ft.add(R.id.frame1,new FragmentSatu());
        ft.add(R.id.frame2,new FragmentDua());

        ft.commit();
    }
}
