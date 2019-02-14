package com.ali.learnexample.activities;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.ali.learnexample.R;
import com.ali.learnexample.adapter.MyAdapter;
import com.ali.learnexample.model.ListItem;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ListItem item = new ListItem("item " + i, "Description " + i, "" + i);
            listitems.add(item);
        }
        adapter = new MyAdapter(this, listitems);
        recyclerView.setAdapter(adapter);
    }
}
