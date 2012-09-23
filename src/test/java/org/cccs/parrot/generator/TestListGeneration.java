package org.cccs.parrot.generator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: 23/09/2012
 * Time: 11:28
 */
public class TestListGeneration {

    @Test
    public void generateListShouldWork() {
        Ul list = new Ul();
        Li item1 = new Li();
        item1.append(new A("FooBar", "#foo"));
        list.append(item1);

        list.append(new Li("SomeValue"));
        String expected = "<ul><li><a href=\"#foo\">FooBar</a></li><li>SomeValue</li></ul>";

        assertThat(list.toString(), is(equalTo(expected)));
    }
}
