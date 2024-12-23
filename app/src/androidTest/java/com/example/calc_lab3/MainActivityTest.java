package com.example.calc_lab3;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testAddition() {
        onView(withId(R.id.btn2)).perform(click());
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.btn3)).perform(click());
        onView(withId(R.id.btnEqual)).perform(click());
        onView(withId(R.id.txtDisplay)).check(matches(withText("5.0")));
    }

    @Test
    public void testDivisionByZero() {
        onView(withId(R.id.btn7)).perform(click());
        onView(withId(R.id.btnDivide)).perform(click());
        onView(withId(R.id.btn0)).perform(click());
        onView(withId(R.id.btnEqual)).perform(click());
        onView(withId(R.id.txtDisplay)).check(matches(withText("Error")));
    }
}
