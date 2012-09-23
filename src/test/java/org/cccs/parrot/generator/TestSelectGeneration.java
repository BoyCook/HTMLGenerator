package org.cccs.parrot.generator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: 23/09/2012
 * Time: 11:38
 */
public class TestSelectGeneration {

    @Test
    public void generateSelectShouldWork() {
        Select select = new Select("1");
        select.append(new Option());
        String expected = "<select id=\"1\"><option></option></select>";
        assertThat(select.toString(), is(equalTo(expected)));
    }

    @Test
    public void generateSelectWithValueShouldWork() {
        Select select = new Select("1");
        select.append(new Option("Value 1", "value1"));
        String expected = "<select id=\"1\"><option value=\"value1\">Value 1</option></select>";
        assertThat(select.toString(), is(equalTo(expected)));
    }
}
