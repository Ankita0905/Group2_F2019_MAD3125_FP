package com.example.group2_f2019_mad3125_fp.ui.showemployee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group2_f2019_mad3125_fp.R;
import com.example.group2_f2019_mad3125_fp.RecyclerViewDemoAdapter;
import com.example.group2_f2019_mad3125_fp.Singleton;
import com.example.group2_f2019_mad3125_fp.model.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class ShowEmployeeFragment extends Fragment {

    private RecyclerView rvEmpList;
    private List<Employee> employeeList;
    private RecyclerViewDemoAdapter demoAdapter;
    Singleton singleton=Singleton.getInstance();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_showemployee, container, false);
        rvEmpList = root.findViewById(R.id.emplistrv);
        initViews();
        return root;
    }

    private void initViews() {
        populateData();
        demoAdapter = new RecyclerViewDemoAdapter(employeeList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        rvEmpList.setLayoutManager(mLayoutManager);
        rvEmpList.setAdapter(demoAdapter);

    }

    private void populateData() {
        employeeList = new ArrayList<>();
        employeeList=singleton.getEmployees();


    }
}