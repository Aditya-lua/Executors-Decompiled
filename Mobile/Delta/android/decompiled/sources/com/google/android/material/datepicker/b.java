package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f7842a;

    @NonNull
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f7843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final a f7844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f7845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final a f7846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final a f7847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Paint f7848h;

    public b(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(dd.b.d(context, hc.b.f18801z, e.class.getCanonicalName()), hc.k.f19007f3);
        this.f7842a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19043j3, 0));
        this.f7847g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19025h3, 0));
        this.b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19034i3, 0));
        this.f7843c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19052k3, 0));
        ColorStateList colorStateListA = dd.c.a(context, typedArrayObtainStyledAttributes, hc.k.f19061l3);
        this.f7844d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19079n3, 0));
        this.f7845e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19070m3, 0));
        this.f7846f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(hc.k.f19088o3, 0));
        Paint paint = new Paint();
        this.f7848h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
