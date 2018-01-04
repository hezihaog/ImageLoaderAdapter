package com.hzh.image.loader.adapter.config;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/**
 * Package: com.hzh.image.loader.adapter.config
 * FileName: GlobalConfig
 * Date: on 2018/1/4  下午11:28
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public class GlobalConfig {
    private Context mContext;
    private Handler mMainHandler;

    private GlobalConfig() {
    }

    /**
     * 创建一个config实例
     *
     * @param context 上下文
     * @return config实例
     */
    public static GlobalConfig newInstance(Context context) {
        GlobalConfig config = new GlobalConfig();
        config.mContext = context;
        config.mMainHandler = new Handler(Looper.getMainLooper());
        return config;
    }

    /**
     * 获取上下文环境
     *
     * @return 上下文对象
     */
    public Context getContext() {
        return mContext;
    }

    /**
     * 获取主线程的handler
     *
     * @return 主线程的handler对象
     */
    public Handler getMainHandler() {
        return mMainHandler;
    }

    /**
     * 在主线程执行任务
     *
     * @param runnable 任务对象
     */
    public void post(Runnable runnable) {
        mMainHandler.post(runnable);
    }

    /**
     * 在主线程延时执行任务
     *
     * @param runnable    任务对象
     * @param delayMillis 延时毫秒数
     */
    public void post(Runnable runnable, long delayMillis) {
        mMainHandler.postDelayed(runnable, delayMillis);
    }
}