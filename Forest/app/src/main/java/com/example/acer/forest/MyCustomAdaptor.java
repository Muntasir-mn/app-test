package com.example.acer.forest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Acer on 07-Apr-18.
 */

public class MyCustomAdaptor extends BaseAdapter {

    String[] namesz;
    int[] imssz;
    Context ct;
    private static LayoutInflater inflater = null;
    //constructor
    public MyCustomAdaptor(MainActivity mainact, String[] nameofos, int[] osims) {
        namesz = nameofos;
        imssz = osims;
        ct = mainact;
        inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    
    @Override
    public int getCount() {
        return namesz.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class MyHolder {
        TextView tvs;
        ImageView ims;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        MyHolder myh = new MyHolder();
        View myview;

        myview = inflater.inflate(R.layout.layoutttt, null);

        myh.tvs = (TextView) myview.findViewById(R.id.textviewid);
        myh.ims = (ImageView) myview.findViewById(R.id.imageviewid);

        myh.tvs.setText(namesz [position]);
        myh.ims.setImageResource(imssz[position]);

        myview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ct, "Clicked on " + namesz[position], Toast.LENGTH_LONG).show();
            }
        });

        return myview;
    }
}
