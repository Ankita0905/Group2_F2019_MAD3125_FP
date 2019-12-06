package com.example.group2_f2019_mad3125_fp.ui.addemployee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.group2_f2019_mad3125_fp.R;
import com.example.group2_f2019_mad3125_fp.model.employee.Employee;
import com.example.group2_f2019_mad3125_fp.model.vehicle.Vehicle;

public class AddEmployeeFragment extends Fragment {


    EditText edtName;

    EditText edtDob;

    CheckBox chkVehicle;

    RadioButton rbCar;

    RadioButton rbMotorcycle;

    RadioGroup rgbVehicle;

    LinearLayout linearVehicle;

    ImageView imgModel;

    EditText edtModel;

    EditText edtplate;

    RelativeLayout relativeVehicleInfo;

    RadioButton rbParttime;

    RadioButton rbIntern;

    RadioButton rbFulltime;

    RadioGroup rgbEmployeeType;

    LinearLayout linearEmpType;

    EditText edtHours;

    EditText edtRate;

    CheckBox chkFixedOrCommission;

    EditText edtCommissionPerOrFixedAmt;

    LinearLayout linearFixedOrCommission;

    LinearLayout linearParttime;

    EditText edtSchoolName;

    LinearLayout linearIntern;

    EditText edtSalary;

    EditText edtBonus;

    LinearLayout linearFulltime;

    Button btnSavePayroll;

    LinearLayout linearMain;


    String name;
    int age = 0;
    //String department;
    double rate;
    double hoursWorked;
    double salary;
    double bonus;
    String schoolName;
    double commisionPer;
    double fixedAmount;
    //int manufacturingYear;

    //    Employee employee = new Employee();
    Vehicle vehicle = null;
    Employee employee = null;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_addemployee, container, false);
        //final TextView textView = root.findViewById(R.id);
        edtName=root.findViewById(R.id.edtName);
        edtDob=root.findViewById(R.id.edtDob);
        chkVehicle=root.findViewById(R.id.chkVehicle);
        rbCar=root.findViewById(R.id.rbCar);
        rbMotorcycle=root.findViewById(R.id.rbMotorcycle);
        rgbVehicle=root.findViewById(R.id.rgbVehicle);
        linearVehicle=root.findViewById(R.id.linearVehicle);
        imgModel=root.findViewById(R.id.imgModel);
        edtModel=root.findViewById(R.id.edtModel);
        edtplate=root.findViewById(R.id.edtplate);
        relativeVehicleInfo=root.findViewById(R.id.relativeVehicleInfo);
        rbParttime=root.findViewById(R.id.rbParttime);
        rbFulltime=root.findViewById(R.id.rbFulltime);
        rbIntern=root.findViewById(R.id.rbIntern);
        rgbEmployeeType=root.findViewById(R.id.rgbEmployeeType);
        linearEmpType=root.findViewById(R.id.linearEmpType);
        edtHours=root.findViewById(R.id.edtHours);
        edtRate=root.findViewById(R.id.edtRate);
        chkFixedOrCommission=root.findViewById(R.id.chkFixedOrCommission);
        edtCommissionPerOrFixedAmt=root.findViewById(R.id.edtCommissionPerOrFixedAmt);
        linearFixedOrCommission=root.findViewById(R.id.linearFixedOrCommission);
        linearParttime=root.findViewById(R.id.linearParttime);
        edtSchoolName=root.findViewById(R.id.edtSchoolName);
        linearIntern=root.findViewById(R.id.linearIntern);
        edtSalary=root.findViewById(R.id.edtSalary);
        edtBonus= root.findViewById(R.id.edtBonus);
        linearFulltime=root.findViewById(R.id.linearFulltime);
        btnSavePayroll=root.findViewById(R.id.btnSavePayroll);
        linearMain=root.findViewById(R.id.linearMain);


        linearVehicle.setVisibility(View.GONE);
        relativeVehicleInfo.setVisibility(View.GONE);
        linearParttime.setVisibility(View.GONE);
        linearIntern.setVisibility(View.GONE);
        linearFulltime.setVisibility(View.GONE);

        chkVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rgbEmployeeType.setVisibility(View.VISIBLE);
                if (chkVehicle.isChecked())
                {
                    linearVehicle.setVisibility(View.VISIBLE);
                    relativeVehicleInfo.setVisibility(View.VISIBLE);
                }
                else
                {
                    linearVehicle.setVisibility(View.GONE);
                    relativeVehicleInfo.setVisibility(View.GONE);
                }
            }
        });
        rgbEmployeeType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                    linearParttime.setVisibility(View.GONE);
                    linearIntern.setVisibility(View.GONE);
                    linearFulltime.setVisibility(View.GONE);
                    switch (i)
                    {
                        case R.id.rbParttime:
                            linearParttime.setVisibility(View.VISIBLE);
                            break;

                        case R.id.rbIntern:
                            linearIntern.setVisibility(View.VISIBLE);

                            break;

                        case R.id.rbFulltime:
                            linearFulltime.setVisibility(View.VISIBLE);
                            break;
                    }
                }

        });



        return root;
    }


}