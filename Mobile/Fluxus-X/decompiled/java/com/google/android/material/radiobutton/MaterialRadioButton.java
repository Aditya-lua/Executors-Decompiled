package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import bd.o;
import d3.d;
import fd.c;
import jc.b;
import jc.j;
import jc.k;
import q.u;
import vc.a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7988g = j.f20461v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f7989h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f7990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7991f;

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.T);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7990e == null) {
            int iD = a.d(this, b.f20289g);
            int iD2 = a.d(this, b.f20295j);
            int iD3 = a.d(this, b.f20300o);
            int[][] iArr = f7989h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = a.j(iD3, iD, 1.0f);
            iArr2[1] = a.j(iD3, iD2, 0.54f);
            iArr2[2] = a.j(iD3, iD2, 0.38f);
            iArr2[3] = a.j(iD3, iD2, 0.38f);
            this.f7990e = new ColorStateList(iArr, iArr2);
        }
        return this.f7990e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7991f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7991f = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7988g;
        super(od.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = o.i(context2, attributeSet, k.f20490c4, i10, i11, new int[0]);
        if (typedArrayI.hasValue(k.f20500d4)) {
            d.d(this, c.a(context2, typedArrayI, k.f20500d4));
        }
        this.f7991f = typedArrayI.getBoolean(k.f20509e4, false);
        typedArrayI.recycle();
    }
}
