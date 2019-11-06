package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //My Code

   /* public void on_button_click(View view) {

        int random2 = returnRandomNumber();
        TextView viewRandom = this.findViewById(R.id.random);
        viewRandom.setText(Integer.toString(random2));
        roll_the_dice();


    }*/

    public void on_button_click3(View view){

        TextView tv = this.findViewById(R.id.NumberTextView);
        Random r = new Random();
        int number=r.nextInt(6);
        int random2 = returnRandomNumber();



        tv.setText(Integer.toString(random2));
        tv.setText(Integer.toString(number));


         roll_the_dice();

    }


 public void on_button_click1(View view) {
        TextView display = this.findViewById(R.id.random);

       int question = returnRandomNumber() -1 ;
       display.setText(Integer.toString(question));
       TextView Game1 = this.findViewById(R.id.IceBreaker);

        ArrayList<String> questionList = new ArrayList<String>();
        questionList.add("If you could go anywhere in the world, where would you go?\n"); //Q0
        questionList.add("If you were stranded on a desert island, what three things would you want to take with you?");//Q1
        questionList.add("If you could eat only one food for the rest of your life, what would that be?\n");//Q2
        questionList.add("If you won a million dollars, what is the first thing you would buy?\n");//Q3
        questionList.add("If you could spaned the day with one fictional character, who would it be?\n");//Q4
        questionList.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");//Q5

        Game1.setText(questionList.get(question));

    }


   public static int returnRandomNumber() {

        Random r = new Random();
        int number = r.nextInt(6) + 1;
        return number;

    }


    public void roll_the_dice() {

        TextView mssgoutput = this.findViewById(R.id.message);
        TextView tv = this.findViewById(R.id.NumberTextView);
        TextView inputt = this.findViewById(R.id.input);
        TextView score1 = this.findViewById(R.id.score);

        int random3 = Integer.parseInt(tv.getText().toString());
        int inputUser = Integer.parseInt(inputt.getText().toString());
        int score2 = Integer.parseInt(score1.getText().toString());

        if (random3 == inputUser) {
            mssgoutput.setText("Congratulations!!");
            score2++;
            score1.setText(Integer.toString(score2));
        } else {
            mssgoutput.setText("Keep Trying");
        }
    }
}