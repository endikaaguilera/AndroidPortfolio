/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.globals.custom;

import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.endikaaguilera.portfolio.R;
import com.endikaaguilera.portfolio.globals.listeners.PlaceholderListener;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.support.v7.widget.RecyclerView.NO_POSITION;

public class PlaceholderViewHolder extends RecyclerView.ViewHolder {

    @SuppressWarnings("WeakerAccess")
    @BindView(R.id.headerTextView)
    TextView headerTextView;

    @SuppressWarnings("WeakerAccess")
    @BindView(R.id.placeholderImage)
    ImageView placeholderImageView;

    @SuppressWarnings("WeakerAccess")
    @BindView(R.id.placeholderProgressBar)
    ProgressBar placeholderProgressBar;

    @SuppressWarnings("WeakerAccess")
    @BindView(R.id.actionButton)
    Button actionButton;

    public PlaceholderViewHolder(View itemView) {

        super(itemView);
        ButterKnife.bind(this, itemView);

    }

    public void init(final PlaceholderListener listener,
                     final String headerText,
                     final @DrawableRes int drawable) {


        this.headerTextView.setText(headerText == null ? "Error" : headerText);

        if (drawable == 0) {

            this.placeholderProgressBar.setVisibility(View.VISIBLE);
            this.placeholderImageView.setVisibility(View.INVISIBLE);

        } else {

            this.placeholderProgressBar.setVisibility(View.GONE);
            this.placeholderImageView.setVisibility(View.VISIBLE);
            this.placeholderImageView.setImageResource(drawable);

        }

        int actionButtonVisible = listener != null ? View.VISIBLE : View.INVISIBLE;

        this.actionButton.setVisibility(actionButtonVisible);

        this.actionButton.setOnClickListener(view -> {

            final int index = getAdapterPosition();

            if (index == NO_POSITION || listener == null) {

                this.actionButton.setVisibility(View.INVISIBLE);

                return;
            }

            listener.onRetryButtonClick();

        });

    }

}