package lv.portals.game.presentation;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = new MainActivity();
    }

    @Test
    public void get1ShouldReturn1() throws Exception {

        int actual = activity.get1();
        assertThat(actual, is(1));
    }

    @Test
    public void getAppNameShouldReturnPortals() throws Exception {
        String actual = activity.getAppName();
        assertThat(actual, is("Portals"));
    }
}
