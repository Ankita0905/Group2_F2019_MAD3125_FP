package com.example.group2_f2019_mad3125_fp.ui.logout;

import android.content.Intent;
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

import com.example.group2_f2019_mad3125_fp.LoginActivity;
import com.example.group2_f2019_mad3125_fp.R;

public class LogoutFragment extends Fragment {

//    private SessionManager session;
//    private void logoutUser() {
//       session = new SessionManager(getApplicationContext());
//
//        session.setLogin(false);
//
//
//
//        // Launching the login activity
//        Intent intent = new Intent(LogoutFragment.this, LoginActivity.class);
//        startActivity(intent);
//        finish();
//    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_logout, container, false);
        final TextView textView = root.findViewById(R.id.text_share);

        return root;
    }
}