package com.budou.smallshop;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.transition.Transition;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.budou.smallshop.fragment.HomeFragment;
import com.budou.smallshop.fragment.MyFragment;
import com.budou.smallshop.fragment.SearchFragment;
import com.budou.smallshop.fragment.ShopFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    @BindView(R.id.bottom_bar)
    BottomBar bottomBar;

    Fragment homeFragment;
    Fragment searchFragmet;
    Fragment shopFragment;
    Fragment myFragment;

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();

    }

    /**
     * 初始化数据
     */
    private void init() {
        manager = getSupportFragmentManager();
        showHomeFragment();
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.bottom_home:
                        showHomeFragment();
                        break;
                    case R.id.bottom_search:
                        showSearchFragment();
                        break;
                    case R.id.bottom_shop:
                        showShopFragment();
                        break;
                    case R.id.bottom_me:
                        showMyFragment();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    /**
     * 将所有fragment隐藏
     */
    private void hideAll() {
        FragmentTransaction tr = manager.beginTransaction();
        if (homeFragment != null) {
            tr.hide(homeFragment);
        }
        if (searchFragmet != null) {
            tr.hide(searchFragmet);
        }
        if (shopFragment != null) {
            tr.hide(shopFragment);
        }
        if (myFragment != null) {
            tr.hide(myFragment);
        }
        tr.commit();
    }

    /**
     * 展示首页
     */
    private void showHomeFragment() {
        hideAll();
        if (homeFragment == null) {
            homeFragment = new HomeFragment();
            manager.beginTransaction().add(R.id.frame_main, homeFragment)
                    .commit();
        } else {
            manager.beginTransaction().show(homeFragment)
                    .commit();
        }
    }

    /**
     * 展示搜索页
     */
    private void showSearchFragment() {
        hideAll();
        if (searchFragmet == null) {
            searchFragmet = new SearchFragment();
            manager.beginTransaction().add(R.id.frame_main, searchFragmet)
                    .commit();
        } else {
            manager.beginTransaction().show(searchFragmet)
                    .commit();
        }
    }

    /**
     * 展示购物车页面
     */
    private void showShopFragment() {
        hideAll();
        if (shopFragment == null) {
            shopFragment = new ShopFragment();
            manager.beginTransaction().add(R.id.frame_main, shopFragment)
                    .commit();
        } else {
            manager.beginTransaction().show(shopFragment)
                    .commit();
        }
    }

    /**
     * 展示我的页面
     */
    private void showMyFragment() {
        hideAll();
        if (myFragment == null) {
            myFragment = new MyFragment();
            manager.beginTransaction().add(R.id.frame_main, myFragment)
                    .commit();
        } else {
            manager.beginTransaction().show(myFragment)
                    .commit();
        }
    }

}
