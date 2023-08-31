package com.example.a1stproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends BaseAdapter {

    List<Model_Gridview> teams = new ArrayList<>();

    private LayoutInflater mInflater;
    Context context;

    public GridAdapter(Context context, List<Model_Gridview> teamGrid) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        this.teams = teamGrid;
    }

    public int getCount() {
        return teams.size();
    }

    public Object getItem(int i) {
        return teams.get(i);
    }

    public long getItemId(int i) {
        return i;
    }

    public static class ViewHolder {

        public ImageView img;
        public TextView name;
        public TextView dateofbirth;
         }


    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;

        if (view == null) {
            holder = new ViewHolder();
            view = mInflater.inflate(R.layout.grid_view, null);
            holder.img = (ImageView) view.findViewById(R.id.img);
            holder.name = (TextView) view.findViewById(R.id.name);
            holder.dateofbirth = (TextView) view.findViewById(R.id.dateofbirth);

            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.img.setImageResource(teams.get(i).getImg());
        holder.name.setText(teams.get(i).getName());
        holder.dateofbirth.setText(teams.get(i).getDateofbirth());

        return view;
    }

}
