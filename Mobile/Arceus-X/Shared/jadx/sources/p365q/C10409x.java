package p365q;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import p181i.C6589a;

/* JADX INFO: renamed from: q.x */
/* JADX INFO: loaded from: classes.dex */
public class C10409x extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C10411y f37509a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10409x(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25016L);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f37509a.m40071h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f37509a.m40072i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f37509a.m40070g(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10409x(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C10406v0.m40056a(this, getContext());
        C10411y c10411y = new C10411y(this);
        this.f37509a = c10411y;
        c10411y.mo40027c(attributeSet, i10);
    }
}
