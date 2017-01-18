package com.atguigu.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * 作者：尚硅谷-杨光福 on 2017/1/18 14:54
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：RecyclerView的适配器
 */
public class RecyclerDemoAdapter extends RecyclerView.Adapter<RecyclerDemoAdapter.MyViewHolder> {

    private final Context mContext;
    private final ArrayList<String> datas;

    public RecyclerDemoAdapter(Context context, ArrayList<String> datas) {
        this.mContext = context;
        this.datas = datas;
    }

    /**
     * 得到数据的总数
     * @return
     */
    @Override
    public int getItemCount() {
        return datas.size();
    }

    /**
     * 创建ViewHolder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(View.inflate(mContext,R.layout.item,null));
    }

    /**
     * 把数据绑定到ViewHolder上
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //1.根据位置得到数据
        String data = datas.get(position);
        //2.绑定数据
        holder.tv_name.setText(data);


    }



    /**
     * ViewHolder
     */
    class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv_icon;
        private TextView tv_name;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }
}
