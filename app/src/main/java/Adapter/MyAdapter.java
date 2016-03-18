package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.prihantoro.contacts.R;

import java.util.List;

import Entity.Contact;

/**
 * Created by Wahyu Prihantoro on 18-Mar-16.
 */
public class MyAdapter extends BaseAdapter{
    private List<Contact> contacts;
    private Context context;

    public MyAdapter(List<Contact> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return contacts.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_my_adapter, parent, false);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView address = (TextView) view.findViewById(R.id.address);
        TextView phoneNumber = (TextView) view.findViewById(R.id.phone_number);
        Contact contact = contacts.get(position);
        name.setText(contact.getName());
        address.setText(contact.getAddress());
        phoneNumber.setText(contact.getPhoneNumber());
        return view;
    }
}
