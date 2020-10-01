package mx.edu.tesoem.isc.svj.pantallainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DividirActivity extends AppCompatActivity {

    EditText num5,num6;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);


        num5 =findViewById(R.id.txtnum5);
        num6 =findViewById(R.id.txtnum6);
        resultado = findViewById(R.id.lblresult);

    }


    public void pcalcular(View v) {
        int vnum5 = Integer.parseInt(num5.getText().toString());
        int vnum6 = Integer.parseInt(num6.getText().toString());
        resultado.setText("El resultado es :" + (vnum5 / vnum6));

    }
}