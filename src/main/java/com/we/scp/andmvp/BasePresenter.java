package com.we.scp.andmvp;

/**
 * MVP Presenter层基类
 * 适用范围：在Activity使用
 * Created by wujiajun on 17/4/6.
 */
public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
