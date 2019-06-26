package com.zawmoehtike.firstlibexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zawmoehtike.toastlibrary.ColorfulToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorfulToast.show(this, "Hello");
    }
}
