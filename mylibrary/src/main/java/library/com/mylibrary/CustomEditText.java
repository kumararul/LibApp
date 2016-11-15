package library.com.mylibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;


/**
 * Created by tech on 1/29/2016.
 */
public class CustomEditText extends EditText {
    public CustomEditText(Context context,String file) {
        super(context);
        setFont(file);
    }

    public CustomEditText(Context context, AttributeSet attrs,String file) {
        super(context, attrs);
        setFont(file);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyle,String file) {
        super(context, attrs, defStyle);
        setFont(file);
    }

    private void setFont(String file) {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), file);
        setTypeface(font, Typeface.NORMAL);
    }
}
