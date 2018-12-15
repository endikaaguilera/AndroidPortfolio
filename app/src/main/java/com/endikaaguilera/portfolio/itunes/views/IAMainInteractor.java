/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.itunes.views;

import android.util.Log;

import com.endikaaguilera.portfolio.globals.utils.NetUtils;
import com.endikaaguilera.portfolio.globals.utils.RetrofitUtils;
import com.endikaaguilera.portfolio.itunes.models.IAData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class IAMainInteractor {

    public interface IAGetDataListener {

        void setData(IAData results);

    }

    private IAGetDataListener listener;

    void onDestroy() {

        this.listener = null;

    }

    void getData(IAGetDataListener listener) {

        this.listener = listener;
        getData();

    }

    private void getData() {

        Api restClient = RetrofitUtils.getInstance().create(Api.class);

        Call<IAData> call = restClient.getData();

        //noinspection NullableProblems
        call.enqueue(new Callback<IAData>() {
            @Override
            public void onResponse(
                    Call<IAData> call,
                    Response<IAData> response) {

                if (response.code() == NetUtils.REQUEST_CODE_OK) {

                    IAData results = response.body();

                    if (results == null ||
                            results.getBalkanBeatBox() == null ||
                            results.getBalkanBeatBox().size() == 0) {

                        if (listener != null) listener.setData(null);
                        return;
                    }

                    if (listener != null) listener.setData(results);

                } else {

                    if (listener != null) listener.setData(null);

                }

            }

            @Override
            public void onFailure(Call<IAData> call, Throwable t) {

                Log.e("TEST", "error 04");
                if (listener != null) listener.setData(null);

            }

        });

    }

}
