package com.example.ejemplo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView lblSaludar;
    private Button btnReset;
    private Button btnSaludar;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaVistas();

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("" == lblSaludar.getText()){
                    Toast.makeText(MainActivity.this, "Ya esta todo reseteado", Toast.LENGTH_SHORT).show();
                }else {
                    lblSaludar.setText("");
                }
            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().equals("")){
                    Toast.makeText(MainActivity.this, "Tienes que rellenar un nombre...", Toast.LENGTH_SHORT).show();
                }else {
                    lblSaludar.setText("Hola, "+txtNombre.getText()+" buenos dias");
                    txtNombre.setText("");
                }
            }
        });
    }

    private void inicializaVistas(){
        lblSaludar = findViewById(R.id.lblSaludarMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludaMain);
        txtNombre = findViewById(R.id.txtNombreMain);
    }
}