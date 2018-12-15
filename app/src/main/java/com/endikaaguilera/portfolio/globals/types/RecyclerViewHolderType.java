/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.globals.types;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// class used as replacement of an enum
public class RecyclerViewHolderType {

    public static final int LOADING = 0, ERROR = 2, NO_DATA = 3, NO_INTERNET = 4;

    @IntDef({LOADING, ERROR, NO_DATA, NO_INTERNET})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RVHolderType {
    }

}