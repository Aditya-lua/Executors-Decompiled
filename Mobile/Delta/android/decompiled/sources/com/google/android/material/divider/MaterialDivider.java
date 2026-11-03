package com.google.android.material.divider;

import ad.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import ed.c;
import hd.g;
import ic.b;
import ic.d;
import ic.j;
import ic.k;
import md.a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7998f = j.f20777z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final g f7999a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8002e;

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.C);
    }

    public int getDividerColor() {
        return this.f8000c;
    }

    public int getDividerInsetEnd() {
        return this.f8002e;
    }

    public int getDividerInsetStart() {
        return this.f8001d;
    }

    public int getDividerThickness() {
        return this.b;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = o0.z(this) == 1;
        int i11 = z10 ? this.f8002e : this.f8001d;
        if (z10) {
            width = getWidth();
            i10 = this.f8001d;
        } else {
            width = getWidth();
            i10 = this.f8002e;
        }
        this.f7999a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f7999a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f8000c != i10) {
            this.f8000c = i10;
            this.f7999a.a0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(l2.b.c(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f8002e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f8001d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.b != i10) {
            this.b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7998f;
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f7999a = new g();
        TypedArray typedArrayI = o.i(context2, attributeSet, k.X3, i10, i11, new int[0]);
        this.b = typedArrayI.getDimensionPixelSize(k.f20792b4, getResources().getDimensionPixelSize(d.f20669z));
        this.f8001d = typedArrayI.getDimensionPixelOffset(k.f20783a4, 0);
        this.f8002e = typedArrayI.getDimensionPixelOffset(k.Z3, 0);
        setDividerColor(c.a(context2, typedArrayI, k.Y3).getDefaultColor());
        typedArrayI.recycle();
    }
}
