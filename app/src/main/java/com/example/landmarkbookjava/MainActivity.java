package com.example.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.landmarkbookjava.databinding.ActivityInformationsBinding;
import com.example.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<informationsData> informationsArray;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        informationsArray = new ArrayList<>();

        informationsData pisa = new informationsData("Pisa","Italy",R.drawable.pisa);
        informationsData eiffel = new informationsData("Eiffel","France",R.drawable.eiffel);
        informationsData colosseum = new informationsData("Colosseum","Italy",R.drawable.colosseum);
        informationsData sumelaMonastery = new informationsData("Sumela Monastery","Türkiye",R.drawable.sumelamonastery);


        informationsArray.add(pisa);
        informationsArray.add(eiffel);
        informationsArray.add(colosseum);
        informationsArray.add(sumelaMonastery);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(informationsArray);
        binding.recyclerView.setAdapter(landmarkAdapter);
    }
}


