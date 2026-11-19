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
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f7748a;
    public final ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f7749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f7750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final id.k f7752f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, id.k kVar, @NonNull Rect rect) {
        x2.g.d(rect.left);
        x2.g.d(rect.top);
        x2.g.d(rect.right);
        x2.g.d(rect.bottom);
        this.f7748a = rect;
        this.b = colorStateList2;
        this.f7749c = colorStateList;
        this.f7750d = colorStateList3;
        this.f7751e = i10;
        this.f7752f = kVar;
    }

    @NonNull
    public static b a(@NonNull Context context, int i10) {
        x2.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, jc.k.f20607p3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(jc.k.f20616q3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(jc.k.f20634s3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(jc.k.f20625r3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(jc.k.f20643t3, 0));
        ColorStateList colorStateListA = fd.c.a(context, typedArrayObtainStyledAttributes, jc.k.f20652u3);
        ColorStateList colorStateListA2 = fd.c.a(context, typedArrayObtainStyledAttributes, jc.k.f20695z3);
        ColorStateList colorStateListA3 = fd.c.a(context, typedArrayObtainStyledAttributes, jc.k.f20678x3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.f20686y3, 0);
        id.k kVarM = id.k.b(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20661v3, 0), typedArrayObtainStyledAttributes.getResourceId(jc.k.f20670w3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    public int b() {
        return this.f7748a.bottom;
    }

    public int c() {
        return this.f7748a.top;
    }

    public void d(@NonNull TextView textView) {
        e(textView, null, null);
    }

    public void e(@NonNull TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        id.g gVar = new id.g();
        id.g gVar2 = new id.g();
        gVar.setShapeAppearanceModel(this.f7752f);
        gVar2.setShapeAppearanceModel(this.f7752f);
        if (colorStateList == null) {
            colorStateList = this.f7749c;
        }
        gVar.a0(colorStateList);
        gVar.h0(this.f7751e, this.f7750d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7748a;
        o0.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
