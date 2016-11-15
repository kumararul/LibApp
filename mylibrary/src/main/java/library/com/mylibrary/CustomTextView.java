package library.com.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by tech on 1/29/2016.
 */
public class CustomTextView extends TextView {
    public CustomTextView(Context context,String file) {
        super(context);
        setFont();
    }

    public CustomTextView(Context context, AttributeSet attrs,String file) {
        super(context, attrs);
        setFont ();

    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle,String file) {
        super(context, attrs, defStyle);
        setFont ();

    }

    private void setFont() {
        /*Typeface font = Typeface.createFromAsset(getContext().getAssets(), Constants.appFont);
        setTypeface(font, Typeface.NORMAL);*/
    }

}

