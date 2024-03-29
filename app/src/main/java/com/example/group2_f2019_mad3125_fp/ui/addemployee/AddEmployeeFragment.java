package com.example.group2_f2019_mad3125_fp.ui.addemployee;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.group2_f2019_mad3125_fp.R;
import com.example.group2_f2019_mad3125_fp.Singleton;
import com.example.group2_f2019_mad3125_fp.model.employee.Employee;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.FullTime;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.Intern;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.partTime.CommissionBasedPartTime;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.partTime.FixedBasedPartTime;
import com.example.group2_f2019_mad3125_fp.model.vehicle.Car;
import com.example.group2_f2019_mad3125_fp.model.vehicle.Motorcycle;
import com.example.group2_f2019_mad3125_fp.model.vehicle.Vehicle;

public class AddEmployeeFragment extends Fragment {


    Bundle bundle= new Bundle();
    EditText edtName;
    EditText edtDob;
    CheckBox chkVehicle;
    RadioButton rbCar;
    RadioButton rbMotorcycle;
    RadioGroup rgbVehicle;
    LinearLayout linearVehicle;
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


    Singleton singleton=Singleton.getInstance();

    String name;
    String schoolName;
    int age = 0;

    double rate;
    double hoursWorked;
    double salary;
    double bonus;

    double commisionPer;
    double fixedAmount;


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
        //imgModel=root.findViewById(R.id.imgModel);

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


        chkFixedOrCommission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (chkFixedOrCommission.isChecked())
                {
                    edtCommissionPerOrFixedAmt.setHint("Enter Fixed Commission Percentage");
                }
                else
                {
                    edtCommissionPerOrFixedAmt.setHint("Enter Fixed Commission Amount");
                }

            }
        });

        btnSavePayroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addData();
                getActivity().onBackPressed();
            }
        });

        return root;
    }



    public Employee addData(){

        if (rbIntern.isChecked()){
            name = edtName.getText().toString();
            age = Integer.parseInt(edtDob.getText().toString());
            schoolName = edtSchoolName.getText().toString();
            Intern intern = new Intern();
            intern.setName(name);
            intern.setSchoolName(schoolName);
            intern.setCalBirthYear(age);
            intern.setVehicle(vehicle);
            intern.calEarnings();
            intern.setEmployee("Intern");
            addVehicleData(intern);
            employee = intern;
            singleton.addEmployee(employee);
           Log.d("DataEntry", String.valueOf(intern.getAge()));
        }
        if (rbFulltime.isChecked()){
            name = edtName.getText().toString();
            age = Integer.parseInt(edtDob.getText().toString());
            salary = Double.parseDouble(edtSalary.getText().toString());
            bonus = Double.parseDouble(edtBonus.getText().toString());
            FullTime fullTime = new FullTime();
            fullTime.setName(name);
            fullTime.setCalBirthYear(age);
            fullTime.setSalary(salary);
            fullTime.setBonus(bonus);
            fullTime.setVehicle(vehicle);
            fullTime.setEmployee("FullTime");
            fullTime.calEarnings();
            addVehicleData(fullTime);
            employee = fullTime;
            singleton.addEmployee(employee);
            Log.d("DataEntry", String.valueOf(fullTime.getAge()));

        }
        if (rbParttime.isChecked()){
            if (chkFixedOrCommission.isChecked())
            {
                name = edtName.getText().toString();
                age = Integer.parseInt(edtDob.getText().toString());
                rate = Double.parseDouble(edtRate.getText().toString());
                hoursWorked = Double.parseDouble(edtHours.getText().toString());
                commisionPer = Double.parseDouble(edtCommissionPerOrFixedAmt.getText().toString());
                CommissionBasedPartTime com = new CommissionBasedPartTime();
                com.setName(name);
                com.setCalBirthYear(age);
                com.setRate(rate);
                com.setHoursWorked(hoursWorked);
                com.setCommissionPercentage(commisionPer);
                com.setVehicle(vehicle);
                com.calEarnings();
                com.setEmployee("Commission based");
                addVehicleData(com);
                employee = com;
                singleton.addEmployee(employee);
                Log.d("DataEntry", String.valueOf(com.getAge()));

            }else
            {
                name = edtName.getText().toString();
                age = Integer.parseInt(edtDob.getText().toString());
                rate = Double.parseDouble(edtRate.getText().toString());
                hoursWorked = Double.parseDouble(edtHours.getText().toString());
                fixedAmount = Double.parseDouble(edtCommissionPerOrFixedAmt.getText().toString());
                FixedBasedPartTime fix = new FixedBasedPartTime();
                fix.setName(name);
                fix.setCalBirthYear(age);
                fix.setRate(rate);
                fix.setHoursWorked(hoursWorked);
                fix.setFixedAmount(fixedAmount);
                fix.setVehicle(vehicle);
                fix.calEarnings();
                fix.setEmployee("Fixed based");
                addVehicleData(fix);
                employee = fix;
                singleton.addEmployee(employee);
                Log.d("DataEntry", String.valueOf(fix.getAge()));

            }
        }
       // Log.d("DataEntry", "Finish");
        return employee;
    }
    public void addVehicleData(Employee emp)
    {
        if (chkVehicle.isChecked()){
            if (rbCar.isChecked()){
                Car car = new Car();
                car.setVType("Car");
                car.setCompany(edtModel.getText().toString());
                car.setPlate(edtplate.getText().toString());
                car.setColour("car");
                car.setYear(2015);
                emp.setVehicleType("Car");
                emp.setVehicle(car);
                vehicle = car;
               // Log.d("DataEntry", "car");
            }
            if (rbMotorcycle.isChecked()){
                Motorcycle motorcycle = new Motorcycle();
                motorcycle.setVType("Motorcycle");
                motorcycle.setCompany(edtModel.getText().toString());
                motorcycle.setPlate(edtplate.getText().toString());
                motorcycle.setColour("MotorCycle");
                motorcycle.setYear(2015);
                emp.setVehicleType("motor");
                emp.setVehicle(motorcycle);
                vehicle = motorcycle;
               // Log.d("DataEntry", "motorcycle");
            }
        }
    }

}