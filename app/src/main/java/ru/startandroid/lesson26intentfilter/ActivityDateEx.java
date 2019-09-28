package ru.startandroid.lesson26intentfilter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;


public class ActivityDateEx extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        //Задаю формат даты
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        //создаю date типа String и в заданном формате кладу в неё время в плоть до милисекунд
        String date = sdf.format(new Date(System.currentTimeMillis()));
        //Нахожу View по id
        TextView tvDate = (TextView) findViewById(R.id.tvDate);
        //кладу данные из data во view
        tvDate.setText(date);
    }
}
