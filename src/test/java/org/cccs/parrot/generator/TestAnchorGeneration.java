package org.cccs.parrot.generator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: 23/09/2012
 * Time: 11:25
 */
public class TestAnchorGeneration {

    @Test
    public void generateListShouldWork() {
        String expected1 = "<a href=\"#foo\">FooBar</a>";
        String expected2 = "<a href=\"#foo\" target=\"blank\">FooBar</a>";

        assertThat(new A("FooBar", "#foo").toString(), is(equalTo(expected1)));
        assertThat(new A("FooBar", "#foo", "blank").toString(), is(equalTo(expected2)));
    }
}
