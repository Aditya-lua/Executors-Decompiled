package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a */
    public boolean f2040a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Guideline(Context context) {
        super(context);
        this.f2040a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f2040a = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) getLayoutParams();
        if (this.f2040a && c0513b.f1982a == i10) {
            return;
        }
        c0513b.f1982a = i10;
        setLayoutParams(c0513b);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) getLayoutParams();
        if (this.f2040a && c0513b.f1984b == i10) {
            return;
        }
        c0513b.f1984b = i10;
        setLayoutParams(c0513b);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) getLayoutParams();
        if (this.f2040a && c0513b.f1986c == f10) {
            return;
        }
        c0513b.f1986c = f10;
        setLayoutParams(c0513b);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2040a = true;
        super.setVisibility(8);
    }
}
