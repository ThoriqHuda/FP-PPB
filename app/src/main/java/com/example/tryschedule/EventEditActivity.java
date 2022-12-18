package com.example.tryschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalTime;

public class EventEditActivity extends AppCompatActivity
{
    private EditText NameEdit,TimeEdit;
    private TextView DateText, TimeText;

    private LocalTime time;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_edit);
        init();
        time = LocalTime.now();
        DateText.setText("Date: " + CalendarUtilityFunc.Dateformat(CalendarUtilityFunc.selectedDate));
    }
    public void saveEvent(View view)
    {
        String eventName = NameEdit.getText().toString();
        String eventTime = TimeEdit.getText().toString();
        Event newEvent = new Event(eventName, CalendarUtilityFunc.selectedDate, eventTime);
        Event.eventsList.add(newEvent);
        finish();
    }
    private void init()
    {
        NameEdit = findViewById(R.id.Name);
        TimeEdit = findViewById(R.id.Time2);
        DateText = findViewById(R.id.Date);
        TimeText = findViewById(R.id.Time1);
    }


}
