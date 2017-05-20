package com.example.android.justjava;

import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int cupCoffe = 0;

    public void increment(View view) {
        cupCoffe++;
        sumCoffe(cupCoffe);
    }

    public void decrement(View view) {
        cupCoffe--;
        sumCoffe(cupCoffe);
    }

    private void sumCoffe(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.sum);
        quantityTextView.setText("" + number);
    }
    /**
     * Methos dip[anggil saat tombol price ditekan
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void submitPrice(View view) {
        displayPrice(cupCoffe*5);
    }
    /**
     * This method displays the given price on the screen.
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.harga_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String order = "Terima Kasih sudah membeli";
        display(order);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(String text) {
        TextView orderTextView = (TextView) findViewById(R.id.order);
        orderTextView.setText(text);
    }
}
