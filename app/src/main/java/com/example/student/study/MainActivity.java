package com.example.student.study;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView mListStudy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListStudy = (ListView) findViewById(R.id.listStudy);
        List<String> studyList = new ArrayList<String>();
        studyList.add("Service");
        studyList.add("ContentProvider");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");
        studyList.add("Sqlite3");

        ListAdapter adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,studyList);
        mListStudy.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
