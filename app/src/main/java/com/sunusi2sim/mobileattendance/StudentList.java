package com.sunusi2sim.mobileattendance;

/**
 * Created by HP USER on 04/05/2016.
 */
public class StudentList {

        private int id;
        private String reg_no;
        private String firstname;
        private String lastname;
        private String surname;


        //Constructor

        public StudentList(int id,String reg_no, String firstname,  String lastname, String surname) {
            this.id = id;
            this.reg_no = reg_no;
            this.firstname = firstname;
            this.lastname = lastname;
            this.surname = surname;
        }

        //Setter, getter

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        public String getReg_no() {
            return reg_no;
        }


        public void  setReg_no(String reg_no) {
            this.reg_no = reg_no;
        }


        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
        public String getFirstname() {
            return firstname;
        }

        public String getLasttname() {
            return lastname;
        }


        public String getSurname() {
            return surname;
        }

        public void setSurtname(String surname) {
            this.surname = surname;
        }

    }


