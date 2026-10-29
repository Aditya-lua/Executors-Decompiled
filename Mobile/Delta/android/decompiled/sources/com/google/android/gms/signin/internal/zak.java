package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import o9.b;
import qb.i;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectionResult f7474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zav f7475h;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f7473f = i10;
        this.f7474g = connectionResult;
        this.f7475h = zavVar;
    }

    public final ConnectionResult v3() {
        return this.f7474g;
    }

    public final zav w3() {
        return this.f7475h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7473f);
        b.t(parcel, 2, this.f7474g, i10, false);
        b.t(parcel, 3, this.f7475h, i10, false);
        b.b(parcel, iA);
    }
}
