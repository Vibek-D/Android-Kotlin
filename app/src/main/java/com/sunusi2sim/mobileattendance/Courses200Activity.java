package com.sunusi2sim.mobileattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Courses200Activity extends AppCompatActivity {
    private ListView lvCourses;
    private CoursesListAdapter adapter;
    private List<Courses> mCourseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses200);

        lvCourses = (ListView) findViewById(R.id.listview_courses);

        mCourseList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mCourseList.add(new Courses(1, "EEEN201", "ELECTRIC FIELD & CIRCUIT THEORY"));
        mCourseList.add(new Courses(2, "EEEN203", "MACHINES, POWER & INSTALLATION"));
        mCourseList.add(new Courses(3, "EEEN202", "ELECTRONICS, MEASUREMENT AND TRANSDUCERS"));

        //Init adapter
        adapter = new CoursesListAdapter(getApplicationContext(), mCourseList);
        lvCourses.setAdapter(adapter);

        lvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                //Ex: display msg with product id get from view.getTag
                Intent intent = new Intent(Courses200Activity.this, Onclick100Activity.class);
                Courses200Activity.this.startActivity(intent);
            }
        });
    }
}