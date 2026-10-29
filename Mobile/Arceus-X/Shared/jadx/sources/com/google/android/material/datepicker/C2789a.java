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
import androidx.core.view.C0625o0;
import p101ed.C5050c;
import p168hd.C6363g;
import p168hd.C6367k;
import p194ic.C6747k;
import p533x2.C12637g;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2789a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Rect f10040a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f10041b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f10042c;

    /* JADX INFO: renamed from: d */
    public final ColorStateList f10043d;

    /* JADX INFO: renamed from: e */
    public final int f10044e;

    /* JADX INFO: renamed from: f */
    public final C6367k f10045f;

    public C2789a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C6367k c6367k, @NonNull Rect rect) {
        C12637g.m47072d(rect.left);
        C12637g.m47072d(rect.top);
        C12637g.m47072d(rect.right);
        C12637g.m47072d(rect.bottom);
        this.f10040a = rect;
        this.f10041b = colorStateList2;
        this.f10042c = colorStateList;
        this.f10043d = colorStateList3;
        this.f10044e = i10;
        this.f10045f = c6367k;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C2789a m12610a(@NonNull Context context, int i10) {
        C12637g.m47070b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, C6747k.f26511p3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6747k.f26520q3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6747k.f26538s3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6747k.f26529r3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6747k.f26547t3, 0));
        ColorStateList colorStateListM23736a = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26556u3);
        ColorStateList colorStateListM23736a2 = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26601z3);
        ColorStateList colorStateListM23736a3 = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26583x3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26592y3, 0);
        C6367k c6367kM27806m = C6367k.m27763b(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26565v3, 0), typedArrayObtainStyledAttributes.getResourceId(C6747k.f26574w3, 0)).m27806m();
        typedArrayObtainStyledAttributes.recycle();
        return new C2789a(colorStateListM23736a, colorStateListM23736a2, colorStateListM23736a3, dimensionPixelSize, c6367kM27806m, rect);
    }

    /* JADX INFO: renamed from: b */
    public int m12611b() {
        return this.f10040a.bottom;
    }

    /* JADX INFO: renamed from: c */
    public int m12612c() {
        return this.f10040a.top;
    }

    /* JADX INFO: renamed from: d */
    public void m12613d(@NonNull TextView textView) {
        m12614e(textView, null, null);
    }

    /* JADX INFO: renamed from: e */
    public void m12614e(@NonNull TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C6363g c6363g = new C6363g();
        C6363g c6363g2 = new C6363g();
        c6363g.setShapeAppearanceModel(this.f10045f);
        c6363g2.setShapeAppearanceModel(this.f10045f);
        if (colorStateList == null) {
            colorStateList = this.f10042c;
        }
        c6363g.m27719a0(colorStateList);
        c6363g.m27729h0(this.f10044e, this.f10043d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f10041b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f10041b.withAlpha(30), c6363g, c6363g2);
        Rect rect = this.f10040a;
        C0625o0.m3048q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
