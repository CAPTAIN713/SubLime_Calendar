package com.example.eric.sublime_calendar;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ERIC on 3/27/2016.
 */
public class FragmentAddEvent extends Fragment implements View.OnClickListener {
    private Context context;

    private EditText nameTB,dateTB,locationTB,emailListTB,eventTypeTB,startTimeTB,finishTimeTB,durationTB;
    private Button saveButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_add_event, container, false);
        context= layout.getContext();

        nameTB=(EditText) layout.findViewById(R.id.addEventNameTB);
        locationTB=(EditText) layout.findViewById(R.id.addEventLocationTB);
        emailListTB=(EditText) layout.findViewById(R.id.addEventEmailListTB);
        //eventTypeTB=(EditText) layout.findViewById(R.id.addEvent);
        startTimeTB=(EditText) layout.findViewById(R.id.addEventStartTimeTB);
        finishTimeTB=(EditText) layout.findViewById(R.id.addEventFinishTimeTB);
        //durationTB=(EditText) layout.findViewById(R.id.addEvent);
        dateTB=(EditText) layout.findViewById(R.id.addEventDateTB);

        saveButton = (Button) layout.findViewById(R.id.addEventSaveButton);
        saveButton.setOnClickListener(this);

        return layout;
    }

    @Override
        /*link on how to handle mutiple button clicks
         http://stackoverflow.com/questions/21827046/handle-multiple-button-click-in-view-onclicklistener-in-android*/
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.addEventSaveButton:
                Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show();

                if(getFragmentManager().getBackStackEntryCount()>1)
                {
                    //if at least one thing on fragment stack go back to that one
                    getFragmentManager().popBackStack();
                }

                break;
        }

    }

}//end of class