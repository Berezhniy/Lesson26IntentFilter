package ru.startandroid.lesson26intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;


public class ActivityDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        //задаю формат даты
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        //создаю date типа String и в заданном формате помещаю в неё дату(точность до милисекунд)
        String date = sdf.format(new Date(System.currentTimeMillis()));
        //нахожу view по айди и кладу в неё данные хранящиеся в date
        TextView tvDate = (TextView) findViewById(R.id.tvDate);
        tvDate.setText(date);
    }
}