package com.max.news.MVP.home.channelist;

import com.max.news.MVP.home.channelist.bean.Pagebean;
import com.max.news.base.BasePresenter;
import com.max.news.base.BaseView;
import com.max.news.MVP.home.channelist.bean.ChannelInfoBean;

import java.util.Map;

import rx.Observable;

/**
 * @auther MaxLiu
 * @time 2017/1/4
 */

interface TabPagerContract {

    interface View extends BaseView<Presenter>{

        /**
         * 加载RecyclerView
         * @param pagebean 数据Bean
         */
        void loadRecyclerView(Pagebean pagebean);
    }

    interface Presenter extends BasePresenter{

        /**
         * 请求数据
         */
        void requestData(String tabId,String tabTitle,int page);
    }

    interface Model {
        Observable<ChannelInfoBean> getChannelInfo(Map<String,String> map,int page);
    }
}
