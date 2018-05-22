package pl.swiebodzin.pzs.kurs_android_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber,lastNumber;  //deklaracje obiektów i zmiennych
    int a,b,suma;
    Button clearButton, sumButton,rButton;
    TextView textSum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber=findViewById(R.id.firstNumber); //definicj wszystkich obiektów na apce
        lastNumber=findViewById(R.id.lastNumber);
        clearButton=findViewById(R.id.clearButton);
        sumButton=findViewById(R.id.sumButton);
        textSum=findViewById(R.id.textSum);
        rButton=findViewById(R.id.rButton);
        clearButton=findViewById(R.id.clearButton);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 textSum.clearComposingText();

            }
        });

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(firstNumber.getText().toString());
                b=Integer.parseInt(lastNumber.getText().toString());
                suma=getSum(a,b);
                textSum.setText(String.valueOf(suma));
            }
        });

        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(firstNumber.getText().toString());
                b=Integer.parseInt(lastNumber.getText().toString());
                suma=a-b;
                textSum.setText(String.valueOf(suma));
            }
        });

    }

    public int getSum(int n1,int n2) {
        return n1+n2;

    }

}
