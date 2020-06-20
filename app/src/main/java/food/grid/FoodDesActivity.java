package food.grid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.healthyapplication.Foodbean;
import com.example.healthyapplication.R;

public class FoodDesActivity extends AppCompatActivity {


        TextView titleTv1,titleTv2,descTv,notTv;
        ImageView backIv,bigPicIv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_food_desc);
            initView();
//        Received  datda from last page
            Intent intent = getIntent();
            Foodbean foodBean = (Foodbean) intent.getSerializableExtra("food");
//        show controls
            titleTv1.setText(foodBean.getTitle());
            titleTv2.setText(foodBean.getTitle());
            descTv.setText(foodBean.getDesc());
            notTv.setText(foodBean.getNotmatch());
            bigPicIv.setImageResource(foodBean.getPicId());
        }

        private void initView() {
            titleTv1 = findViewById(R.id.food_desc_tv_title1);
            titleTv2 = findViewById(R.id.food_desc_tv_title2);
            descTv = findViewById(R.id.food_desc_tv_desc);
            notTv = findViewById(R.id.food_desc_tv_not);
            backIv = findViewById(R.id.food_desc_iv_back);
            bigPicIv = findViewById(R.id.food_desc_iv_bigpic);
            backIv.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

