package com.example.acer.forest;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylist = (ListView) findViewById(R.id.mylistview);

        String[] myos = {"Android", "Apple", "Windows"};
        int[] myosimg = {R.drawable.android, R.drawable.apple, R.drawable.windows};

        MyCustomAdaptor myAdap = new MyCustomAdaptor(this, myos, myosimg);

        mylist.setAdapter(myAdap);

    }


}
