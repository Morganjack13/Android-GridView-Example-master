package com.javatechig.gridviewexample;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        String title = getIntent().getStringExtra("title");
        Bitmap bitmap = getIntent().getParcelableExtra("image");

        //need to add the date and rating data right here

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText(title);

        //I think this is where we can add the date and rating value to the image
        //also we can add text to the image here maybe? I'm not sure how to create a text input though

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageBitmap(bitmap);
    }
}
