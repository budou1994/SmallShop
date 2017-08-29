package com.budou.smallshop.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.budou.smallshop.R;
import com.budou.smallshop.adapter.GridAdapter;
import com.budou.smallshop.adapter.homecontainer.RecyclerAdapter_home;
import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 首页功能展示
 */
public class HomeFragment extends Fragment {


    View view;
    private Unbinder unbinder;
    private List<Integer> lists;//GridView展示的数据源
    private List<View> viewLists;//将GridView添加到vp里面去
    private int pagersize = 8;//每页最大数目
    private int totalPage;//总的页数
    private ImageView[] ivImg;//小圆点的图片集合
    private GridAdapter ad;//展示GridView的adapter
    private GridView gridView;//展示GridView

    @BindView(R.id.banner_homeFragment)
    Banner banner;
    @BindView(R.id.vp_homeFragment)
    ViewPager vpHomeFragment;
    @BindView(R.id.linear_point_group)
    LinearLayout linearPointGroup;//圆点指示器
    @BindView(R.id.recycler_container_home)
    RecyclerView recyclerHome;

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        initBanner();
        initGrid();

        initRecycler();
        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        banner.startAutoPlay();
    }

    /**
     * 对首页轮播图进行展示
     */
    private void initBanner() {
        final List<Integer> images = new ArrayList<>();
        images.add(R.drawable.banner1);
        images.add(R.drawable.banner2);
        images.add(R.drawable.banner3);
        images.add(R.drawable.banner4);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(images);
        banner.setDelayTime(3000);
        banner.start();
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Toast.makeText(getActivity(), images.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 对首页GridView进行展示
     */
    private void initGrid() {
        lists = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            lists.add(R.drawable.test);
        }
        totalPage = (int) Math.ceil(lists.size() / pagersize);
        viewLists = new ArrayList<>();
        //每个页面都实例一个GridView。

        for (int i = 0; i < totalPage; i++) {
            gridView = (GridView) View.inflate(getActivity(),
                    R.layout.home_vp_gridview, null);
            ad = new GridAdapter(getActivity(), lists, i, pagersize);
            gridView.setAdapter(ad);
            final int finalI = i;
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Object obj = gridView.getItemAtPosition(position);
                    if (obj != null && obj instanceof Integer) {
                        Toast.makeText(getActivity(), (position + finalI * pagersize) + "", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            //将GridView添加到vp中
            viewLists.add(gridView);
        }
        //设置vp的adapter
        vpHomeFragment.setAdapter(new VpAdapter(viewLists));
        //添加小圆点
        ivImg = new ImageView[totalPage];
        for (int i = 0; i < totalPage; i++) {
            ivImg[i] = new ImageView(getActivity());
            if (i == 0) {
                ivImg[i].setImageResource(R.drawable.banner_select_home_blue);
            } else {
                ivImg[i].setImageResource(R.drawable.banner_unselect_home_gray);
            }
            ivImg[i].setPadding(5, 0, 5, 0);
            linearPointGroup.addView(ivImg[i]);
        }
        //设置GridView区域的自适应高度
        int total = 0;
        ListAdapter adapter = gridView.getAdapter();
        for (int i = 0; i < 8; i += 4) {
            View itemView = adapter.getView(i, null, gridView);
            itemView.measure(0, 0);
            total += itemView.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = vpHomeFragment.getLayoutParams();
        params.height = total + gridView.getPaddingTop() + gridView.getPaddingBottom();
        vpHomeFragment.setLayoutParams(params);

        //设置vp选中事件
        vpHomeFragment.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < totalPage; i++) {
                    if (position == i) {
                        ivImg[i].setImageResource(R.drawable.banner_select_home_blue);
                    } else {
                        ivImg[i].setImageResource(R.drawable.banner_unselect_home_gray);
                    }
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    /**
     * 对首页下RecycleView进行一个初始化
     */
    private void initRecycler() {
        RecyclerAdapter_home adapter_home = new RecyclerAdapter_home(getActivity());
        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        GridLayoutManager manager=new GridLayoutManager(getActivity(),2);
        recyclerHome.setLayoutManager(staggeredGridLayoutManager);
        recyclerHome.setAdapter(adapter_home);
    }


    @Override
    public void onStop() {
        super.onStop();
        banner.stopAutoPlay();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    //轮播图片加载图
    private class GlideImageLoader extends ImageLoader {

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context)
                    .load(path)
                    .into(imageView);
        }
    }

    //viewpager 适配器
    private class VpAdapter extends PagerAdapter {
        List<View> list;

        VpAdapter(List<View> list) {
            this.list = list;
        }

        @Override
        public int getCount() {
            return list != null ? list.size() : 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        /**
         * 将当前的View添加到ViewGroup容器中
         * 这个方法，return一个对象，这个对象表明了PagerAdapter适配器选择哪个对象放在当前的ViewPage上
         */
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(list.get(position));
            return list.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

}
