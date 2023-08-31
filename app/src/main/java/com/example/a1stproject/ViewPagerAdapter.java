package com.example.a1stproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.Objects;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    int[] images;
    LayoutInflater mLayoutInflater;


    public ViewPagerAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

    public int getCount() {
        return images.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == ((FrameLayout) object);
    }

    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = mLayoutInflater.inflate(R.layout.view_pager, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.img);

//        Button Click
       Button btn_click = (Button) itemView.findViewById(R.id.btn_click);

        btn_click.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context,"THANK YOU " + position,Toast.LENGTH_LONG).show();

               Intent intent = new Intent(context, RecyclerviewActivity.class);
               context.startActivity( intent );

           }
       });
//        Button click puri

        imageView.setImageResource(images[position]);
        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((FrameLayout) object);
    }
}
