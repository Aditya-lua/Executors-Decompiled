package q;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class x extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f29143a;

    public x(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.L);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29143a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29143a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f29143a.g(canvas);
    }

    public x(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0.a(this, getContext());
        y yVar = new y(this);
        this.f29143a = yVar;
        yVar.c(attributeSet, i10);
    }
}
