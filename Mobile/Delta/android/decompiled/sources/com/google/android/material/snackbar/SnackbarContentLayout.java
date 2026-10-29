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
import androidx.core.view.o0;
import bd.h;
import hc.b;
import hc.d;
import hc.f;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements id.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f8200a;
    public Button b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f8201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8202d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8201c = h.g(context, b.P, ic.a.b);
    }

    public static void d(@NonNull View view, int i10, int i11) {
        if (o0.T(view)) {
            o0.B0(view, o0.E(view), i10, o0.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    @Override // id.a
    public void a(int i10, int i11) {
        this.f8200a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f8200a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f8201c).setStartDelay(j11).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f8201c).setStartDelay(j11).start();
        }
    }

    @Override // id.a
    public void b(int i10, int i11) {
        this.f8200a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f8200a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f8201c).setStartDelay(j11).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f8201c).setStartDelay(j11).start();
        }
    }

    public void c(float f10) {
        if (f10 != 1.0f) {
            this.b.setTextColor(tc.a.j(tc.a.d(this, b.f18790o), this.b.getCurrentTextColor(), f10));
        }
    }

    public final boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f8200a.getPaddingTop() == i11 && this.f8200a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f8200a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.f8200a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8200a = (TextView) findViewById(f.M);
        this.b = (Button) findViewById(f.L);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f18820f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.f18818e);
        Layout layout = this.f8200a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f8202d <= 0 || this.b.getMeasuredWidth() <= this.f8202d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f8202d = i10;
    }
}
