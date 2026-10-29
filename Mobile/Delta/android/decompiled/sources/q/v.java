package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class v extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f29133a;

    public v(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.J);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f29133a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public v(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0.a(this, getContext());
        t tVar = new t(this);
        this.f29133a = tVar;
        tVar.c(attributeSet, i10);
    }
}
