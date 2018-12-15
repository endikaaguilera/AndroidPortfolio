/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.globals.api;

import com.endikaaguilera.portfolio.itunes.models.IAData;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.endikaaguilera.portfolio.globals.utils.NetUtils.API_ITUNES_QUERY;

public interface Api {

    @GET(API_ITUNES_QUERY)
    Call<IAData> getiTunesData();

}
