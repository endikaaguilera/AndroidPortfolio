/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.itunes.custom;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.endikaaguilera.portfolio.R;
import com.endikaaguilera.portfolio.itunes.adapters.IAHorizontalAdapter;
import com.endikaaguilera.portfolio.itunes.listeners.IAOnTrackItemClickListener;
import com.endikaaguilera.portfolio.itunes.models.IATrackData;

import java.util.ArrayList;

public class IAHorizontalRecyclerView extends RecyclerView {

    private LinearLayoutManager layoutManager;

    public Parcelable getLayoutState() {
        return this.layoutManager == null ? null : this.layoutManager.onSaveInstanceState();
    }

    public IAHorizontalRecyclerView(@NonNull Context context) {
        super(context);
    }

    public IAHorizontalRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public IAHorizontalRecyclerView(@NonNull Context context,
                                    @Nullable AttributeSet attrs,
                                    int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setData(ArrayList<IATrackData> trackData,
                        Parcelable nestedLayoutState,
                        IAOnTrackItemClickListener onTrackItemClickListener) {

        Context context = getContext();
        if (context == null) return;

        Resources resources = context.getResources();
        if (resources == null) return;

        float itemSpacing = resources.getDimension(R.dimen.ia_recycler_view_item_spacing);
        IAHorizontalItemDeco itemDeco = new IAHorizontalItemDeco((int) itemSpacing);
        addItemDecoration(itemDeco);

        setItemViewCacheSize(trackData == null ? 0 : trackData.size()); // default is 2;

        setNestedScrollingEnabled(false);

        this.layoutManager = new LinearLayoutManager(
                context,
                LinearLayoutManager.HORIZONTAL,
                false);

        // restore layout state
        if (nestedLayoutState != null) {

            this.layoutManager.onRestoreInstanceState(nestedLayoutState);

        }

        setLayoutManager(this.layoutManager);

        IAHorizontalAdapter adapter = new IAHorizontalAdapter(trackData, onTrackItemClickListener);
        adapter.setHasStableIds(true);
        setAdapter(adapter);

        setVisibility(View.VISIBLE);
        setHasFixedSize(true);

    }

}
