package library.com.mylibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;


/**
 * Created by tech on 1/29/2016.
 */
public class CustomButton extends Button {

    public CustomButton(Context context,String file) {
        super(context);
        setFont(file);
    }

    public CustomButton(Context context, AttributeSet attrs,String file) {
        super(context, attrs);
        setFont(file);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle,String file) {
        super(context, attrs, defStyle);
        setFont(file);
    }

    private void setFont(String file) {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),file);
        setTypeface(font, Typeface.NORMAL);
    }
}
