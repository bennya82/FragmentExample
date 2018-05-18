package com.bennyab.fragmentexample.transfers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bennyab.fragmentexample.R;

/**
 * Created by bennya on 18/05/2018.
 */

public class TransfersStep3Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return  inflater.inflate(R.layout.fr_transfers_step3,container,false);
    }
}
