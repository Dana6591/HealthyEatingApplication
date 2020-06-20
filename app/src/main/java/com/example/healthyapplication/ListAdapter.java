package com.example.healthyapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    Context context;
    List<Foodbean> mDatas;

    public ListAdapter(Context context, List<Foodbean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }
    //  ListView row counts
    @Override
    public int getCount() {

        return mDatas.size();
    }
    // Return data corresponding to the specified location
    @Override
    public Object getItem(int position) {

        return mDatas.get(position);
    }
    // return id corresponding to the specified location
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.infolist_value,null);
            //Convert layout to view object
            holder =new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        else{
            holder=(ViewHolder)convertView.getTag();
        }

        //Loading control display content
        Foodbean foodbean=mDatas.get(position);
        holder.titleTv.setText(foodbean.getTitle());
        holder.notTv.setText("NOT MATCH: "+foodbean.getNotmatch());
        holder.iv.setImageResource(foodbean.getPicId());
        return convertView;
    }

    class ViewHolder{
        ImageView iv;
        TextView titleTv,notTv;
        public ViewHolder(View view){
            iv = view.findViewById(R.id.item_info);
            titleTv = view.findViewById(R.id.item_info_title);
            notTv = view.findViewById(R.id.item_info_NOMATCH);
        }
    }
}