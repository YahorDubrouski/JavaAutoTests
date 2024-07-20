package com.dz11;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.Assert;

public class ManTest {
    private static final String DEFAULT_MAN_FIRST_NAME = "Bob";
    private static final String DEFAULT_MAN_LAST_NAME = "Smith";
    private static final int DEFAULT_MAN_AGE = 65;
    private static final int DEFAULT_MAN_HEIGHT = 180;
    private static final int DEFAULT_MAN_WEIGHT = 80;

    private static final String DEFAULT_WOMAN_FIRST_NAME = "Clara";
    private static final String DEFAULT_WOMAN_LAST_NAME = "Bauman";
    private static final int DEFAULT_WOMAN_AGE = 60;
    private static final int DEFAULT_WOMAN_HEIGHT = 160;
    private static final int DEFAULT_WOMAN_WEIGHT = 60;

    private Man createDefaultMan() {
        return new Man(
            DEFAULT_MAN_FIRST_NAME,
            DEFAULT_MAN_LAST_NAME,
            DEFAULT_MAN_AGE,
            DEFAULT_MAN_HEIGHT,
            DEFAULT_MAN_WEIGHT
        );
    }

    private Woman createDefaultWoman() {
        return new Woman(
            DEFAULT_WOMAN_FIRST_NAME,
            DEFAULT_WOMAN_LAST_NAME,
            DEFAULT_WOMAN_AGE,
            DEFAULT_WOMAN_HEIGHT,
            DEFAULT_WOMAN_WEIGHT
        );
    }

    @Test
    public void testSetAndGetWife() {
        Man man = this.createDefaultMan();
        Woman woman =this.createDefaultWoman();
        man.setWife(woman);

        Assert.assertEquals(man.getWife().getFirstName(), DEFAULT_WOMAN_FIRST_NAME);
    }

    @Test
    @Parameters({"age", "expectedResult"})
    public void testIsRetired(int age, boolean expectedResult) {
        Man man = this.createDefaultMan();
        man.setAge(age);
        Assert.assertEquals(man.isRetired(), expectedResult);
    }
}
