package com.viti.calculator;

import android.widget.TextView;

public class TextManager {

    public static void Add(TextView textView,char symbol)
    {
        if(textView.getText().toString().contains(".") && symbol == '.')
            return;

        if(symbol == '0' && !textView.getText().toString().contains(".")
                && textView.getText().length() != 0)
        {
            char c = textView.getText().toString().charAt(0);
            if(c == '0')
                return;
        }

        if(textView.getText().length() == 0 && symbol == '.')
        {
            textView.setText("0");
        }

        String text = textView.getText().toString();
        if (text.length() > 18)
            return;
        text += symbol;
        textView.setText(text);
    }

    public static void Delete(TextView textView,boolean all)
    {
        if(all)
        {
            textView.setText("");
            return;
        }
        String text = textView.getText().toString();
        if (text.length() == 0)
            return;
        text = text.substring(0,text.length()-1);
        textView.setText(text);
    }

}
