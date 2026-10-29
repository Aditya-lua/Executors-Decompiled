package com.google.android.material.radiobutton;

import ad.C0143o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import md.C8485a;
import p066d3.C4426d;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p365q.C10403u;
import p463uc.C11840a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends C10403u {

    /* JADX INFO: renamed from: g */
    public static final int f10362g = C6746j.f26130v;

    /* JADX INFO: renamed from: h */
    public static final int[][] f10363h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f10364e;

    /* JADX INFO: renamed from: f */
    public boolean f10365f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25878T);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10364e == null) {
            int iM44228d = C11840a.m44228d(this, C6738b.f25897g);
            int iM44228d2 = C11840a.m44228d(this, C6738b.f25903j);
            int iM44228d3 = C11840a.m44228d(this, C6738b.f25908o);
            int[][] iArr = f10363h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C11840a.m44234j(iM44228d3, iM44228d, 1.0f);
            iArr2[1] = C11840a.m44234j(iM44228d3, iM44228d2, 0.54f);
            iArr2[2] = C11840a.m44234j(iM44228d3, iM44228d2, 0.38f);
            iArr2[3] = C11840a.m44234j(iM44228d3, iM44228d2, 0.38f);
            this.f10364e = new ColorStateList(iArr, iArr2);
        }
        return this.f10364e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10365f && C4426d.m22264b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f10365f = z10;
        if (z10) {
            C4426d.m22266d(this, getMaterialThemeColorsTintList());
        } else {
            C4426d.m22266d(this, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10362g;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26394c4, i10, i11, new int[0]);
        int i12 = C6747k.f26404d4;
        if (typedArrayM436i.hasValue(i12)) {
            C4426d.m22266d(this, C5050c.m23736a(context2, typedArrayM436i, i12));
        }
        this.f10365f = typedArrayM436i.getBoolean(C6747k.f26413e4, false);
        typedArrayM436i.recycle();
    }
}
