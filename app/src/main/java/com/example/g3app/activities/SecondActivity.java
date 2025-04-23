package com.example.g3app.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.g3app.fragments.InfoFragment;
import com.example.g3app.structs.Course;
import com.example.g3app.adapters.CourseAdapter;
import com.example.g3app.R;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements CourseAdapter.OnItemClickListener {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

    }

    @Override
    public void onItemClick(Course course) {
        boolean IsTablet = getResources().getBoolean(R.bool.IsTablet);

        if(IsTablet){
            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.tablet_info_cont);
            InfoFragment info = (InfoFragment) fragment;
            info.Dispaly_info(course);

        }else {

            FragmentTransaction fragmentController = getSupportFragmentManager().beginTransaction();

            Bundle bundle = new Bundle();
            bundle.putString("name", course.getName());
            bundle.putDouble("grade", course.getGrade());
            bundle.putDouble("credit", course.getCredit());
            bundle.putDouble("Coeff", course.getCoeff());

            InfoFragment infoFragment = new InfoFragment();
            infoFragment.setArguments(bundle);

            fragmentController.replace(R.id.frag_cont, infoFragment);
            fragmentController.addToBackStack(null);
            fragmentController.commit();
        }
    }
}