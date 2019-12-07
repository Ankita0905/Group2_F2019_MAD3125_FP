package com.example.group2_f2019_mad3125_fp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group2_f2019_mad3125_fp.model.employee.Employee;

import java.io.Serializable;
import java.util.List;

public class RecyclerViewDemoAdapter extends RecyclerView.Adapter<RecyclerViewDemoAdapter.DemoViewHolder> {

    private List<Employee> employeeList;

    public RecyclerViewDemoAdapter(List<Employee> countryList)
    {
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_row, parent, false);
        return new DemoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final DemoViewHolder holder, int position)
    {
        final Employee mEmp = employeeList.get(position);
        holder.empName.setText(mEmp.getName());
        holder.empType.setText(mEmp.getEmployee());

        //Setting click on cell
       holder.itemView.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view)
           {
               Toast.makeText(holder.itemView.getContext(), mEmp.getName(), Toast.LENGTH_SHORT).show();

               Intent mIntent = new Intent(holder.itemView.getContext(), EmployeeDetailsActivity.class);
               mIntent.putExtra("country",(Serializable) mEmp);
               holder.itemView.getContext().startActivity(mIntent);
               
           }
       });
    }

    @Override
    public int getItemCount()
    {
        return employeeList.size();
    }

    public static class DemoViewHolder extends RecyclerView.ViewHolder {
        public TextView empName;
        public TextView empType;
        public DemoViewHolder(@NonNull View itemView)
        {
            super(itemView);
            empName = itemView.findViewById(R.id.txtEmpName);
           empType = itemView.findViewById(R.id.txtEmpType);
        }
    }
}
