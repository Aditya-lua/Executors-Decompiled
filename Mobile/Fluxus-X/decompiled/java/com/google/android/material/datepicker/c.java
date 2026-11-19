package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f7753a;

    @NonNull
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final b f7754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final b f7755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final b f7756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final b f7757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final b f7758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Paint f7759h;

    public c(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(fd.b.d(context, jc.b.f20311z, i.class.getCanonicalName()), jc.k.f20517f3);
        this.f7753a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20553j3, 0));
        this.f7758g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20535h3, 0));
        this.b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20544i3, 0));
        this.f7754c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20562k3, 0));
        ColorStateList colorStateListA = fd.c.a(context, typedArrayObtainStyledAttributes, jc.k.f20571l3);
        this.f7755d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20589n3, 0));
        this.f7756e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20580m3, 0));
        this.f7757f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(jc.k.f20598o3, 0));
        Paint paint = new Paint();
        this.f7759h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
