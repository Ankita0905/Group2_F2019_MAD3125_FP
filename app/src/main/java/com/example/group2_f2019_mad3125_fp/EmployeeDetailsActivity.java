package com.example.group2_f2019_mad3125_fp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.group2_f2019_mad3125_fp.model.employee.Employee;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.FullTime;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.Intern;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.PartTime;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.partTime.CommissionBasedPartTime;
import com.example.group2_f2019_mad3125_fp.model.employee.employeeType.partTime.FixedBasedPartTime;

public class EmployeeDetailsActivity extends AppCompatActivity {

    TextView name,age,empType,schoolName,totalSalary,bonus,basicSalaryFt,totalSalaryFt,hoursWorked,rate,commissionPer,fixedAmount,totalSalaryComPt,totalSalaryFixPt;
    ConstraintLayout intern,ftLayout,ptLayout,cmPtLayout,fbPtLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);

        name = findViewById(R.id.txtName);
        age = findViewById(R.id.txtAge);
        empType = findViewById(R.id.txtEType);
        schoolName = findViewById(R.id.txtSchoolName);
        totalSalary = findViewById(R.id.txtTotalSalary);
        bonus=findViewById(R.id.txtBonus);
        basicSalaryFt=findViewById(R.id.txtSalary);
        totalSalaryFt=findViewById(R.id.txtFTotalSalary);
        hoursWorked=findViewById(R.id.txtHrsWorked);
        rate=findViewById(R.id.txtRate);
        commissionPer=findViewById(R.id.txtCommPer);
        fixedAmount=findViewById(R.id.txtFixedAmnount);
        totalSalaryComPt=findViewById(R.id.txtComPTotalSalary);
        totalSalaryFixPt=findViewById(R.id.txtFixPTotalSalary);
        intern = findViewById(R.id.InternLayout);
        ftLayout=findViewById(R.id.FullTmLayout);
        ptLayout=findViewById(R.id.PartTmLayout);
        cmPtLayout=findViewById(R.id.PTCommLayout);
        fbPtLayout=findViewById(R.id.PTFixLayout);
        cmPtLayout.setVisibility(View.GONE);
        fbPtLayout.setVisibility(View.GONE);
        ptLayout.setVisibility(View.GONE);
        ftLayout.setVisibility(View.GONE);
        intern.setVisibility(View.GONE);

//        RecyclerViewAdapter r=new RecyclerViewAdapter();
//        System.out.println("POS :"+r.getPos());

        Employee e = (Employee) getIntent().getSerializableExtra("employee");
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getEmployee());

        name.setText(String.valueOf(e.getName()));
        age.setText(String.valueOf(e.getAge()));
        empType.setText(String.valueOf(e.getEmployee()));
        if (e instanceof Intern) {
            intern.setVisibility(View.VISIBLE);
            schoolName.setText(((Intern) e).getSchoolName());
            totalSalary.setText(String.valueOf(e.calEarnings()));
        }

        if(e instanceof FullTime)
        {
            ftLayout.setVisibility(View.VISIBLE);
            bonus.setText(String.valueOf(((FullTime)e).getBonus()));
            basicSalaryFt.setText(String.valueOf(((FullTime)e).getSalary()));
            totalSalaryFt.setText(String.valueOf(((FullTime)e).calEarnings()));
        }
        if(e instanceof PartTime)
        {
            ptLayout.setVisibility(View.VISIBLE);
            hoursWorked.setText(String.valueOf(((PartTime)e).getHoursWorked()));
            rate.setText(String.valueOf(((PartTime)e).getRate()));

            if(e instanceof CommissionBasedPartTime)
            {
                cmPtLayout.setVisibility(View.VISIBLE);
                commissionPer.setText(String.valueOf(((CommissionBasedPartTime)e).getCommissionPercentage()));
                totalSalaryComPt.setText(String.valueOf(((CommissionBasedPartTime)e).calEarnings()));
            }
            else
            {
                fbPtLayout.setVisibility(View.VISIBLE);
                fixedAmount.setText(String.valueOf(((FixedBasedPartTime)e).getFixedAmount()));
                totalSalaryFixPt.setText(String.valueOf(((FixedBasedPartTime)e).calEarnings()));
            }


        }

    }
    }
