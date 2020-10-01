package mx.edu.tesoem.isc.svj.pantallainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicarActivity extends AppCompatActivity {

    EditText num8,num9;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);


        num8 =findViewById(R.id.txtxnum8);
        num9 =findViewById(R.id.txtnum9);
        resultado = findViewById(R.id.lblresil);

    }

    public void pcmultiplicar(View v){
        int vnum8 =Integer.parseInt(num8.getText().toString());
        int vnum9 =Integer.parseInt(num9.getText().toString());
        resultado.setText("El resultado es :" + (vnum8 * vnum9));




    }
}