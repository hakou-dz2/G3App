package com.example.g3app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.g3app.R;
import com.example.g3app.structs.Course;


public class InfoFragment extends Fragment {
    TextView name,grade,coeff,credits;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        name = view.findViewById(R.id.tv_info_name);
        grade = view.findViewById(R.id.tv_info_grade);
        coeff = view.findViewById(R.id.tv_info_coeff);
        credits = view.findViewById(R.id.tv_info_cred);

        Bundle bundle = this.getArguments();
        if(bundle !=null) {
            name.setText(bundle.getString("name"));
            grade.setText(Double.toString(bundle.getDouble("grade")));
            coeff.setText(Double.toString(bundle.getDouble("Coeff")));
            credits.setText(Double.toString(bundle.getDouble("credit")));
        }
    }

    public void Dispaly_info(Course course){
        name.setText(course.getName());
        grade.setText(Double.toString(course.getGrade()));
        coeff.setText(Double.toString(course.getCoeff()));
        credits.setText(Double.toString(course.getCredit()));

    }
}