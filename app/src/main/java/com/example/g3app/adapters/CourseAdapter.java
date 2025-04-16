package com.example.g3app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.g3app.structs.Course;
import com.example.g3app.R;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>{

    List<Course> courses;
    public CourseAdapter(List<Course> courses, OnItemClickListener listener) {
        this.courses = courses;
        this.listener = listener;

    }
    @NonNull
    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course,parent,false);
        return new CourseViewHolder(view);
    }

    public interface OnItemClickListener{
        void onItemClick(Course course);
    }

    public OnItemClickListener listener;


    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
        holder.name.setText(courses.get(position).getName());
        holder.grade.setText(courses.get(position).getGrade().toString());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(courses.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder{
        TextView name,grade;
        CardView card;
        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_course);
            grade = itemView.findViewById(R.id.tv_grade);
            card  = itemView.findViewById(R.id.card);
        }
    }
}
