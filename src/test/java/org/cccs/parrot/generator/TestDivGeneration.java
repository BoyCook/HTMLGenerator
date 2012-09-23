package org.cccs.parrot.generator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: 23/09/2012
 * Time: 11:51
 */
public class TestDivGeneration {

    @Test
    public void getDomElementNameShouldWork() {
        Div div = new Div();
        assertThat(div.getName(), is(equalTo("Div")));
    }

    @Test
    public void generateDivShouldWork() {
        Div div = new Div("Div Content");
        assertThat(div.toString(), is(equalTo("<div>Div Content</div>")));
    }
}
