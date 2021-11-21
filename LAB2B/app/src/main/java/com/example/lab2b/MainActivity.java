package com.example.lab2b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        String[] values = new String[]{
                "ICT602",
                "MOBILE",
                "TECH",
                "ANDROID",
                "WELCOME",
                "CODING",
                "FUN",
                "ONLINE",
                "LEARNING",
                "TEST123",
                "NEVER",
                "GIVEUP!",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

    }
}