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
    public final String f5836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f5839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5842l;

    public zzp(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f5836f = str;
        this.f5837g = z10;
        this.f5838h = z11;
        this.f5839i = (Context) b.t2(a.AbstractBinderC0656a.s2(iBinder));
        this.f5840j = z12;
        this.f5841k = z13;
        this.f5842l = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, y9.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f5836f;
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, str, false);
        o9.b.c(parcel, 2, this.f5837g);
        o9.b.c(parcel, 3, this.f5838h);
        o9.b.m(parcel, 4, b.u2(this.f5839i), false);
        o9.b.c(parcel, 5, this.f5840j);
        o9.b.c(parcel, 6, this.f5841k);
        o9.b.c(parcel, 8, this.f5842l);
        o9.b.b(parcel, iA);
    }
}
