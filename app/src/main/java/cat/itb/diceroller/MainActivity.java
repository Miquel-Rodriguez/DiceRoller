package cat.itb.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    Button button_res;
    Button button_dice1;
    Button button_dice2;

    ImageView imageView;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_dice1 = findViewById(R.id.button_dice1);
        button_dice2 = findViewById(R.id.button_dice2);
        button_res = findViewById(R.id.button_res);
        rollButton = findViewById(R.id.roll_button);
        imageView = findViewById(R.id.image);
        imageView2 = findViewById(R.id.imageTwo);

        inici();

        button_dice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll1();
            }
        });

        button_dice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll2();
            }
        });

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"has pulsat el botó",Toast.LENGTH_LONG).show();
                rollButton.setText("Dice Rolled");
                //String.valueOf((int)(Math.random()*6)+1));
                //rollButton.setText(String.valueOf(result1+result2));

                int resultat = roll1();
                if (resultat == roll2() && resultat == 6) {
                    Toast toast = Toast.makeText(MainActivity.this, "JACKPOT!!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast.show();
                }

            }
        });
        button_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inici();
            }
        });

        }

    private void inici() {
        imageView.setImageResource(R.drawable.empty_dice);
        imageView2.setImageResource(R.drawable.empty_dice);
        rollButton.setText("Roll the dice");
    }

    private  int roll1(){
        int result1 = (int) (Math.random() * 6) + 1;
        switch (result1) {
            case 1:
                imageView.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice_6);
                break;
        }
        return result1;
    }

    private  int roll2(){
        int result2 = (int) (Math.random() * 6) + 1;
        switch (result2) {
            case 1:
                imageView2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice_6);
                break;
        }
        return result2;
    }

}

