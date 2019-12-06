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

import com.example.group2_f2019_mad3125_fp.R;

public class ShowEmployeeFragment extends Fragment {

    private ShowEmployeeViewModel showEmployeeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        showEmployeeViewModel =
                ViewModelProviders.of(this).get(ShowEmployeeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_showemployee, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        showEmployeeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}