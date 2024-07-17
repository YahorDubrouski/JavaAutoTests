package com.dz11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
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
    public void testSetAndGetHusband() {
        Man man = this.createDefaultMan();
        Woman woman =this.createDefaultWoman();
        woman.setHusband(man);

        Assert.assertEquals(woman.getHusband().getFirstName(), DEFAULT_MAN_FIRST_NAME);
    }

    @Test
    public void testIsRetired() {
        Woman woman = this.createDefaultWoman();
        woman.setAge(66);
        Assert.assertTrue(woman.isRetired());
    }

    @Test
    public void testRegisterPartnership() {
        Man man = this.createDefaultMan();
        Woman woman =this.createDefaultWoman();
        woman.setHusband(man);
        woman.registerPartnership(man.getLastName());

        Assert.assertEquals(woman.getLastName(), man.getLastName());
    }

    @Test
    public void testDeregisterPartnership() {
        Man man = this.createDefaultMan();
        Woman woman =this.createDefaultWoman();
        woman.setHusband(man);
        woman.registerPartnership(man.getLastName());
        woman.deregisterPartnership(true);

        Assert.assertNotEquals(woman.getLastName(), man.getLastName());
        Assert.assertEquals(woman.getLastName(), DEFAULT_WOMAN_LAST_NAME);
    }
}
