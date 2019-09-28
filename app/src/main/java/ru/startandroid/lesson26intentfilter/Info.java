package ru.startandroid.lesson26intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        //получаем intent который вызвал данную активность
        Intent intent = getIntent();
        //считываем из него action
        String action = intent.getAction();
        //создаю переменные типа string
        String format = "", textInfo = "";
        //в зависимости от action заполняю переменные
        if (action.equals("ru.startandroid.intent.action.showtime")) {
            format = "HH:mm:ss";
            textInfo = "Time:";
        }
        else if(action.equals("ru.startandroid.intent.action.showdate")) {
            format = "dd.MM.yyyy";
            textInfo = "Date:";
        }
        //выбираем формат в зависимости от переменно
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        //получаем дату или время в переменную datetime
        String datetime = sdf.format(new Date(System.currentTimeMillis()));
        //находим view по id
        TextView tvDate = (TextView) findViewById(R.id.tvInfo);
        //кладём данные о времени(дате) в tvDate выводя различные textInfo и datetime в зависимости от action
        tvDate.setText(textInfo + datetime);
    }
}
