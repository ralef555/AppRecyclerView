//salvo!

package com.example.apprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> filmes = new ArrayList<Filme>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.criarFilmes();
        Adapter adapter = new Adapter(filmes);
        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);


        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(MainActivity.this, recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), filmes.get(position).getTitulo(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), filmes.get(position).getGenero(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        }));

    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem aranaha - De volta ao lar", "Aventura", "2017");
        this.filmes.add(filme);

        filme = new Filme("Mulher maravilha", "Fantasia", "2018");
        this.filmes.add(filme);

        filme = new Filme("Liga da Justi??a", "Aventura", "2017");
        this.filmes.add(filme);

        filme = new Filme("Capit??o Am??rica - Guerra Civil", "Aventura/Fic????o", "2018");
        this.filmes.add(filme);

        filme = new Filme("X-Men: F??nix Negra", "Fic????o", "2020");
        this.filmes.add(filme);

        filme = new Filme("Esquadr??o Suicida", "A????o", "2019");
        this.filmes.add(filme);

        filme = new Filme("Um amor para recordar", "Romance", "2005");
        this.filmes.add(filme);

        filme = new Filme("O Jardim Secreto", "Drama", "1997");
        this.filmes.add(filme);

        filme = new Filme("Mudan??a de H??bito", "Com??dia", "1994");
        this.filmes.add(filme);

    }

}