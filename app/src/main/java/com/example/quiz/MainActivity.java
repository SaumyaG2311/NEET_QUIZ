package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    TextView tv1,tv2,tv3;
    RadioButton a,b,c,d;
    Button bt;
    RadioGroup rg;
    int q,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 = (EditText) findViewById(R.id.user);
        tv1 = (TextView) findViewById(R.id.ques);
        tv2 = (TextView) findViewById(R.id.response);
        tv3 = (TextView) findViewById(R.id.score);
        rg = (RadioGroup) findViewById(R.id.optionGroup);
        a = (RadioButton) findViewById(R.id.option1);
        b = (RadioButton) findViewById(R.id.option2);
        c = (RadioButton) findViewById(R.id.option3);
        d = (RadioButton) findViewById(R.id.option4);
        bt = (Button) findViewById(R.id.next);
        q = 0;
        s = 0;
    }

    public void quiz
            (View v){
        switch (q){
            case 0:
            {
                rg.setVisibility(View.VISIBLE);
                ed1.setVisibility(View.GONE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                // ed1.setEnabled(true);
                bt.setText("Next");
                s=0;

                tv1.setText("1.  The type of cells found in retina are? ");
                a.setText(" Purkinje cells");
                b.setText("Schwann cells");
                c.setText("Neuroglial cells");
                d.setText("Amacrine cells");

                q=1;
                break;
            }
            case 1:
            {

                if (d.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is Amacrine cells" ,
                                  Toast.LENGTH_LONG).show();
                }

                tv1.setText("2. Cornea transplant is never rejected in humans because?");
                a.setText(" it consists of enucleated cells");
                b.setText("it is a non-living layer");
                c.setText("it has no blood supply");
                d.setText("its cells are least penetrable by bacteria");


                q=2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2:
            {
                tv1.setText("3. Black pigment in the eye that reduces internal reflection is located in?");
                a.setText("cornea");
                b.setText("iris");
                c.setText(" retina");
                d.setText("sclerotic");
                if (c.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                    // tv2.setText("Right Answer");

                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is it has no blood supply" ,
                            Toast.LENGTH_LONG).show();
                    //tv2.setText("Wrong Answer   A was Right Answer");
                }
                q=3;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3:
            {

                tv1.setText("4. The fovea is the mammalian eye is the centre of the visual field wherein?");
                a.setText("the optic nerve exits the eye");
                b.setText("only rods are found");
                c.setText("more rods than cones are found");
                d.setText("no rods but a high density of cones occur");
                if (c.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                    //tv2.setText("Right Answer");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is retina" ,
                            Toast.LENGTH_LONG).show();
                    //tv2.setText("Wrong Answer  C was Right Answer");
                }
                q=4;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4:
            {
                tv1.setText("5. In human eye, the photosensitive compound is composed of?");
                a.setText("guanosine and retinol");
                b.setText("transducin and retinene");
                c.setText("opsin and retinol");
                d.setText("opsin and retinal");
                if (d.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                    //tv2.setText("Right Answer");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is no rods but a high density of cones occur" ,
                            Toast.LENGTH_LONG).show();
                    //tv2.setText("Wrong Answer  B was Right Answer");
                }
                q=5;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 5:
            {
                tv1.setText("6. Forward stereoscopic visual field will be the greatest in?");
                a.setText("Rabbit");
                b.setText("Cat");
                c.setText("Horse");
                d.setText("Deer");
                if (d.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                    //tv2.setText("Right Answer");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is opsin and retinal" ,
                            Toast.LENGTH_LONG).show();
                    //tv2.setText("Wrong Answer  B was Right Answer");
                }
                q=6;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 6:
            {
                tv1.setText("7. The eye lens is?");
                a.setText("Concave");
                b.setText("Convex");
                c.setText("Biconcave");
                d.setText("Biconvex");
                if (b.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                    //tv2.setText("Right Answer");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is Cat " ,
                            Toast.LENGTH_LONG).show();
                    //tv2.setText("Wrong Answer  B was Right Answer");
                }
                q=7;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 7:
            {
                tv1.setText("8. Greatest refraction of light is caused through?");
                a.setText("iris");
                b.setText("Pupil");
                c.setText("choroid coat");
                d.setText("sclerotic coat");
                if (d.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is Biconvex" ,
                            Toast.LENGTH_LONG).show();
                }
                q=8;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 8:
            {
                tv1.setText("9. What does the tapetum lucidum do?");
                a.setText("it is the colored part of the eye");
                b.setText("transparent jelly-like fluid");
                c.setText(" gives animals night vision");
                d.setText("it is the area where the optic never attaches");
                if (d.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is sclerotic coat" ,
                            Toast.LENGTH_LONG).show();
                }
                q=9;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 9:
            {
                tv1.setText("10. The innermost layer and the most delicate layer of the eyeball where the photoreceptors are located are?");
                a.setText("Retina");
                b.setText("Chloroid");
                c.setText("Sclera");
                d.setText("Cornea");
                if (c.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is gives animals night vision" ,
                            Toast.LENGTH_LONG).show();
                }
                q=10;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                bt.setText("Finish");
                break;
            }
            case 10:
            {
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                if (a.isChecked()){
                    Toast.makeText(MainActivity.this, "This the correct answer ",
                            Toast.LENGTH_LONG).show();
                    s=s+10;
                    //tv2.setText("Right Answer");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "This is the wrong answer. The correct answer is Retina" ,
                            Toast.LENGTH_LONG).show();
                    //tv2.setText("Wrong Answer  D was Right Answer");
                }
                tv3.setText(ed1.getText() + "'s final score is "+s);
                bt.setText("Restart");
                q=0;
                break;
            }
        }
    }
}