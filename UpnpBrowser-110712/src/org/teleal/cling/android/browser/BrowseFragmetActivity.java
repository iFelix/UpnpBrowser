package org.teleal.cling.android.browser;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BrowseFragmetActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_fragmet);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_browse_fragmet, menu);
        return true;
    }
}
