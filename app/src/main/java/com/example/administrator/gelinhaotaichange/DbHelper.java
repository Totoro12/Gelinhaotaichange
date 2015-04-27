package com.example.administrator.gelinhaotaichange;

import android.content.Context;

import com.lidroid.xutils.DbUtils;

/**
 * Created by Administrator on 2015/4/15.
 */
public class DbHelper {
    private static DbUtils utils;
    public  static  void init(Context context){
        utils=DbUtils.create(context,"green");
        utils.configDebug(true);
        utils.configAllowTransaction(true);
    }

    public static DbUtils getUtils() {
        return utils;
    }
}
