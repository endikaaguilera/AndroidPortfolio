/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.globals.utils;

import android.util.Log;

public class LogUtils {

    public static void logError(String tag, String msg) {

        if (Log.isLoggable(tag, Log.ERROR)) Log.e(tag, msg);

    }

    public static void logError(String tag, String msg, Throwable error) {

        if (Log.isLoggable(tag, Log.ERROR)) Log.e(tag, msg, error);

    }

}
