package com.example.healthyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.healthyapplication.ListActivity;
import food.grid.FoodgridActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onClick(View view) {
        Intent intent =new Intent();
        switch (view.getId()){
            case R.id.menu_btn1:
          intent.setClass(MenuActivity.this,ListActivity.class);
                break;
            case R.id.menu_btn2:
                intent.setClass(MenuActivity.this,FoodgridActivity.class);
                break;
        }
        startActivity(intent);
    }
}
