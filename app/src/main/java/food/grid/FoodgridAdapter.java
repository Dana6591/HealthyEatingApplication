package food.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.healthyapplication.Foodbean;
import com.example.healthyapplication.R;

import java.util.List;

public class FoodgridAdapter extends BaseAdapter {
    Context context;
    List<Foodbean>mDatas;


    public FoodgridAdapter(Context context, List<Foodbean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       //    ViewHolder
            ViewHolder holder = null;
            if (convertView == null) {
                //check for vireto reuse
                convertView = LayoutInflater.from(context).inflate(R.layout.item_foodgrid,null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            }else {
                holder = (ViewHolder) convertView.getTag();
            }
//        Get the data at the specified location
            Foodbean foodBean = mDatas.get(position);
            holder.iv.setImageResource(foodBean.getPicId());
            holder.tv.setText(foodBean.getTitle());
            return convertView;
        }

        class ViewHolder{
            ImageView iv;
            TextView tv;
            public ViewHolder(View view){
                iv = view.findViewById(R.id.item_grid_iv);
                tv = view.findViewById(R.id.item_grid_tv);
            }
        }
}
