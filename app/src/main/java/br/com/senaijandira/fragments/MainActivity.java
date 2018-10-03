package br.com.senaijandira.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import br.com.senaijandira.fragments.fragments.Fragment1;
import br.com.senaijandira.fragments.fragments.Fragment2;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    TabLayout tab_menu;

    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();


//        Codigo para Tab menu
        tab_menu= findViewById(R.id.tab_menu);

        tab_menu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            Quando seleciona
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    openFragment1(null);

                }

                if(tab.getPosition() == 1){
                    openFragment2(null);

                }

            }

//            Quando deseleciona
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

//            Seleciona novamente
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

//        Fim do codigo de tab layout


//        Codigo bottom nav

        bottom_nav = findViewById(R.id.menu_buttom_nav);

//        Detectar uma ação

        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.menu_frag1){
                    openFragment1(null);
                    return true;
                }

                if(item.getItemId() == R.id.menu_frag2){
                    openFragment2(null);
                    return true;
                }
                return false;
            }
        });

    }


//    codigo para a tela
    public void openFragment1(View view) {

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment1());

        ft.commit();
    }

    public void openFragment2(View view) {

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment2());

        ft.commit();
    }

//    Fim do codigo
}
