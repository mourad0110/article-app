package com.example.articles.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.articles.R;

public class DetailActivity extends AppCompatActivity {

    ImageView detailImg;
    TextView detailTitle, detailBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImg = findViewById(R.id.detailImg);
        detailTitle = findViewById(R.id.detailTitle);
        detailBody = findViewById(R.id.detailBody);

        Intent intent = getIntent();

        detailTitle.setText(intent.getStringExtra("title"));
        detailBody.setText(intent.getStringExtra("body"));

        String imageUrl = intent.getStringExtra("image");

        Glide.with(this)
                .load(imageUrl)
                .into(detailImg);
    }
}