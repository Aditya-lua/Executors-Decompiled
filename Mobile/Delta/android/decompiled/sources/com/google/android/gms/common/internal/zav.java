package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.k0;

/* JADX INFO: loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new k0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f5811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConnectionResult f5812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5814j;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f5810f = i10;
        this.f5811g = iBinder;
        this.f5812h = connectionResult;
        this.f5813i = z10;
        this.f5814j = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f5812h.equals(zavVar.f5812h) && k.b(w3(), zavVar.w3());
    }

    public final ConnectionResult v3() {
        return this.f5812h;
    }

    public final b w3() {
        IBinder iBinder = this.f5811g;
        if (iBinder == null) {
            return null;
        }
        return b.a.s2(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, this.f5810f);
        o9.b.m(parcel, 2, this.f5811g, false);
        o9.b.t(parcel, 3, this.f5812h, i10, false);
        o9.b.c(parcel, 4, this.f5813i);
        o9.b.c(parcel, 5, this.f5814j);
        o9.b.b(parcel, iA);
    }
}
