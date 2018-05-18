package com.bennyab.fragmentexample.transfers;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bennyab.fragmentexample.R;

public class TransfersActivity extends FragmentActivity {

    FragmentManager mFragmentManager;

    TransfersStep1Fragment transfersStep1Fragment;
    TransfersStep2Fragment transfersStep2Fragment;
    TransfersStep3Fragment transfersStep3Fragment;

    int stackCounter = 0;


    public String justAString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();

        transfersStep1Fragment = new TransfersStep1Fragment();
        FragmentTransaction ft = mFragmentManager.beginTransaction();
        ft.add(R.id.your_placeholder, transfersStep1Fragment);
        ft.commit();
    }


    public void moveToFragmentTwo(){

        mFragmentManager = getSupportFragmentManager();
        if (transfersStep2Fragment == null){
            transfersStep2Fragment = new TransfersStep2Fragment();
        }
        FragmentTransaction ft = mFragmentManager.beginTransaction();
        ft.setCustomAnimations(R.animator.fade_in,R.animator.fade_in);
        ft.replace(R.id.your_placeholder,transfersStep2Fragment);
        ft.commit();

        //TEST1
    }


    public void moveToFragmentOne(){

        mFragmentManager = getSupportFragmentManager();
        if (transfersStep1Fragment == null){
            transfersStep1Fragment = new TransfersStep1Fragment();
        }
        FragmentTransaction ft = mFragmentManager.beginTransaction();
        ft.setCustomAnimations(R.animator.fade_in,R.animator.fade_in);
        ft.replace(R.id.your_placeholder,transfersStep1Fragment);
        ft.commit();

        //TEST2

        //US17
    }

    @Override
    public void onBackPressed() {

//        if (stackCounter == 0)
//            super.onBackPressed();


    }

    public void moveToFragment3() {
        mFragmentManager = getSupportFragmentManager();
        if (transfersStep3Fragment == null){
            transfersStep3Fragment = new TransfersStep3Fragment();
        }
        FragmentTransaction ft = mFragmentManager.beginTransaction();
        ft.replace(R.id.your_placeholder,transfersStep3Fragment);
        ft.commit();
    }
}
