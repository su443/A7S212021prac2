package mx.edu.tesoem.isc.svj.pantallainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CuadradoActivity extends AppCompatActivity {

    EditText num11;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        num11 =findViewById(R.id.txtnum11);
        resultado = findViewById(R.id.lblreesu);
    }

    public void pcalcular(View v){
        int vnum11 =Integer.parseInt(num11.getText().toString());
        resultado.setText("El resultado es :" + (vnum11 * vnum11));


    }
}