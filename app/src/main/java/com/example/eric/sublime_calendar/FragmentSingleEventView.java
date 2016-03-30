package com.example.eric.sublime_calendar;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragmentSingleEventView extends Fragment implements View.OnClickListener{

    private Context context;
    private TextView name,date,startTime,finishTime,location,emailList,eventType, note;
    private Button editButton, shareButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_single_event_view, container, false);
        context=layout.getContext();

        name =(TextView) layout.findViewById(R.id.singleEventNameField);
        date =(TextView) layout.findViewById(R.id.singleEventDateField);
        startTime =(TextView) layout.findViewById(R.id.singleEventStartTimeField);
        finishTime =(TextView) layout.findViewById(R.id.singleEventFinishTimeField);
        location =(TextView) layout.findViewById(R.id.singleEventLocationField);
        emailList =(TextView) layout.findViewById(R.id.singleEventEmailListField);
        eventType =(TextView) layout.findViewById(R.id.singleEventEventTypeField);
        note =(TextView) layout.findViewById(R.id.singleEventNoteField);

        editButton = (Button) layout.findViewById(R.id.singleEventEditButton);
        shareButton = (Button) layout.findViewById(R.id.singleEventShareButton);

        editButton.setOnClickListener(this);
        shareButton.setOnClickListener(this);

        return layout;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.singleEventEditButton:
                break;
            case R.id.singleEventShareButton:
                break;
        }
    } //end of onClick method

}//end of fragement class
