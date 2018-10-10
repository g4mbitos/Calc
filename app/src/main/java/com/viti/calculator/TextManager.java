package com.viti.calculator;

import android.widget.TextView;

public class TextManager {

    public static void Add(TextView textView,char symbol)
    {
        if(textView.getText().length() == 0 && (symbol == '.' || symbol == '0'))
            return;
        if(textView.getText().toString().contains(".") && symbol == '.')
            return;
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
