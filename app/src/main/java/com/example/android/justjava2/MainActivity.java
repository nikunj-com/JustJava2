package com.example.android.justjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {
    int iCoffee = 0, iUnitCoffeePrice = 10, iTotalCoffeePrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayMessage();
    }

    /**
     * Method to increment order qualtity
     */
    public void inc(View view){
         iCoffee++;
        display();
    }
    /**
     * method to decrement order quantity
     */
    public void dec(View view){
        iCoffee--;
        display();
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display() {
        TextView quantityTextView = (TextView) findViewById(R.id.qty_text);
        quantityTextView.setText("" + iCoffee);
        iTotalCoffeePrice = iCoffee * iUnitCoffeePrice;
        displayPrice();
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice() {
        TextView priceTextView = (TextView) findViewById(R.id.price_text);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(iTotalCoffeePrice));
    }

    private void displayMessage() {
        TextView priceTextView = (TextView) findViewById(R.id.price_text);
        priceTextView.setText("Order is placed! \nTotal Price: "+ NumberFormat.getCurrencyInstance().format(iTotalCoffeePrice)+"\nTHANK YOU!");
    }

}
