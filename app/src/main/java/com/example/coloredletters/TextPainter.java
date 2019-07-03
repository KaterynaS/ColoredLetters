package com.example.coloredletters;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class TextPainter {

    String inputText;

    public void colorTheLetters(Context context, String inputString, TextView coloredTextView)
    {
        String textToColor = inputString.toUpperCase();
        SpannableStringBuilder builder = new SpannableStringBuilder();

        for (int i = 0; i < textToColor.length(); i++)
        {
            String toColor = textToColor.substring(i,i+1);
            SpannableString colorSpannable= new SpannableString(toColor);

            if(i==0 || i%6==0)
            {
                colorSpannable.setSpan(new
                                ForegroundColorSpan(context.getResources().getColor(R.color.magenta)),
                        0, colorSpannable.length(), 0);
            }

            else if(i==1 || (i+1)%6==0)
            {

                colorSpannable.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.purple)), 0, colorSpannable.length(), 0);
            }

            else if(i==2 || (i+2)%6==0)
            {
                colorSpannable.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.grass)), 0, colorSpannable.length(), 0);
            }

            else if(i==3 || (i+3)%6==0)
            {
                colorSpannable.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.blue)), 0, colorSpannable.length(), 0);
            }

            else if(i==4 || (i+4)%6==0)
            {
                colorSpannable.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.tree)), 0, colorSpannable.length(), 0);
            }

            else
            {
                colorSpannable.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.orange)), 0, colorSpannable.length(), 0);
            }

            builder.append(colorSpannable);
        }

        coloredTextView.setText(builder, TextView.BufferType.SPANNABLE);
    }


}
