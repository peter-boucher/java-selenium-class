package com.maersk;

import com.maersk.pages.HomePage;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class HomeTest extends TestNG {

    @Test
    public void newItemTest() {
        HomePage home = new HomePage();
        home.goTo();
    }
}
