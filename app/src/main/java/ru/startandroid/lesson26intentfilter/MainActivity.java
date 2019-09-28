package ru.startandroid.lesson26intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //находим View

    Button btnTime = (Button) findViewById(R.id.btnTime);
    Button btnDate = (Button) findViewById(R.id.btnDate);

        //привязываем слушатель
        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {
        Intent intent;

        switch(v.getId()) {
            //кейс который будет реализован при нажатии на btnTime
            case R.id.btnTime:
                //создаю и инициализирую Intent с переходом на другую активность по action указанному в manifest
                intent = new Intent("ru.startandroid.intent.action.showtime");
                startActivity(intent);
                break;
                //кейс который будет реализован при нажатии на btnDate
            case R.id.btnDate:
                //создаю и инициализирую Intent с переходом на другую активность по action указанному в manifest
                intent = new Intent("ru.startandroid.intent.action.showdate");
                startActivity(intent);
                break;
        }
    }
}
