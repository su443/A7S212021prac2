package mx.edu.tesoem.isc.svj.pantallainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RestarActivity extends AppCompatActivity {

    EditText num3,num4;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);


        num3 =findViewById(R.id.txtnum3);
        num4 =findViewById(R.id.txtnum4);
        resultado = findViewById(R.id.lblresult);
    }


     public void pcalcular(View v) {
         int vnum3 = Integer.parseInt(num3.getText().toString());
         int vnum4 = Integer.parseInt(num4.getText().toString());
         resultado.setText("El resultado es :" + (vnum3 - vnum4));

     }
}