package com.hzh.image.loader.adapter.base;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.hzh.image.loader.adapter.callback.DisplayCallback;
import com.hzh.image.loader.adapter.callback.LoadCallback;

/**
 * Package: com.hzh.image.loader.middleware
 * FileName: ILoader
 * Date: on 2018/1/1  下午12:29
 * Auther: zihe
 * Descirbe:图片加载器方法接口
 * Email: hezihao@linghit.com
 */

public interface ILoader {
    /**
     * 使用Url显示图片
     *
     * @param context      上下文
     * @param imageView    ImageView
     * @param imageUrl     图片Url地址
     * @param defaultImage 默认占位图
     */
    void displayImage(Context context, ImageView imageView, String imageUrl, int defaultImage);

    /**
     * 加载图片，添加一个展示回调
     *
     * @param context   上下文
     * @param imageUrl  Url地址
     * @param imageView ImageView
     * @param callback  展示回调
     */
    void displayImage(Context context, String imageUrl, ImageView imageView, final DisplayCallback callback);

    /**
     * 使用Url显示图片，但没有占位图
     *
     * @param context   上下文
     * @param imageUrl  Url地址
     * @param imageView ImageView
     */
    void displayNotPlaceHolder(Context context, String imageUrl, ImageView imageView);

    /**
     * 使用Url显示圆角图片
     *
     * @param context      上下文
     * @param imageView    ImageView
     * @param imageUrl     图片Url地址
     * @param defaultImage 默认显示的图片
     */
    void displayImageCorner(Context context, ImageView imageView, String imageUrl, int defaultImage, int radius);

    /**
     * 使用resId显示圆角图片
     *
     * @param context      上下文
     * @param imageView    ImageView
     * @param imageRes     图片的resId
     * @param defaultImage 默认占位图
     * @param radius       圆角图片
     */
    void displayImageCorner(Context context, ImageView imageView, int imageRes, int defaultImage, int radius);

    /**
     * 使用Url加载圆角，并且使用FitXY
     *
     * @param context   上下文
     * @param imageUrl  图片Url地址
     * @param imageView ImageView
     * @param radius    圆角半径
     */
    void displayCornerFitXY(Context context, String imageUrl, ImageView imageView, int radius);

    /**
     * 使用Url显示只有顶部有圆角
     *
     * @param context        上下文
     * @param imageUrl       Url地址
     * @param imageView      ImageView
     * @param topLeftRadius  顶部左边的圆角半径
     * @param topRightRadius 顶部右边圆角半径
     */
    void displayCornerWithTop(Context context, String imageUrl, ImageView imageView, int topLeftRadius, int topRightRadius);

    /**
     * 使用Url显示只有底部有圆角
     *
     * @param context           上下文
     * @param imageUrl          Url地址
     * @param imageView         ImageView
     * @param bottomLeftRadius  底部左边的圆角半径
     * @param bottomRightRadius
     */
    void displayCornerWithBottom(Context context, String imageUrl, ImageView imageView, int bottomLeftRadius, int bottomRightRadius);

    /**
     * 展示File图片文件
     *
     * @param context      上下文
     * @param imageView    ImageView
     * @param filePath     文件地址
     * @param defaultImage 默认显示的图片
     */
    void displayFileImage(Context context, ImageView imageView, String filePath, int defaultImage);

    /**
     * 加载图片获取Bitmap
     *
     * @param context      上下文
     * @param url          Url地址
     * @param loadCallback 加载回调
     */
    void loadImageBitmap(Context context, String url, final LoadCallback loadCallback);

    /**
     * 暂停加载，通常用于ListView的滚动时暂停
     */
    void pause();

    /**
     * 恢复加载，通常用于ListView的停止滚动时恢复请求
     */
    void resume();

    /**
     * 清除所有的磁盘缓存
     */
    void clearDiskCache();

    /**
     * 清除View对象的内存缓存
     *
     * @param view 目标View
     */
    void clearMemoryCacheCache(View view);

    /**
     * 清除所有图片的缓存
     */
    void clearMemory();

    /**
     * 系统回调onTrimMemory时调用该方法清除缓存
     *
     * @param level 等级
     */
    void trimMemory(int level);

    /**
     * 系统回调onlowMemory时调用该方法
     */
    void lowMemory();
}