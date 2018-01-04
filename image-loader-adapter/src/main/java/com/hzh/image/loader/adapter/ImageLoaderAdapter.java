package com.hzh.image.loader.adapter;

import android.content.Context;

import com.hzh.image.loader.adapter.base.ILoader;
import com.hzh.image.loader.adapter.config.GlobalConfig;

/**
 * Package: com.hzh.image.loader.middleware
 * FileName: ImageLoader
 * Date: on 2018/1/1  下午12:31
 * Auther: zihe
 * Descirbe:ImageLoader中间层
 * Email: hezihao@linghit.com
 */

public class ImageLoaderAdapter {
    private static Context mContext;
    private ILoader mImageLoader;
    private static boolean isInited = false;
    //配置对象
    private final GlobalConfig mGlobalConfig;

    private ImageLoaderAdapter() {
        mGlobalConfig = GlobalConfig.newInstance(mContext);
    }

    private static class SingleHolder {
        private static final ImageLoaderAdapter INSTANCE = new ImageLoaderAdapter();
    }

    /**
     * 初始化
     *
     * @param context 上下文
     */
    public static ImageLoaderAdapter init(Context context) {
        ImageLoaderAdapter.mContext = context.getApplicationContext();
        ImageLoaderAdapter instance = SingleHolder.INSTANCE;
        isInited = true;
        return instance;
    }

    /**
     * 获取适配器实例
     *
     * @return 适配器实例
     */
    public static ImageLoaderAdapter getInstance() {
        if (!isInited) {
            throw new RuntimeException("必须先调用init方法进行出初始化");
        }
        return SingleHolder.INSTANCE;
    }

    /**
     * 设置加载器实现类
     *
     * @param imageLoader 加载器实现类对象
     */
    public void setImageLoader(ILoader imageLoader) {
        this.mImageLoader = imageLoader;
    }

    /**
     * 获取加载器实现类对象
     *
     * @return 加载器实现类对象
     */
    public ILoader getImageLoader() {
        return this.mImageLoader;
    }

    /**
     * 获取上下文
     *
     * @return 上下文对象
     */
    public static Context getContext() {
        return mContext;
    }

    /**
     * 获取当前的配置对象
     *
     * @return 配置对象
     */
    public GlobalConfig getGlobalConfig() {
        return mGlobalConfig;
    }
}