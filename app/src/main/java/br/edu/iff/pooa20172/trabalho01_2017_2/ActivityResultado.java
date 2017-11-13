package br.edu.iff.pooa20172.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();

        String nome = (String) intent.getSerializableExtra("nome");
        Float salBruto = (float) intent.getSerializableExtra("salarioBruto");
        Float inss = (float) intent.getSerializableExtra("inss");
        Float sindicato = (float) intent.getSerializableExtra("sindicato");
        Float salLiquido = (float) intent.getSerializableExtra("salarioLiquido");


        TextView tvNome = (TextView) findViewById(R.id.tvNome);
        tvNome.setText("Nome: "+ nome);

        TextView tvSalarioBruto = (TextView) findViewById(R.id.tvSalBruto);
        tvSalarioBruto.setText("Salário Bruto: "+ salBruto);

        TextView tvInss = (TextView) findViewById(R.id.tvInss);
        tvInss.setText("INSS: "+ inss);

        TextView tvSindicato = (TextView) findViewById(R.id.tvSindicato);
        tvSindicato.setText("Sindicato: "+ sindicato);

        TextView tvSalarioLiquido = (TextView) findViewById(R.id.tvSalLiquido);
        tvSalarioLiquido.setText("Salário Liquido: "+ salLiquido);

    }
}
