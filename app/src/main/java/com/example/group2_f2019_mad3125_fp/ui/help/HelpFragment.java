package com.example.group2_f2019_mad3125_fp.ui.help;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.group2_f2019_mad3125_fp.R;

public class HelpFragment extends Fragment {

    private void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        //alertDialogBuilder.setIcon(R.drawable.ic_action_name);
        alertDialogBuilder.setTitle("Contact Us");
        alertDialogBuilder.setMessage("Email Us at: abc@gmail.com");
        alertDialogBuilder.setMessage("Call Us: 7656453567                                     " +
                " Email Us at: abc@gmail.com");
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }
        });
        alertDialogBuilder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog nAlertDialog=alertDialogBuilder.create();
        nAlertDialog.show();

    }



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_help, container, false);



        showAlert();

        return root;
    }
}