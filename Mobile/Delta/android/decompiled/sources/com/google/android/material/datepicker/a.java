package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f7837a;
    public final ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f7838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f7839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gd.k f7841f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, gd.k kVar, @NonNull Rect rect) {
        x2.g.d(rect.left);
        x2.g.d(rect.top);
        x2.g.d(rect.right);
        x2.g.d(rect.bottom);
        this.f7837a = rect;
        this.b = colorStateList2;
        this.f7838c = colorStateList;
        this.f7839d = colorStateList3;
        this.f7840e = i10;
        this.f7841f = kVar;
    }

    @NonNull
    public static a a(@NonNull Context context, int i10) {
        x2.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, hc.k.f19097p3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(hc.k.f19106q3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(hc.k.f19124s3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(hc.k.f19115r3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(hc.k.f19133t3, 0));
        ColorStateList colorStateListA = dd.c.a(context, typedArrayObtainStyledAttributes, hc.k.f19142u3);
        ColorStateList colorStateListA2 = dd.c.a(context, typedArrayObtainStyledAttributes, hc.k.f19185z3);
        ColorStateList colorStateListA3 = dd.c.a(context, typedArrayObtainStyledAttributes, hc.k.f19167x3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.f19176y3, 0);
        gd.k kVarM = gd.k.b(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19151v3, 0), typedArrayObtainStyledAttributes.getResourceId(hc.k.f19159w3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    public int b() {
        return this.f7837a.bottom;
    }

    public int c() {
        return this.f7837a.top;
    }

    public void d(@NonNull TextView textView) {
        e(textView, null, null);
    }

    public void e(@NonNull TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        gd.g gVar = new gd.g();
        gd.g gVar2 = new gd.g();
        gVar.setShapeAppearanceModel(this.f7841f);
        gVar2.setShapeAppearanceModel(this.f7841f);
        if (colorStateList == null) {
            colorStateList = this.f7838c;
        }
        gVar.a0(colorStateList);
        gVar.h0(this.f7840e, this.f7839d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7837a;
        o0.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
