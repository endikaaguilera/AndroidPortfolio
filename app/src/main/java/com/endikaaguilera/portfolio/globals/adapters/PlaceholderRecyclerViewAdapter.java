/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.globals.adapters;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.endikaaguilera.portfolio.R;
import com.endikaaguilera.portfolio.globals.custom.PlaceholderViewHolder;
import com.endikaaguilera.portfolio.globals.listeners.PlaceholderListener;

public class PlaceholderRecyclerViewAdapter extends RecyclerView.Adapter<PlaceholderViewHolder> {

    private PlaceholderListener listener;
    private String headerText;
    @DrawableRes
    private int drawable;

    public PlaceholderRecyclerViewAdapter(PlaceholderListener listener,
                                          String headerText,
                                          int drawable) {

        this.listener = listener;
        this.headerText = headerText;
        this.drawable = drawable;

    }

    @Override
    public int getItemCount() {

        return 1;

    }

    @NonNull
    @Override
    public PlaceholderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_placeholder, parent, false);

        return new PlaceholderViewHolder(rootView);

    }

    @Override
    public void onBindViewHolder(@NonNull final PlaceholderViewHolder viewHolder, int i) {

        viewHolder.init(this.listener, this.headerText, this.drawable);

    }

}
