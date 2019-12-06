package com.example.group2_f2019_mad3125_fp.ui.showemployee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShowEmployeeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShowEmployeeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}