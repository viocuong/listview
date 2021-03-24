package com.example.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listview.Model.Technology;

import org.w3c.dom.Text;

import java.util.List;

public class ListViewAdapter extends
        ArrayAdapter<Technology> {
    private Activity activity;
    private List<Technology> mList;
    public ListViewAdapter(@NonNull Context context, List<Technology> list) {
        super(context,R.layout.listitem1 ,list);
        this.mList = list;
        this.activity =(Activity) context;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v  = inflater.inflate(R.layout.listitem1,parent,false);
        Technology t = mList.get(position);
        ImageView img = v.findViewById(R.id.img);
        TextView t1 = v.findViewById(R.id.title);
        TextView t2 = v.findViewById(R.id.sub);
        TextView t3 = v.findViewById(R.id.content);
        img.setImageResource(t.getRsImg());
        t1.setText(t.getTitle());
        t2.setText(t.getSub());
        t3.setText(t.getContent());
        return  v;
    }
    public Technology getItem(int pos){
        return mList.get(pos);
    }
}
