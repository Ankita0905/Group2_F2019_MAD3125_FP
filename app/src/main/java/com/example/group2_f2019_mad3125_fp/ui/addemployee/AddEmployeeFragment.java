package com.example.group2_f2019_mad3125_fp.ui.addemployee;

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

import com.example.group2_f2019_mad3125_fp.R;

public class AddEmployeeFragment extends Fragment {

    private AddEmployeeViewModel addEmployeeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addEmployeeViewModel =
                ViewModelProviders.of(this).get(AddEmployeeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_addemployee, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        addEmployeeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}