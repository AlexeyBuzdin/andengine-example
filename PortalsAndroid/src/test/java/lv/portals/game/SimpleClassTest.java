package lv.portals.game;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SimpleClassTest {

    @Test
    public void get1ShouldReturn1() throws Exception {

        SimpleClass simpleClass = new SimpleClass();
        assertThat(simpleClass.get1(), equalTo(1));

    }
}
