package com.example.shizuo.cs110lab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shizuo.cs110lab3.MainActivity;
import com.example.shizuo.cs110lab3.R;

/**
 * Created by shizuo on 4/17/2016.
 */
public class junittest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public junittest() {
        super(MainActivity.class);
    }

    public void testSum() {
        mainActivity = getActivity();
        assertEquals(mainActivity.sum(5, 10), 15);
        assertEquals(mainActivity.sum(0, 10), 10);
        assertEquals(mainActivity.sum(5, 0), 5);
        assertEquals(mainActivity.sum(-5, 10), 5);
        assertEquals(mainActivity.sum(-15, 10), -5);
        assertEquals(mainActivity.sum(-5, -10), -15);
    }
}
