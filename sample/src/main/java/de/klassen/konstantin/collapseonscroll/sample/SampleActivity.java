package de.klassen.konstantin.collapseonscroll.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class SampleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        ListView lv = (ListView) findViewById(R.id.list);

        List<String> items = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            items.add("" + i);
        }

        String[] itemArray = new String[items.size()];

        lv.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, items.toArray(itemArray)));
    }
}
