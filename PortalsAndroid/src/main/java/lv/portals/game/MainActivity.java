package lv.portals.game;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView child = new TextView(this);
        child.setText("Hello World from the App");

        LinearLayout layout = new LinearLayout(this);
        layout.addView(child);

        setContentView(layout);
    }

}
