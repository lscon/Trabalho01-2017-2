package br.edu.iff.pooa20172.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityPrincipal extends AppCompatActivity {

    private EditText nome;
    private EditText valorHora;
    private EditText horasTrabalhadas;
    private Button calular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        nome = (EditText) findViewById(R.id.etNome);
        valorHora = (EditText) findViewById(R.id.etValorHora);
        horasTrabalhadas = (EditText) findViewById(R.id.edHorasTrabalhadas);
        calular = (Button) findViewById(R.id.btCalcular);

        calular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double fValorHora = Double.parseDouble(valorHora.getText().toString());
                double fHorasTrabalhadas = Double.parseDouble(horasTrabalhadas.getText().toString());
                double salarioBruto;
                double salarioLiquido, ir, inss, sindicato;

                salarioBruto = fValorHora * fHorasTrabalhadas;

                ir = salarioBruto * 0.11;
                inss = salarioBruto * 0.08;
                sindicato = salarioBruto * 0.05;

                salarioLiquido = salarioBruto - (ir + inss + sindicato);

                Intent intent = new Intent(ActivityPrincipal.this, ActivityResultado.class);
                intent.putExtra("nome", nome.getText().toString());
                intent.putExtra("salarioBruto", salarioBruto);
                intent.putExtra("inss", inss);
                intent.putExtra("sindicato", sindicato);
                intent.putExtra("salarioLiquido", salarioLiquido);
                startActivity(intent);
            }
        });


    }
}
