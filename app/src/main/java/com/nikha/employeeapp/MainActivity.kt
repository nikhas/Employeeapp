package com.nikha.employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Submit_click_event(view: View) {
        var nameEditText=findViewById<EditText>(R.id.Ename);
        var designationEdittext=findViewById<EditText>(R.id.Designation);
        var salaryEditText=findViewById<EditText>(R.id.salary);
        var cnameTextEdit=findViewById<EditText>(R.id.companyname);
        var ageTextEdit=findViewById<EditText>(R.id.age);
        var getEname=nameEditText.text.toString();
        var getDesignation=designationEdittext.text.toString();
        var getsalary=salaryEditText.text.toString();
        var getcompanyname=cnameTextEdit.text.toString();
        var getage=ageTextEdit.text.toString();
        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
    }
}