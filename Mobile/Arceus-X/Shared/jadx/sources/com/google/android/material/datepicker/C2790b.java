package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import p101ed.C5049b;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6747k;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2790b {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final C2789a f10046a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C2789a f10047b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C2789a f10048c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C2789a f10049d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C2789a f10050e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C2789a f10051f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C2789a f10052g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Paint f10053h;

    public C2790b(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C5049b.m23733d(context, C6738b.f25919z, C2793e.class.getCanonicalName()), C6747k.f26421f3);
        this.f10046a = C2789a.m12610a(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26457j3, 0));
        this.f10052g = C2789a.m12610a(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26439h3, 0));
        this.f10047b = C2789a.m12610a(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26448i3, 0));
        this.f10048c = C2789a.m12610a(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26466k3, 0));
        ColorStateList colorStateListM23736a = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26475l3);
        this.f10049d = C2789a.m12610a(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26493n3, 0));
        this.f10050e = C2789a.m12610a(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26484m3, 0));
        this.f10051f = C2789a.m12610a(context, typedArrayObtainStyledAttributes.getResourceId(C6747k.f26502o3, 0));
        Paint paint = new Paint();
        this.f10053h = paint;
        paint.setColor(colorStateListM23736a.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
