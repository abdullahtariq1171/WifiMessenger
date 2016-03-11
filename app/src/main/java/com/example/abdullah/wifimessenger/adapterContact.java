package com.example.abdullah.wifimessenger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abdullah on 3/10/2016.
 */
public class adapterContact extends BaseAdapter
{

        ArrayList<Contact> contacts;
        LayoutInflater inflater;
        Context context;

        public adapterContact(Context context, ArrayList<Contact> contacts) {
            this.context=context;
            this.contacts=contacts;
            inflater = LayoutInflater.from(this.context);
        }


        public Contact getItem(int position){return contacts.get(position);}

        @Override
        public long getItemId(int position) {
            return 0;
        }

        public int getCount(){return contacts.size();}

        public View getView(int position,View Convertview,ViewGroup parent)
        {
            viewHolder holder;


            if(Convertview==null)
            {
                inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                Convertview=inflater.inflate(R.layout.single_contact,parent,false);
                holder=new viewHolder(Convertview);
                Convertview.setTag(holder);

            }
            else{
                holder=(viewHolder) Convertview.getTag();
            }

            Contact currentContact=getItem(position);

            holder.name.setText(currentContact.getName());
            holder.no.setText(currentContact.getNo());
            holder.imageView.setImageResource(currentContact.getImgid());
            return Convertview;
        }


        private class viewHolder{
            TextView name,no;
            ImageView imageView;

            public viewHolder(View v) {
                name=(TextView) v.findViewById(R.id.textView);
                no=(TextView) v.findViewById(R.id.textView2);
                imageView=(ImageView) v.findViewById(R.id.imageView);

            }
        }


    }

