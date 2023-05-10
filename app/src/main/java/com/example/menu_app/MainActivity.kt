package com.example.menu_app

/*
    Para criar menus nos nossos apps utilizamos a nossa pasta de recursos, la criamos
    a pasta de menu onde teremos nosso arquivo que contera os items do nosso menu.

    Quando criamos o menu tambem criamos strings como valores padroes igual fazemos com as cores.
*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
//import android.view.MenuInflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Java
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater()
        inflater.inflate(R.menu.my_menu, menu)
        return true
    }*/

    // kotlin
    // sobrescrevendo funcao onCreateOptionsMenu e retornando true para aparecer o menu em tela
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return true
    }
}