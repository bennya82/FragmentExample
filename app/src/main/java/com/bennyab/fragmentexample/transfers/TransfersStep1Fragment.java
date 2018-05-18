package com.bennyab.fragmentexample.transfers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bennyab.fragmentexample.R;

/**
 * Created by bennya on 18/05/2018.
 */

public class TransfersStep1Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =   inflater.inflate(R.layout.fr_transfers_step1,container,false);

        Button btn = view.findViewById(R.id.fr_transfer1btn_click);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TransfersActivity actvity = (TransfersActivity)getActivity();
                actvity.moveToFragmentTwo();

            }
        });
        return view;
    }
}
