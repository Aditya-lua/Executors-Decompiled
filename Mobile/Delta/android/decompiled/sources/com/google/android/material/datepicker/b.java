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
    public final a f7916a;

    @NonNull
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f7917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final a f7918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f7919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final a f7920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final a f7921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Paint f7922h;

    public b(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ed.b.d(context, ic.b.f20623z, e.class.getCanonicalName()), ic.k.f20829f3);
        this.f7916a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20865j3, 0));
        this.f7921g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20847h3, 0));
        this.b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20856i3, 0));
        this.f7917c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20874k3, 0));
        ColorStateList colorStateListA = ed.c.a(context, typedArrayObtainStyledAttributes, ic.k.f20883l3);
        this.f7918d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20901n3, 0));
        this.f7919e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20892m3, 0));
        this.f7920f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(ic.k.f20910o3, 0));
        Paint paint = new Paint();
        this.f7922h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
