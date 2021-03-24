package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listview.Model.Technology;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView v;
    private ListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String[] s = getResources().getStringArray(R.array.tech);
//        v = findViewById(R.id.lv);
//        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.listitem,s);
//        v.setAdapter(adapter);
//        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                for(int i = 0; i<adapter.getCount();i++){
//                    parent.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
//                }
//                parent.getChildAt(position).setBackgroundColor(Color.BLUE);
//                Toast.makeText(MainActivity.this,"select+ "+adapter.getItem(position).toString(),Toast.LENGTH_SHORT).show();
//            }
//        });
        v = findViewById(R.id.lv);
        adapter = new ListViewAdapter(this,this.gets());
        v.setAdapter(adapter);

    }
    private List<Technology> gets(){
        List<Technology> t = new ArrayList<>();
        t.add(new Technology(R.drawable.dog,"Android","sub1","content1"));
        t.add(new Technology(R.drawable.dog,"Window","sub2","content2"));
        t.add(new Technology(R.drawable.dog,"Linux","sub3","content3"));
        t.add(new Technology(R.drawable.dog,"Android","sub1","content1"));
        return t;
    }
}