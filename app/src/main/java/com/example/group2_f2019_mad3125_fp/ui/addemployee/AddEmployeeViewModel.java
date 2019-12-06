package com.example.group2_f2019_mad3125_fp.ui.addemployee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddEmployeeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddEmployeeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}