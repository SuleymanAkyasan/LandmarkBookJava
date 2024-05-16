package com.example.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.landmarkbookjava.databinding.ActivityInformationsBinding;

public class InformationsActivity extends AppCompatActivity {

    private ActivityInformationsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInformationsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }
}