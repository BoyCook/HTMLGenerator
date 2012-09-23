package org.cccs.parrot.generator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: 21/07/2012
 * Time: 00:07
 */
public class TestGeneration {

    @Test
    public void getDomElementNameShouldWork() {
        Div div = new Div("Div Content");
        assertThat(div.getName(), is(equalTo("Div")));
    }

    @Test
    public void generateDivShouldWork() {
        Div div = new Div("Div Content");
        assertThat(div.toString(), is(equalTo("<div>Div Content</div>")));
    }

    @Test
    public void generateHeaderShouldWork() {
        H header = new H("5", "A Header");
        String expected = "<h5>A Header</h5>";
        assertThat(header.toString(), is(equalTo(expected)));
    }
}
