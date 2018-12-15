/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.itunes.custom;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class IAVerticalItemDeco extends RecyclerView.ItemDecoration {

    private final int spacing;

    public IAVerticalItemDeco(int spacing) {
        this.spacing = spacing;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect,
                               @NonNull View view,
                               @NonNull RecyclerView parent,
                               @NonNull RecyclerView.State state) {

        // item position
        int position = parent.getChildAdapterPosition(view);

        if (position == 0) {
            outRect.top = spacing;
            outRect.bottom = spacing;
        } else outRect.bottom = spacing;

    }
}