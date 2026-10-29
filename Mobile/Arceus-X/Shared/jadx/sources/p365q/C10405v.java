package p365q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import p181i.C6589a;

/* JADX INFO: renamed from: q.v */
/* JADX INFO: loaded from: classes.dex */
public class C10405v extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final C10401t f37498a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10405v(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25014J);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapM40026b = this.f37498a.m40026b();
        if (bitmapM40026b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM40026b.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10405v(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C10406v0.m40056a(this, getContext());
        C10401t c10401t = new C10401t(this);
        this.f37498a = c10401t;
        c10401t.mo40027c(attributeSet, i10);
    }
}
