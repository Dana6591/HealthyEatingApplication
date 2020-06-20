package food.grid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.healthyapplication.Foodbean;
import com.example.healthyapplication.Fooddetail;
import com.example.healthyapplication.R;


import java.io.Serializable;
import java.util.List;

public class FoodgridActivity extends AppCompatActivity {
GridView gv;
List<Foodbean>mDatas;

    private FoodgridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodgrid);
        gv = findViewById(R.id.foodgrid_gv);
//    data sources
        mDatas = Fooddetail.getAllFoodList();
//      create adapter objective
        adapter = new FoodgridAdapter(this, mDatas);
//       setting adapter
        gv.setAdapter(adapter);
        setListener();
    }

    private void setListener() {
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Foodbean foodBean = mDatas.get(position);
                Intent intent = new Intent(FoodgridActivity.this, FoodDesActivity.class);
                intent.putExtra("food", (Serializable) foodBean);
                startActivity(intent);
            }
        });
    }
}