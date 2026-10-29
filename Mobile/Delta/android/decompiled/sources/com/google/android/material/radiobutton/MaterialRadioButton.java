package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import d3.d;
import dd.c;
import hc.b;
import hc.j;
import hc.k;
import q.u;
import tc.a;
import zc.o;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f8070g = j.f18951v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f8071h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f8072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8073f;

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.T);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8072e == null) {
            int iD = a.d(this, b.f18779g);
            int iD2 = a.d(this, b.f18785j);
            int iD3 = a.d(this, b.f18790o);
            int[][] iArr = f8071h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = a.j(iD3, iD, 1.0f);
            iArr2[1] = a.j(iD3, iD2, 0.54f);
            iArr2[2] = a.j(iD3, iD2, 0.38f);
            iArr2[3] = a.j(iD3, iD2, 0.38f);
            this.f8072e = new ColorStateList(iArr, iArr2);
        }
        return this.f8072e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8073f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f8073f = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f8070g;
        super(ld.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = o.i(context2, attributeSet, k.f18980c4, i10, i11, new int[0]);
        int i12 = k.f18990d4;
        if (typedArrayI.hasValue(i12)) {
            d.d(this, c.a(context2, typedArrayI, i12));
        }
        this.f8073f = typedArrayI.getBoolean(k.f18999e4, false);
        typedArrayI.recycle();
    }
}
