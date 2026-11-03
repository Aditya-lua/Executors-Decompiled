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
    public final Rect f7911a;
    public final ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f7912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f7913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hd.k f7915f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, hd.k kVar, @NonNull Rect rect) {
        x2.g.d(rect.left);
        x2.g.d(rect.top);
        x2.g.d(rect.right);
        x2.g.d(rect.bottom);
        this.f7911a = rect;
        this.b = colorStateList2;
        this.f7912c = colorStateList;
        this.f7913d = colorStateList3;
        this.f7914e = i10;
        this.f7915f = kVar;
    }

    @NonNull
    public static a a(@NonNull Context context, int i10) {
        x2.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, ic.k.f20919p3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ic.k.f20928q3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ic.k.f20946s3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ic.k.f20937r3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ic.k.f20955t3, 0));
        ColorStateList colorStateListA = ed.c.a(context, typedArrayObtainStyledAttributes, ic.k.f20964u3);
        ColorStateList colorStateListA2 = ed.c.a(context, typedArrayObtainStyledAttributes, ic.k.f21007z3);
        ColorStateList colorStateListA3 = ed.c.a(context, typedArrayObtainStyledAttributes, ic.k.f20989x3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.f20998y3, 0);
        hd.k kVarM = hd.k.b(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20973v3, 0), typedArrayObtainStyledAttributes.getResourceId(ic.k.f20981w3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    public int b() {
        return this.f7911a.bottom;
    }

    public int c() {
        return this.f7911a.top;
    }

    public void d(@NonNull TextView textView) {
        e(textView, null, null);
    }

    public void e(@NonNull TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        hd.g gVar = new hd.g();
        hd.g gVar2 = new hd.g();
        gVar.setShapeAppearanceModel(this.f7915f);
        gVar2.setShapeAppearanceModel(this.f7915f);
        if (colorStateList == null) {
            colorStateList = this.f7912c;
        }
        gVar.a0(colorStateList);
        gVar.h0(this.f7914e, this.f7913d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7911a;
        o0.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
