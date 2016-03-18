package com.prihantoro.contacts;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import Adapter.MyAdapter;
import Entity.Contact;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // define your data
//        String[] mobAppMember = {"Ibu Teresa", "Pak Andi", "Om Syahrul", "Bos Gun",
//                "Mas Faris", "Bang Ricky", "Kang Dzulham", "Kak Wahyu"};
//        //link to the ListView that you created in activity_main.xml
//        ListView myListView = (ListView) findViewById(R.id.my_list);
//        //make an ArrayAdapter object, set the constructor by context, layout, array
//        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mobAppMember);
//
//        myListView.setAdapter(myAdapter);

        ArrayList<Contact> contacts = new ArrayList();
        //add 100 contacts
        for (int i = 1; i <= 100; i++) {
            Contact contact = new Contact("John Doe " + i, "Kukusan " + i, 123456788 + i + "", i);
            contacts.add(contact);
        }

        ListView myListView = (ListView) findViewById(R.id.my_list);

        //initiate MyAdapter
        MyAdapter myAdapter = new MyAdapter(contacts,this);

        myListView.setAdapter(myAdapter);
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
