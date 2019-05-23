package com.example.GoogleMapAPI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by webnautes on 2017-11-27.
 */

public class NewActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity);


        String title = "";
        String type = "";

        Bundle extras = getIntent().getExtras();

        if (extras == null) {
            title = "error";
        }
        else {
            title = extras.getString("title");
            type = extras.getString("type");

        }

        TextView textView = (TextView) findViewById(R.id.textView_newActivity_contentString);

        String str = title + '\n' + type + '\n';
        textView.setText(str);

    }
}
