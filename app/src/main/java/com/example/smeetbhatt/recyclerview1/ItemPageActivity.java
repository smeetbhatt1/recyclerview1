package com.example.smeetbhatt.recyclerview1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemPageActivity extends AppCompatActivity {

    TextView head,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);

        head = (TextView) findViewById(R.id.pageHead);
        desc = (TextView) findViewById(R.id.pageDesc);
        Intent i = getIntent();
        head.setText(i.getExtras().getString("head"));
        desc.setText(i.getExtras().getString("desc"));

    }
}
