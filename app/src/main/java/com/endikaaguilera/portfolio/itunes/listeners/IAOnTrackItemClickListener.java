/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.itunes.listeners;

import android.widget.ImageView;

/**
 * A simple interface to handle onClick callbacks
 */
public interface IAOnTrackItemClickListener {

    void onShareTrackClick(String trackUrl);

    void onPlayTrackClick(ImageView source, String trackName, String previewUrl);

    void onViewTrackClick(String trackUrl);

}