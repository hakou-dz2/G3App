package com.example.g3app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.g3app.R;
import com.example.g3app.adapters.CourseAdapter;
import com.example.g3app.structs.Course;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.list_courses);
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Course1", 4.0, 3.0, 3.0));
        courses.add(new Course("Course2", 3.0, 2.0, 2.0));
        courses.add(new Course("Course3", 10.0, 4.0, 4.0));
        courses.add(new Course("Course1", 4.0, 3.0, 3.0));
        courses.add(new Course("Course2", 3.0, 2.0, 2.0));
        courses.add(new Course("Course3", 10.0, 4.0, 4.0));
        courses.add(new Course("Course1", 4.0, 3.0, 3.0));
        courses.add(new Course("Course2", 3.0, 2.0, 2.0));
        courses.add(new Course("Course3", 10.0, 4.0, 4.0));
        courses.add(new Course("Course1", 4.0, 3.0, 3.0));
        courses.add(new Course("Course2", 3.0, 2.0, 2.0));
        courses.add(new Course("Course3", 10.0, 4.0, 4.0));


        CourseAdapter courseAdapter = new CourseAdapter(courses, (CourseAdapter.OnItemClickListener) this.getActivity());
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
    }
}