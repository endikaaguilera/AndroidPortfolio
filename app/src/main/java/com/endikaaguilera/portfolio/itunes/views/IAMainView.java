/*
 * Created by Endika Aguilera on 15/12/2018.
 * Copyright: (c) 2018 Endika Aguilera. All rights reserved.
 */

package com.endikaaguilera.portfolio.itunes.views;

import com.endikaaguilera.portfolio.globals.types.RecyclerViewHolderType;
import com.endikaaguilera.portfolio.itunes.models.IAData;

interface IAMainView {

    void onGetData();

    void onNoNetworkOnItemClick();

    void onShowResults(IAData data);

    void onShowPlaceholder(@RecyclerViewHolderType.RVHolderType int type);

    void onShowBottomView();

    void onHideBottomView();

}
