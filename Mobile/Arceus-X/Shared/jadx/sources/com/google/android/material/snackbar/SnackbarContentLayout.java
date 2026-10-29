package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import cd.C1627h;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6742f;
import p216jc.C7137a;
import p217jd.InterfaceC7148a;
import p463uc.C11840a;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC7148a {

    /* JADX INFO: renamed from: a */
    public TextView f10519a;

    /* JADX INFO: renamed from: b */
    public Button f10520b;

    /* JADX INFO: renamed from: c */
    public final TimeInterpolator f10521c;

    /* JADX INFO: renamed from: d */
    public int f10522d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10521c = C1627h.m8224g(context, C6738b.f25874P, C7137a.f27785b);
    }

    /* JADX INFO: renamed from: d */
    public static void m13055d(@NonNull View view, int i10, int i11) {
        if (C0625o0.m3008T(view)) {
            C0625o0.m2981B0(view, C0625o0.m2986E(view), i10, C0625o0.m2984D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    @Override // p217jd.InterfaceC7148a
    /* JADX INFO: renamed from: a */
    public void mo13056a(int i10, int i11) {
        this.f10519a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f10519a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f10521c).setStartDelay(j11).start();
        if (this.f10520b.getVisibility() == 0) {
            this.f10520b.setAlpha(0.0f);
            this.f10520b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f10521c).setStartDelay(j11).start();
        }
    }

    @Override // p217jd.InterfaceC7148a
    /* JADX INFO: renamed from: b */
    public void mo13057b(int i10, int i11) {
        this.f10519a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f10519a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f10521c).setStartDelay(j11).start();
        if (this.f10520b.getVisibility() == 0) {
            this.f10520b.setAlpha(1.0f);
            this.f10520b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f10521c).setStartDelay(j11).start();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13058c(float f10) {
        if (f10 != 1.0f) {
            this.f10520b.setTextColor(C11840a.m44234j(C11840a.m44228d(this, C6738b.f25908o), this.f10520b.getCurrentTextColor(), f10));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13059e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f10519a.getPaddingTop() == i11 && this.f10519a.getPaddingBottom() == i12) {
            return z10;
        }
        m13055d(this.f10519a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f10520b;
    }

    public TextView getMessageView() {
        return this.f10519a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f10519a = (TextView) findViewById(C6742f.f26019M);
        this.f10520b = (Button) findViewById(C6742f.f26018L);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C6740d.f25966f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C6740d.f25964e);
        Layout layout = this.f10519a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f10522d <= 0 || this.f10520b.getMeasuredWidth() <= this.f10522d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m13059e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m13059e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f10522d = i10;
    }
}
