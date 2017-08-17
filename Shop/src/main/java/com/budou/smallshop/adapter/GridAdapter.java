package com.budou.smallshop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.budou.smallshop.R;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by 杨大少 on 2017/8/17.
 * <p>
 * 首页展示grid view的适配器
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    private List<Integer> lists;//传递总的数据源
    private int mindex;//当前页数
    private int mpagersize;//每页的最大数目

    public GridAdapter(Context context, List<Integer> lists, int mindex, int mpagersize) {
        this.context = context;
        this.lists = lists;
        this.mindex = mindex;
        this.mpagersize = mpagersize;
    }

    /**
     * 先判断数据及的大小是否显示满本页lists.size() > (mIndex + 1)*mPagerSize
     * 如果满足，则此页就显示最大数量lists的个数
     * 如果不够显示每页的最大数量，那么剩下几个就显示几个
     */
    @Override
    public int getCount() {
        return lists.size() > (mindex + 1) * mpagersize ?
                mpagersize : (lists.size() - mindex * mpagersize);
    }


    /**
     * @param position 当前GridView下标
     * @return 第二页返回数据应该加上第一页的全部数据
     */
    @Override
    public Object getItem(int position) {
        return lists.get(position + mindex * mpagersize);
    }


    @Override
    public long getItemId(int position) {
        return position + mpagersize * mindex;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridViewHolder holder = null;
        if (convertView == null) {
            holder = new GridViewHolder();
            convertView=LayoutInflater.from(context).inflate(
                    R.layout.home_item_gridview,parent,false);
            holder.img_icon = (ImageView) convertView.findViewById(R.id.img_icon);
            holder.text_name = (TextView) convertView.findViewById(R.id.text_name);
            convertView.setTag(holder);
        } else {
            holder = (GridViewHolder) convertView.getTag();
        }
        //获取到全部数据的下标
        int pos = position + mindex * mpagersize;
        holder.text_name.setText("测试数据" + pos + "");
        Glide.with(context)
                .load(lists.get(pos))
                .into(holder.img_icon);
        return convertView;
    }

    private class GridViewHolder {
        private TextView text_name;
        private ImageView img_icon;
    }
}
