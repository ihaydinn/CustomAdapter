package com.ismailhakkiaydin.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView lstCities;
    private Container container;
    private CustomAdapter adp;

    private void init(){
        lstCities = new ListView(this);
        container = new Container();
        adp= new CustomAdapter(this, container);
    }

    private void BindData(){
        lstCities.setAdapter(adp);
    }

    private void lstCities_ItemClick(){
        lstCities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                LinearLayout lay =(LinearLayout) view;
                TextView textView = (TextView) lay.findViewById(R.id.textView);
                MainActivity.this.setTitle("Choise : "+textView.getText());
            }
        });
    }

    private void registerHandlers(){
        lstCities_ItemClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(lstCities);
        BindData();
        registerHandlers();


    }
}
