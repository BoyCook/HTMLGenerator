package org.cccs.parrot.generator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: 23/09/2012
 * Time: 11:24
 */
public class TestTableGeneration {

    @Test
    public void generateTableShouldWork() {
        Table table = new Table();
        Tr tr = new Tr();
        table.append(tr);
        tr.append(new Th("ID")).append(new Td("123"));

        Tr tr1 = new Tr();
        table.append(tr1);
        tr1.append(new Th()).append(new Td());
        assertThat(table.toString(), is(equalTo("<table><tr><th>ID</th><td>123</td></tr><tr><th></th><td></td></tr></table>")));
    }
}
