/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.globals.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetUtils {

    public final static String API_BASE_URL = "https://api.endikaaguilera.com/";

    /**
     * @return true if internet is available
     */
    public static boolean isNetworkAvailable(Context context) {
        if (context == null) return false;
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getApplicationContext()
                        .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = null;
        if (connectivityManager != null) {
            activeNetwork = connectivityManager.getActiveNetworkInfo();
        }
        return activeNetwork != null && activeNetwork.isConnected();
    }

}
