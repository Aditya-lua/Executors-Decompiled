package com.google.android.material.divider;

import ad.C0143o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import md.C8485a;
import p101ed.C5050c;
import p168hd.C6363g;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6746j;
import p194ic.C6747k;
import p261l2.C7975b;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f */
    public static final int f10169f = C6746j.f26134z;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final C6363g f10170a;

    /* JADX INFO: renamed from: b */
    public int f10171b;

    /* JADX INFO: renamed from: c */
    public int f10172c;

    /* JADX INFO: renamed from: d */
    public int f10173d;

    /* JADX INFO: renamed from: e */
    public int f10174e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25861C);
    }

    public int getDividerColor() {
        return this.f10172c;
    }

    public int getDividerInsetEnd() {
        return this.f10174e;
    }

    public int getDividerInsetStart() {
        return this.f10173d;
    }

    public int getDividerThickness() {
        return this.f10171b;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = C0625o0.m3065z(this) == 1;
        int i11 = z10 ? this.f10174e : this.f10173d;
        if (z10) {
            width = getWidth();
            i10 = this.f10173d;
        } else {
            width = getWidth();
            i10 = this.f10174e;
        }
        this.f10170a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f10170a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f10171b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f10172c != i10) {
            this.f10172c = i10;
            this.f10170a.m27719a0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(C7975b.m33005c(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f10174e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f10173d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f10171b != i10) {
            this.f10171b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10169f;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f10170a = new C6363g();
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26346X3, i10, i11, new int[0]);
        this.f10171b = typedArrayM436i.getDimensionPixelSize(C6747k.f26384b4, getResources().getDimensionPixelSize(C6740d.f25993z));
        this.f10173d = typedArrayM436i.getDimensionPixelOffset(C6747k.f26374a4, 0);
        this.f10174e = typedArrayM436i.getDimensionPixelOffset(C6747k.f26364Z3, 0);
        setDividerColor(C5050c.m23736a(context2, typedArrayM436i, C6747k.f26355Y3).getDefaultColor());
        typedArrayM436i.recycle();
    }
}
