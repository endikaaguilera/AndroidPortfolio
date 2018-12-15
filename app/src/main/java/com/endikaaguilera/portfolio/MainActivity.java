/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.endikaaguilera.portfolio.itunes.views.IAMainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

// TODO - Add Logs on errors
// TODO - Remove Test Logs
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.obBtn)
    public void onOnBoardingButtonClick() {

        showTemporalToast();

    }

    @OnClick(R.id.pmBtn)
    public void onOnPopularMoviesButtonClick() {

        showTemporalToast();

    }

    @OnClick(R.id.iaBtn)
    public void onItunesButtonClick() {

        Intent intent = new Intent(MainActivity.this, IAMainActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.baBtn)
    public void onOnBakingAppMoviesButtonClick() {

        showTemporalToast();

    }

    @OnClick(R.id.xyBtn)
    public void onOnXYZReaderMoviesButtonClick() {

        showTemporalToast();

    }

    private void showTemporalToast() {

        Toast.makeText(this, "Not implemented...", Toast.LENGTH_SHORT).show();

    }

}
