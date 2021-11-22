package com.example.lab2c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5,R.drawable.image6, R.drawable.image7, R.drawable.image8,
            R.drawable.image9,
    };

    public imageAdapter(Context c){ mContext = c; }

    @Override
    public int getCount(){ return thumbImages.length; }

    @Override
    public Object getItem(int position){ return thumbImages[position]; }

    @Override
    public long getItemId(int position){ return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }


}
