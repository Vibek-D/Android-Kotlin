package com.sunusi2sim.mobileattendance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class StudentList100Activity extends AppCompatActivity {
    private ListView lvStudents;
    private ArrayList<String> mStudentList;
    private List<StudentList> adapter;


    private RequestQueue requestQueue;
    private String jsonURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list100);

        lvStudents = (ListView) findViewById(R.id.listview_studentlist);
        mStudentList = new ArrayList<>();

        requestQueue = Volley.newRequestQueue(this);
        jsonURL = "http://sunusi2sim.comli.com//student100.php";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                jsonURL,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject student100 = response.getJSONObject(i);
                                String reg_no = student100.getString("reg_no");
                                String firstname = student100.getString("firstname");
                                String lastname = student100.getString("lastname");
                                String surname = student100.getString("surname");

                                mStudentList.add(new StudentList(1,reg_no,firstname,lastname,surname));
                                adapter = new StudentListAdapter(getApplicationContext(), mStudentList);
                                lvStudents.setAdapter(adapter);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("VOLLEY", "ERROR");
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
    }



}



