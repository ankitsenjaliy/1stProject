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

public class ListAdapter extends BaseAdapter {

    List<Model_Listview> teams=new ArrayList<>();
    private LayoutInflater mInflater;
    Context context;

    public ListAdapter(Context context, List<Model_Listview> teamList) {
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context=context;
        this.teams=teamList;
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
        public TextView name;
        public TextView dateofbirth;
        public ImageView img;
        public TextView time;
        public ImageView call;
        public ImageView whatsapp;
        public ImageView share;
    }


    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;

        if (view == null) {
            holder = new ViewHolder();
            view = mInflater.inflate(R.layout.list_view, null);
            holder.img = (ImageView) view.findViewById(R.id.img);
            holder.name = (TextView) view.findViewById(R.id.name);
            holder.dateofbirth = (TextView) view.findViewById(R.id.dateofbirth);
            holder.time = (TextView) view.findViewById(R.id.time);
            holder.call = (ImageView) view.findViewById(R.id.call);
            holder.whatsapp = (ImageView) view.findViewById(R.id.whatsapp);
            holder.share = (ImageView) view.findViewById(R.id.share);

            view.setTag(holder);

        }
        else
        {
            holder = (ViewHolder)view.getTag();
        }

        holder.img.setImageResource(teams.get(i).getImg());
        holder.name.setText(teams.get(i).getName());
        holder.dateofbirth.setText(teams.get(i).getDateofbirth());
        holder.time.setText("Last Seen : " + teams.get(i).getTime());


        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCall(teams.get(i).call);

                //Toast.makeText(context,"click on call",Toast.LENGTH_LONG).show();
            }
        });

        holder.whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whatsAppShare("Name = " + teams.get(i).name + " " + "Phone No. = " + teams.get(i).call);

                //Toast.makeText(context,"click on whatsapp",Toast.LENGTH_LONG).show();
            }
        });

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareContent("Name = " + teams.get(i).name + " " + "Birth Date = " + teams.get(i).dateofbirth + " " + "Phone No. = " + teams.get(i).call);

                //Toast.makeText(context,"click on share",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
    public void setCall(String number)
    {
        Intent phone_no = new Intent(Intent.ACTION_DIAL);
        phone_no.setData(Uri.parse("tel:"+number));
        context.startActivity(phone_no);
    }

    public void shareContent(String name)
    {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT,""+name);
        shareIntent.setType("text/plain");
        context.startActivity(shareIntent);
    }

    public  void whatsAppShare(String name)
    {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setPackage("com.whatsapp");
        shareIntent.putExtra(Intent.EXTRA_TEXT,""+name);
        shareIntent.setType("text/plain");
        context.startActivity(shareIntent);
    }

}
