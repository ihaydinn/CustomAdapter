package com.ismailhakkiaydin.customadapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private Container model;

    public CustomAdapter(Context context, Container model) {
        this.context = context;
        this.model = model;
    }


    @Override
    public int getCount() {
        //object count
        return model.getVector().size();
    }

    @Override
    public Object getItem(int position) {
        return model.getVector().get(position);
        //take object for index info
    }

    @Override
    public long getItemId(int position) {
        return ((City)this.getItem(position)).getAutoNumber();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        City city = (City) getItem(position);

        LayoutInflater li = ((Activity)context).getLayoutInflater();
        LinearLayout pnlItem = (LinearLayout) li.inflate(R.layout.member_design, null);

        TextView textCity = pnlItem.findViewById(R.id.textView);
        textCity.setText(city.getName());

        TextView autoNum = pnlItem.findViewById(R.id.textView2);
        autoNum.setText(String.valueOf(city.getAutoNumber()));

        ImageView imgImage = pnlItem.findViewById(R.id.imageView);
        Resources res = context.getResources();
        Drawable drw = res.getDrawable(city.getImage());
        imgImage.setImageDrawable(drw);

        return pnlItem;
    }

    // Programatik
    /*
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Sehir shr = (Sehir) getItem(position);

        LinearLayout pnlItem = new LinearLayout(context);
        pnlItem.setOrientation(LinearLayout.HORIZONTAL);

        TextView txtIsim = new TextView(context);
        txtIsim.setText(shr.getIsim());

        TextView txtPlaka = new TextView(context);
        txtPlaka.setText(String.valueOf(shr.getPlaka()));

        ImageView imgGorsel = new ImageView(context);
        Resources res = context.getResources();
        Drawable drw = res.getDrawable(shr.getGorsel());
        imgGorsel.setImageDrawable(drw);

        pnlItem.addView(imgGorsel);
        pnlItem.addView(txtIsim);
        pnlItem.addView(txtPlaka);

        return pnlItem;
    }
    */

}
