package org.cccs.parrot.generator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: 23/09/2012
 * Time: 11:35
 */
public class TestInputGeneration {

    @Test
    public void generateTextShouldWork() {
        Text text = new Text("1");
        String expected = "<input type=\"text\" id=\"1\"/>";
        assertThat(text.toString(), is(equalTo(expected)));
    }

    @Test
    public void generateTextWithValueShouldWork() {
        Text text = new Text("1", "SomeText");
        String expected = "<input type=\"text\" id=\"1\" value=\"SomeText\" />";
        assertThat(text.toString(), is(equalTo(expected)));
    }
}
