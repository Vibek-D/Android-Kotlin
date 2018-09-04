package com.sunusi2sim.mobileattendance;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP USER on 30/04/2016.
 */
public class CoursesListAdapter extends BaseAdapter{
    private Context mContext;
    private List<Courses> mCourseList;

    //Constructor

    public CoursesListAdapter(Context mContext, List<Courses> mCourseList) {
        this.mContext = mContext;
        this.mCourseList = mCourseList;
    }

    @Override
    public int getCount() {
        return mCourseList.size();
    }

    @Override
    public Object getItem(int position) {
        return mCourseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.courses100_list, null);
        TextView tvName = (TextView) v.findViewById(R.id.tv_name);
        TextView tvDescription = (TextView) v.findViewById(R.id.tv_description);
        //Set text for TextView
        tvName.setText(mCourseList.get(position).getName());
        tvDescription.setText(mCourseList.get(position).getDescription());

        //Save product id to tag
        v.setTag(mCourseList.get(position).getId());

        return v;

    }
}