package com.ali.learnexample.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ali.learnexample.R;

public class DetailsActivity extends AppCompatActivity {
    private TextView title;
    private TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        title = findViewById(R.id.tvTitleDetID);
        desc = findViewById(R.id.tvDecDetID);
        Bundle data = getIntent().getExtras();
        title.setText(data.getString("title"));
        desc.setText(data.getString("desc"));
    }

    @Override
    public void onBackPressed() {
        this.finish();
    }
}
