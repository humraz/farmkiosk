package com.example.humraz.nakshatra;

import android.database.CursorJoiner;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.Random;                import android.os.Vibrator;


public class Main2Activity extends AppCompatActivity {
    ArrayList<String> username = new ArrayList<String>();
    String passs;
    int score=0;
    int wrong =0;
    int flag=0;
    int Result;
    int vv=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Firebase.setAndroidContext(this);


time();


       Start();


    }
    public void time()
    {
        final TextView tv= (TextView)findViewById(R.id.time);
        final Button bt= (Button) findViewById(R.id.button);
        bt.setVisibility(View.INVISIBLE);
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                tv.setText(" " + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                tv.setText("done!");
                Toast.makeText(Main2Activity.this, "Time is UP!",Toast.LENGTH_LONG).show();
                TextView y= (TextView)findViewById(R.id.fi);
                TextView tt= (TextView)findViewById(R.id.q);
                tt.setText("Time is up!");
                TextView b1= (TextView)findViewById(R.id.b1);
                TextView b2= (TextView)findViewById(R.id.b2);

                TextView b3= (TextView)findViewById(R.id.b3);
                TextView b4= (TextView)findViewById(R.id.b4);

                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                y.setText("Your Score is " +String.valueOf(score)+" Correct and " + String.valueOf(wrong) + " Wrong");
                bt.setVisibility(View.VISIBLE);

                Vibrator v = (Vibrator) getSystemService(Main2Activity.VIBRATOR_SERVICE);
                // Vibrate for 500 milliseconds
                v.vibrate(500);

                flag=1;
            }

        }.start();
    }

    public void Start()
    {

        Random r = new Random();
        int o = r.nextInt(45 - 28) + 28;
        int t = r.nextInt(45 - 28) + 28;
        TextView tt= (TextView)findViewById(R.id.q);
        String a= o+"+"+t;
        tt.setText(a);
        int ans =o+t;
        int t1 = r.nextInt(45 - 28) + 28;
        int t2 = r.nextInt(45 - 28) + 28;
        int t3 = r.nextInt(45 - 28) + 28;
        int t4 = r.nextInt(45 - 28) + 28;

        TextView b1= (TextView)findViewById(R.id.b1);
        TextView b2= (TextView)findViewById(R.id.b2);

        TextView b3= (TextView)findViewById(R.id.b3);
        TextView b4= (TextView)findViewById(R.id.b4);
        Random r2 = new Random();
        int Low = 1;
        int High = 4;
        Result = r.nextInt(High-Low) + Low;

        b1.setText(String.valueOf(t1));
        b2.setText(String.valueOf(t2));
        b3.setText(String.valueOf(t3));
        b4.setText(String.valueOf(t4));

        if (Result==1)
        {
            b1.setText(String.valueOf(ans));
        }
        else if (Result==2)
        {

            b2.setText(String.valueOf(ans));

        }
        else
            if (Result==3)
            {
                b3.setText(String.valueOf(ans));

            }
        else
                if (Result==4)
                {
                    b4.setText(String.valueOf(ans));

                }
    }

    public void r(View view)
    {
        score=0;
        wrong=0;
        TextView ttt=(TextView)findViewById(R.id.score);
        ttt.setText(String.valueOf(0));
        time();
        TextView y= (TextView)findViewById(R.id.fi);
y.setText("");
        Start();
    }
    public void wro()
    {
       // Toast.makeText(this, "Wrong ",Toast.LENGTH_SHORT).show();
        wrong=wrong+1;
        TextView ttt=(TextView)findViewById(R.id.score);
        ttt.setText(String.valueOf(score)+"/"+String.valueOf(wrong));
        TextView y= (TextView)findViewById(R.id.fi);
        y.setText("Wrong");
        Start();


    }
    public void cor()
    {
       // Toast.makeText(this, "Correct ",Toast.LENGTH_SHORT).show();
        score=score+1;
        TextView ttt=(TextView)findViewById(R.id.score);
        ttt.setText(String.valueOf(score)+"/"+String.valueOf(wrong));
        TextView y= (TextView)findViewById(R.id.fi);
        y.setText("Correct");
        Start();


    }
    public void c (View v)
    {vv=4;
        if (Result==vv)
            cor();
        else
        wro();
       /* Toast.makeText(this, "Correct ",Toast.LENGTH_SHORT).show();
        score=score+1;
        TextView ttt=(TextView)findViewById(R.id.score);
        ttt.setText(String.valueOf(score)+"/"+String.valueOf(wrong));
        Start();*/
    }
    public void d1 (View v)
    {vv=1;
        if (Result==vv)
            cor();
        else
            wro();
      /*  Toast.makeText(this, "Wrong ",Toast.LENGTH_SHORT).show();
        wrong=wrong+1;
        TextView ttt=(TextView)findViewById(R.id.score);
        ttt.setText(String.valueOf(score)+"/"+String.valueOf(wrong));*/

    }
    public void d2 (View v)
    {vv=2;
        if (Result==vv)
            cor();
        else
            wro();

       /* Toast.makeText(this, "Wrong ",Toast.LENGTH_SHORT).show();
        wrong=wrong+1;
        TextView ttt=(TextView)findViewById(R.id.score);
        ttt.setText(String.valueOf(score)+"/"+String.valueOf(wrong));
*/
    }
    public void d3 (View v)
    {vv=3;
        if (Result==vv)
            cor();
        else
            wro();
       /* Toast.makeText(this, "Wrong ",Toast.LENGTH_SHORT).show();
        wrong=wrong+1;
        TextView ttt=(TextView)findViewById(R.id.score);
        ttt.setText(String.valueOf(score)+"/"+String.valueOf(wrong));
*/
    }

}
