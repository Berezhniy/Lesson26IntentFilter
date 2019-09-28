package ru.startandroid.lesson26intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class ActivityTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        //Задаю формат времени
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        //создаю date типа String и в заданном формате кладу в неё время в плоть до милисекунд
        String time = sdf.format(new Date(System.currentTimeMillis()));
        //Нахожу View по id
        TextView tvTime = (TextView) findViewById(R.id.tvTime);
        //кладу данные из data во view
        tvTime.setText(time);
    }
}
