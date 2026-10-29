package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p325o9.C9718b;
import p376qb.C10494i;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C10494i();

    /* JADX INFO: renamed from: f */
    public final int f9563f;

    /* JADX INFO: renamed from: g */
    public final ConnectionResult f9564g;

    /* JADX INFO: renamed from: h */
    public final zav f9565h;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f9563f = i10;
        this.f9564g = connectionResult;
        this.f9565h = zavVar;
    }

    /* JADX INFO: renamed from: v3 */
    public final ConnectionResult m11885v3() {
        return this.f9564g;
    }

    /* JADX INFO: renamed from: w3 */
    public final zav m11886w3() {
        return this.f9565h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f9563f);
        C9718b.m38476t(parcel, 2, this.f9564g, i10, false);
        C9718b.m38476t(parcel, 3, this.f9565h, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
