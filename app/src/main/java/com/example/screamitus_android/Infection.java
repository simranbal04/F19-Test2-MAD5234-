package com.example.screamitus_android;

import android.app.Activity;
import android.app.Activity;
import android.support.v4.widget.TextViewCompat;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowToast;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;



    public class Infection {
        int Day = 0;
        int Instructorsinfected = 0;
        int Day = 1;
        int rate = 0;

        public void init()
        {

            public void init ()
        {
            DaysbiggerthanZero();
            }

            public int DaysbiggerthanZero ()
        {
                if (Day > 0)
                {
                    return Instructorsinfected();
                } else if (Day > 0) {
                    return infectedRate();
                }
                else
                    return -1;
            }

            public int Instructorsinfected ()
        {
                if (Day <= 7) {
                    rate = 5;

                } else {
                    rate = 8;
                }
            Instructorsinfected = Day * rate;
                return Instructorsinfected;
                public int infectedRate () {
                    return rate;
                }


            }
            public class mainActivityTest {


                MainActivity mainActivity;
                Infection infection;


                @Before
                public void setup() throws Exception {
                    mainActivity = Roboelectric.buildActivity(MainActivity.class)
                            .create()
                            .resume()
                            .get();
                }

                //r1
                @Test
                public void DaysbiggerthanZero() {
//                    EditText days = (EditText) mainActivity.findViewById(R.id.daysTextBox);
//                    String noofDays = days.getText().toString();
//                    assertNotEquals(noofDays, "0");

                    infection = new Infection();
                    infection.init();
                    assertNotEquals(infection.DaysbiggerthanZero(),-1);
                }
            }
        }