package com.sunusi2sim.mobileattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Courses400Activity extends AppCompatActivity {
    private ListView lvCourses;
    private CoursesListAdapter adapter;
    private List<Courses> mCourseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses400);
        lvCourses = (ListView) findViewById(R.id.listview_courses);

        mCourseList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mCourseList.add(new Courses(1, "EEEN401", "POWER ENGINEERING II"));
        mCourseList.add(new Courses(2, "EEEN409", "ELECTRICAL MACHINES II"));
        mCourseList.add(new Courses(3, "EEEN411", "LABORATORY PRACTICAL III"));
        mCourseList.add(new Courses(4, "CMEN401", "DATA COMMUNICATION"));
        mCourseList.add(new Courses(5, "CMEN405", "DIGITAL ELECTRONICS II"));
        mCourseList.add(new Courses(6, "CMEN411", "COMMUNICATION LABORATORY PRACTICAL"));
        mCourseList.add(new Courses(7, "COEN401", "MICROPROCESSOR & MICROCONTROLLER APPLICATIONS"));
        mCourseList.add(new Courses(8, "COEN403", "PROGRAMMING IN C++"));
        mCourseList.add(new Courses(9, "COEN405", "NETWORK TECHNOLOGY"));
        mCourseList.add(new Courses(10, "COEN407", "CONTROL ENGINEERING II"));
        mCourseList.add(new Courses(11, "COEN411", "LABORATORY PRACTICAL AND PROJECT III"));

        //Init adapter
        adapter = new CoursesListAdapter(getApplicationContext(), mCourseList);
        lvCourses.setAdapter(adapter);

        lvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                //Ex: display msg with product id get from view.getTag
                Intent intent = new Intent(Courses400Activity.this, Onclick100Activity.class);
                Courses400Activity.this.startActivity(intent);
            }
        });
    }
}
