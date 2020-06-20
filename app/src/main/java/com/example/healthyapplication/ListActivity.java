package com.example.healthyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import food.grid.FoodDesActivity;

public class ListActivity extends AppCompatActivity implements View.OnClickListener{
    EditText searchEt;
    ImageView search,flush;
    ListView show;
//Listview data sources
    List<Foodbean>mDatas;
    List<Foodbean>allFoodList;
     private  ListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initView();
//find controls
        mDatas = new ArrayList<>();
        allFoodList = Fooddetail.getAllFoodList();
        mDatas.addAll(allFoodList);
// create adapter /Baseadapter subclass
        adapter= new ListAdapter(this,mDatas);
        show.setAdapter(adapter);
       //Set up one-way click monitoring
        setListener();
            }

    private void setListener() {
        show.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Foodbean foodBean = mDatas.get(position);
                Intent intent = new Intent(ListActivity.this, FoodDesActivity.class);
                intent.putExtra("FOOD",foodBean);
                startActivity(intent);

            }
        });
    }



    private void initView() {
        searchEt = findViewById(R.id.info_et_search);
        search=findViewById(R.id.info_search);
        flush=findViewById(R.id.info_flush);
        show=findViewById(R.id.info_list);
        search.setOnClickListener(this);//Add listener for click events
        flush.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
    switch (v.getId()) {
        case R.id.info_flush:  //restore click
           searchEt.setText(" ");
            mDatas.clear();
            mDatas.addAll(allFoodList);
            adapter.notifyDataSetChanged();
            break;
        case R.id.info_search:         //search click
             String msg = searchEt.getText().toString().trim();  //get input info
            if (TextUtils.isEmpty(msg)) {
                Toast.makeText(this,"Please enter information",Toast.LENGTH_SHORT).show();
                return;
            }

            List<Foodbean>list = new ArrayList<>();
            for (int i = 0; i < allFoodList.size(); i++) {
                String title = allFoodList.get(i).getTitle();
                if (title.contains(msg)) {
                    list.add(allFoodList.get(i));
                }
            }
            mDatas.clear(); //Clear listview adapter data source content
            mDatas.addAll(list);  //Add new data to the data source
            adapter.notifyDataSetChanged(); //Update adapter
            break;
    }

    }
}
