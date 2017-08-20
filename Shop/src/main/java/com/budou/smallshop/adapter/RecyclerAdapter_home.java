package com.budou.smallshop.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.budou.smallshop.R;
import com.budou.smallshop.bean.HomeMessage;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 杨大少 on 2017/8/20.
 * 首页RecycleView的adapter
 */

public class RecyclerAdapter_home extends RecyclerView.Adapter<RecyclerAdapter_home.HomeRecycleHolder> {

    Context context;
    List<HomeMessage> list;


    @Override
    public HomeRecycleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomeRecycleHolder holder = null;
        holder = new HomeRecycleHolder(LayoutInflater.from(context)
                .inflate(R.layout.home_item_recycler, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(HomeRecycleHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class HomeRecycleHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title_header_recycler_home)
        TextView tv_title_header;
        @BindView(R.id.more_header_recycler_home)
        TextView tv_more_header;
        @BindView(R.id.content_recycler_home)
        RecyclerView recycle_content;

        public HomeRecycleHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }

    class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder> {


        @Override
        public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            ItemHolder holder = new ItemHolder(LayoutInflater.from(context)
                    .inflate(R.layout.home_item_recycler_content_item, parent, false));
            return holder;
        }

        @Override
        public void onBindViewHolder(ItemHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 4;
        }

        class ItemHolder extends RecyclerView.ViewHolder {

            @BindView(R.id.img_recycle_content_item)
            ImageView img;

            public ItemHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }
        }


    }

    ;

}
