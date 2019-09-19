package com.example.screamitus_android;

import android.app.Activity;
import android.app.Activity;
import android.support.v4.widget.TextViewCompat;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


public class Infection {
MainActivity mainActivity;
    @Before
    public void setup() throws Exception {
        mainActivity = Roboelectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }
    //r1
    @Test
    public void DaysbiggerthanZero()
    {
        EditText days = (EditText)mainActivity.findViewById(R.id.daysTextBox);
        String noofDays = days.getText().toString();

    }
}
