package com.sunusi2sim.mobileattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Courses500Activity extends AppCompatActivity {
    private ListView lvCourses;
    private CoursesListAdapter adapter;
    private List<Courses> mCourseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses500);
        lvCourses = (ListView) findViewById(R.id.listview_courses);

        mCourseList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mCourseList.add(new Courses(1, "EEEN501", "ADVANCED CIRCUIT THEORY"));
        mCourseList.add(new Courses(2, "EEEN503", "ADVANCED EM FIELDS AND WAVES"));
        mCourseList.add(new Courses(3, "EEEN509", "ENGINEERING MANAGEMENT & DECISION MAKING"));
        mCourseList.add(new Courses(4, "EEEN511", "RELIABILITY AND MAINTAINABILITY"));
        mCourseList.add(new Courses(5, "EEEN513", "ADVANCED ELECTRICAL MACHINES"));
        mCourseList.add(new Courses(6, "EEEN5I5", "ENERGY SYSTEMS AND MANAGEMENT"));
        mCourseList.add(new Courses(7, "EEEN520", "POWER ENGINEERING"));
        mCourseList.add(new Courses(8, "EEEN522", "POWER LINE COMMUNICATIONS"));
        mCourseList.add(new Courses(9, "EEEN524", "ELECTRIC DRIVES"));
        mCourseList.add(new Courses(10, "EEEN526", "ELECTRIC SERVICES DESIGN"));
        mCourseList.add(new Courses(11, "EEEN528", "POWER ELECTRONICS II"));
        mCourseList.add(new Courses(12, "CMEN501", "INTEGRATED CIRCUITS AND SYSTEMS DESIGN"));
        mCourseList.add(new Courses(13, "CMEN503", "TELECOMMUNICATION NETWORKS I"));
        mCourseList.add(new Courses(14, "CMEN505", "COMMUNICATION THEORY AND SYSTEMS"));
        mCourseList.add(new Courses(15, "CMEN507", "COMMMUNICATION THEORY"));
        mCourseList.add(new Courses(16, "CMEN517", "DIGITAL SIGNAL PROCESSING"));
        mCourseList.add(new Courses(17, "CMEN502", "RADIO COMMUNICATION"));
        mCourseList.add(new Courses(18, "CMEN504", "TELECOMMUNICATION NETWORKS II"));
        mCourseList.add(new Courses(19, "CMEN506", "OPTICAL FIBRE COMMUNICATION"));
        mCourseList.add(new Courses(20, "CMEN508", "SATELLITE COMMUNICATION"));
        mCourseList.add(new Courses(21, "CMEN510", "COMMUNICATIONS POWER SYSTEMS"));
        mCourseList.add(new Courses(22, "CMEN512", "DIGITAL SWITCHING SYSTEMS"));
        mCourseList.add(new Courses(23, "CMEN514", "TELE-TRAFFIC ANALYSIS"));
        mCourseList.add(new Courses(24, "CMEN518", "ADVANCED SIGNAL PROCESSING"));
        mCourseList.add(new Courses(25, "COEN501", "SOFT COMPUTING TECHNIQUES"));
        mCourseList.add(new Courses(26, "COEN503", "DIGITAL SYSTEM DESIGN"));
        mCourseList.add(new Courses(27, "COEN505", "ADVANCED NETWORK TECHNOLOGY"));
        mCourseList.add(new Courses(28, "COEN507", "CONTROL ENGINEERING III"));
        mCourseList.add(new Courses(29, "COEN509", "DATABASE MANAGEMENT SYSTEM"));
        mCourseList.add(new Courses(30, "COEN502", "SOFTWARE ENGINEERING"));
        mCourseList.add(new Courses(31, "COEN504", "WEB-BASED DESIGN AND APPLICATIONS"));
        mCourseList.add(new Courses(32, "COEN506", "COMPUTER SYSTEM ARCHITECTURE"));
        mCourseList.add(new Courses(33, "COEN508", "DIGITAL COMPUTATION"));
        mCourseList.add(new Courses(34, "COEN510", "NETWORK SECURITY AND CRYPTOGRAPHY"));
        mCourseList.add(new Courses(35, "COEN512", "MECHATRONICS"));
        mCourseList.add(new Courses(36, "COEN514", "ENGINEERING DESIGN SUSTAINABILITY STUDIES"));



        //Init adapter
        adapter = new CoursesListAdapter(getApplicationContext(), mCourseList);
        lvCourses.setAdapter(adapter);

        lvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                //Ex: display msg with product id get from view.getTag
                Intent intent = new Intent(Courses500Activity.this, Onclick100Activity.class);
                Courses500Activity.this.startActivity(intent);
            }
        });
    }
}
