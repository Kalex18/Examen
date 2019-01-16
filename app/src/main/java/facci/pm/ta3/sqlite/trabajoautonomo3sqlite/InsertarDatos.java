package facci.pm.ta3.sqlite.trabajoautonomo3sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import facci.pm.ta3.sqlite.trabajoautonomo3sqlite.adapter.ShoppingItemAdapter;
import facci.pm.ta3.sqlite.trabajoautonomo3sqlite.database.entities.ShoppingItemDB;
import facci.pm.ta3.sqlite.trabajoautonomo3sqlite.database.model.ShoppingItem;

public class InsertarDatos extends AppCompatActivity   {
    private ShoppingItemDB shoppingItemDB;
    private ShoppingItemAdapter shoppingItemAdapter;
    private ArrayList<ShoppingItem> shoppingItems = new ArrayList<>();
        Button insertar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        insertar=(Button)findViewById(R.id.btnEnviarDatos);
    insertar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            insertProducts();
        }
    });

    }

    private void insertProducts() {
        shoppingItemDB.insertElement("Tomatoes");
        shoppingItemDB.insertElement("Water");
        shoppingItemDB.insertElement("Apples");
        shoppingItemDB.insertElement("Soup");
        shoppingItemDB.insertElement("Coffee");
        shoppingItemDB.insertElement("Bread");
        shoppingItemDB.insertElement("Juice");
        shoppingItemDB.insertElement("Pizza");
        shoppingItemDB.insertElement("Mozzarella");
        shoppingItemDB.insertElement("Onion");
        shoppingItemDB.insertElement("Milk");
        shoppingItemDB.insertElement("Eggs");
        shoppingItemDB.insertElement("Bananas");
        shoppingItemDB.insertElement("Toilet rolls");
        shoppingItemDB.insertElement("Butter");
        shoppingItemDB.insertElement("Carrots");

    }


}

