package idv.nack.myapplicationex;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by 202 on 2015/3/26.
 */
public class TEST extends View {
    private Paint paint = new Paint();
    private Rect rect = new Rect();
    public TEST(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(1f);
        int left = 100;
        int right = 100;
        int top = 400;
        int bottom = 400;
        rect.set(left , top, right , bottom);
        canvas.drawRect(rect, paint);



        }
    }
}
