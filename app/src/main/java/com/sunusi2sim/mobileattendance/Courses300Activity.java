package com.sunusi2sim.mobileattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Courses300Activity extends AppCompatActivity {
    private ListView lvCourses;
    private CoursesListAdapter adapter;
    private List<Courses> mCourseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses300);
        lvCourses = (ListView) findViewById(R.id.listview_courses);

        mCourseList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mCourseList.add(new Courses(1, "EEEN301", "CIRCUIT THEORY AND SYSTEMS I"));
        mCourseList.add(new Courses(2, "EEEN303", "EM FIELDS AND WAVES"));
        mCourseList.add(new Courses(3, "EEEN309", "ELECTRICAL MACHINES"));
        mCourseList.add(new Courses(4, "EEEN311", "LABORATORY PRACTICAL AND PROJECT I"));
        mCourseList.add(new Courses(1, "EEEN302", "CIRCUIT THEORY AND SYSTEMS II"));
        mCourseList.add(new Courses(1, "EEEN304", "POWER ENGINEERING I"));
        mCourseList.add(new Courses(1, "EEEN306", "POWER ELECTRONICS I"));
        mCourseList.add(new Courses(1, "EEEN308", "MEASUREMENTS AND INSTRUMENTATION"));
        mCourseList.add(new Courses(1, "EEEN314", "LABORATORY PRACTICAL AND PROJECT II"));
        mCourseList.add(new Courses(1, "EEEN318", "TECHNICAL WRITING AND PRESENTATION"));
        mCourseList.add(new Courses(5, "CMEN305", "PHYSICAL ELECTRONICS"));
        mCourseList.add(new Courses(1, "CMEN307", "DIGITAL ELECTRONICS"));
        mCourseList.add(new Courses(1, "COEN301", "INTRODUCTION TO COMPUTER SYSTEMS"));
        mCourseList.add(new Courses(1, "CMEN310", "ELECTRONICS ENGINEERING I"));
        mCourseList.add(new Courses(1, "CMEN312", "TELECOMMUNICATION PRINCIPLES"));
        mCourseList.add(new Courses(1, "COEN302", "CONTROL ENGINEERING I"));

        //Init adapter
        adapter = new CoursesListAdapter(getApplicationContext(), mCourseList);
        lvCourses.setAdapter(adapter);

        lvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                //Ex: display msg with product id get from view.getTag
                Intent intent = new Intent(Courses300Activity.this, Onclick100Activity.class);
                Courses300Activity.this.startActivity(intent);
            }
        });
    }
}
