package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class mainscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mainscreen);

        List<String> list = new ArrayList<>();
        list.add("Все");
        list.add("Outdoor");
        list.add("Tennis");
        list.add("Football");

        RecyclerView main = findViewById(R.id.categories);
        CategoriesAdapter adapter = new CategoriesAdapter(this, list);
        main.setAdapter(adapter);

        LinearLayout button = findViewById(R.id.butHome);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mainscreen.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}