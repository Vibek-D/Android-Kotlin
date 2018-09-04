package com.sunusi2sim.mobileattendance;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP USER on 04/05/2016.
 */
public class StudentListAdapter extends BaseAdapter {
    private Context mContext;
    private List<StudentList> mStudentList;

    //Constructor

    public StudentListAdapter(Context mContext, List<StudentList> mStudentList) {
        this.mContext = mContext;
        this.mStudentList = mStudentList;
    }

    @Override
    public int getCount() {
        return mStudentList.size();
    }

    @Override
    public Object getItem(int position) {
        return mStudentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.student100_list, null);
        TextView tvReg_no = (TextView) v.findViewById(R.id.tv_reg_no);
        TextView tvFirstname = (TextView) v.findViewById(R.id.tv_firstname);
        TextView tvLastname = (TextView) v.findViewById(R.id.tv_lastname);
        TextView tvSurname = (TextView) v.findViewById(R.id.tv_surname);
        //Set text for TextView
        tvReg_no.setText(mStudentList.get(position).getReg_no());
        tvFirstname.setText(mStudentList.get(position).getFirstname());
        tvLastname.setText(mStudentList.get(position).getLasttname());
        tvSurname.setText(mStudentList.get(position).getSurname());

        //Save product id to tag
        v.setTag(mStudentList.get(position).getId());

        return v;

    }
}
