package com.example.g3app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        RecyclerView recyclerView = findViewById(R.id.list_courses);
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Course1", 4.0));
        courses.add(new Course("Course2", 3.0));
        courses.add(new Course("Course3", 10.0));
        courses.add(new Course("Course1", 4.0));
        courses.add(new Course("Course2", 3.0));
        courses.add(new Course("Course3", 10.0));
        courses.add(new Course("Course1", 4.0));
        courses.add(new Course("Course2", 3.0));
        courses.add(new Course("Course3", 10.0));
        courses.add(new Course("Course1", 4.0));
        courses.add(new Course("Course2", 3.0));
        courses.add(new Course("Course3", 10.0));


        CourseAdapter courseAdapter = new CourseAdapter(courses);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }
}