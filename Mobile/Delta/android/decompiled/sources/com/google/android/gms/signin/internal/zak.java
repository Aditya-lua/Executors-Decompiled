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
    public final int f7547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectionResult f7548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zav f7549h;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f7547f = i10;
        this.f7548g = connectionResult;
        this.f7549h = zavVar;
    }

    public final ConnectionResult v3() {
        return this.f7548g;
    }

    public final zav w3() {
        return this.f7549h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7547f);
        b.t(parcel, 2, this.f7548g, i10, false);
        b.t(parcel, 3, this.f7549h, i10, false);
        b.b(parcel, iA);
    }
}
