package com.example.cammovilresponsive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView campo;
    TextView operacion;
    float numero1  = 0;
    float numero2 = 0;
    String signo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo = findViewById(R.id.Resultado);
        operacion = findViewById(R.id.Operacion);
    }

    public void n0(View v){
        campo.setText(campo.getText().toString() + "0");
        operacion.setText(operacion.getText().toString() + "0");
    }

    public void n1(View v){
        campo.setText(campo.getText().toString() + "1");
        operacion.setText(operacion.getText().toString() + "1");
    }

    public void n2(View v){
        campo.setText(campo.getText().toString() + "2");
        operacion.setText(operacion.getText().toString() + "2");
    }

    public void n3(View v){
        campo.setText(campo.getText().toString() + "3");
        operacion.setText(operacion.getText().toString() + "3");
    }

    public void n4(View v){
        campo.setText(campo.getText().toString() + "4");
        operacion.setText(operacion.getText().toString() + "4");
    }

    public void n5(View v){
        campo.setText(campo.getText().toString() + "5");
        operacion.setText(operacion.getText().toString() + "5");
    }

    public void n6(View v){
        campo.setText(campo.getText().toString() + "6");
        operacion.setText(operacion.getText().toString() + "6");
    }

    public void n7(View v){
        campo.setText(campo.getText().toString() + "7");
        operacion.setText(operacion.getText().toString() + "7");
    }

    public void n8(View v){
        campo.setText(campo.getText().toString() + "8");
        operacion.setText(operacion.getText().toString() + "8");
    }

    public void n9(View v){
        campo.setText(campo.getText().toString() + "9");
        operacion.setText(operacion.getText().toString() + "9");
    }

    public void suma(View v){
        numero1 = Float.parseFloat(campo.getText().toString());
        signo = "+";
        campo.setText("");

        operacion.setText(operacion.getText().toString() + "+");
    }

    public void dividir(View view) {
        numero1 = Float.parseFloat(campo.getText().toString());
        signo = "/";
        campo.setText("");

        operacion.setText(operacion.getText().toString() + "/");
    }

    public void multiplicar(View view) {
        numero1 = Float.parseFloat(campo.getText().toString());
        signo = "*";
        campo.setText("");

        operacion.setText(operacion.getText().toString() + "*");
    }

    public void resta(View view) {
        numero1 = Float.parseFloat(campo.getText().toString());
        signo = "-";
        campo.setText("");

        operacion.setText(operacion.getText().toString() + "-");
    }

    public void porcentaje(View view) {
        numero1 = Float.parseFloat(campo.getText().toString());
        signo = "%";
        float result = numero1/100;
        campo.setText(result + "");

        operacion.setText(operacion.getText().toString() + "%");
    }

    public void potencia(View view) {
        numero1 = Float.parseFloat(campo.getText().toString());
        signo = "^";
        campo.setText("");

        operacion.setText(operacion.getText().toString() + "^");
    }
    public void coma(View view) {

        campo.setText(campo.getText().toString() + ".");
    }

    public void BorrarUltimo(View v){
        campo.setText(campo.getText().toString().substring(0,(campo.getText().toString().length()-1)));
    }

    public void limpiar(View v){
        campo.setText("");
        operacion.setText("");
    }

    public void igualTested(View view){
        numero2 = Float.parseFloat(campo.getText().toString());

        if(signo.equals("/")){
            if(numero2 == 0.0f){
                campo.setText("0");
                Toast.makeText(this, "Operacion no valida", Toast.LENGTH_SHORT).show();
            }else{
                float result = numero1 / numero2;
                campo.setText(result + "");
            }
        }
        else if(signo.equals("+")){
            float result = numero1 + numero2;
            campo.setText(result + "");
        }
        else if(signo.equals("*")){
            float result = numero1 * numero2;
            campo.setText(result + "");
        }
        else if(signo.equals("-")){
            float result = numero1 - numero2;
            campo.setText(result + "");
        }
        else if(signo.equals("^")){
            double result = Math.pow(numero1, numero2);
            campo.setText(result+"");
        }
    }
}