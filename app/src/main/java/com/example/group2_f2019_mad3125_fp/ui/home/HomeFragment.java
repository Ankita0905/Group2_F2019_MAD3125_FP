package com.example.group2_f2019_mad3125_fp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.group2_f2019_mad3125_fp.R;
import com.example.group2_f2019_mad3125_fp.Singleton;

import java.text.DateFormat;
import java.util.Date;

public class HomeFragment extends Fragment {

    Singleton singleton=Singleton.getInstance();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView dateTextView = root.findViewById(R.id.text_date);
        TextView numEmp=root.findViewById(R.id.numberEmp);
        Date todayDate = new Date();

        //Get an instance of the formatter
        DateFormat dateFormat = DateFormat.getDateInstance();

        //If you want to show only the date then you will use
        //DateFormat dateFormat = DateFormat.getDateInstance();

        //Format date
        String todayDateTimeString = dateFormat.format(todayDate);

        //display Date
        dateTextView.setText(todayDateTimeString);

        numEmp.setText("Number Of Employees : "+singleton.arraySize());
        return root;
    }

//    @Override
//    public void onBackPressed() {
//        if (this.f.isDrawerOpen(GravityCompat.START)) {
//            this.drawerLayout.closeDrawer(GravityCompat.START);
//        } else {
//            finish();
//        }
//    }
}