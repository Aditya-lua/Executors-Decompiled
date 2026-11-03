package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j9.d0;
import y9.a;
import y9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f5912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5915l;

    public zzp(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f5909f = str;
        this.f5910g = z10;
        this.f5911h = z11;
        this.f5912i = (Context) b.t2(a.AbstractBinderC0671a.s2(iBinder));
        this.f5913j = z12;
        this.f5914k = z13;
        this.f5915l = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, y9.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f5909f;
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, str, false);
        o9.b.c(parcel, 2, this.f5910g);
        o9.b.c(parcel, 3, this.f5911h);
        o9.b.m(parcel, 4, b.u2(this.f5912i), false);
        o9.b.c(parcel, 5, this.f5913j);
        o9.b.c(parcel, 6, this.f5914k);
        o9.b.c(parcel, 8, this.f5915l);
        o9.b.b(parcel, iA);
    }
}
