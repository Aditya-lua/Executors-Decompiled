package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8948k0;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C8948k0();

    /* JADX INFO: renamed from: f */
    public final int f7499f;

    /* JADX INFO: renamed from: g */
    public final IBinder f7500g;

    /* JADX INFO: renamed from: h */
    public final ConnectionResult f7501h;

    /* JADX INFO: renamed from: i */
    public final boolean f7502i;

    /* JADX INFO: renamed from: j */
    public final boolean f7503j;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f7499f = i10;
        this.f7500g = iBinder;
        this.f7501h = connectionResult;
        this.f7502i = z10;
        this.f7503j = z11;
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
        return this.f7501h.equals(zavVar.f7501h) && C8947k.m36026b(m9221w3(), zavVar.m9221w3());
    }

    /* JADX INFO: renamed from: v3 */
    public final ConnectionResult m9220v3() {
        return this.f7501h;
    }

    /* JADX INFO: renamed from: w3 */
    public final InterfaceC1903b m9221w3() {
        IBinder iBinder = this.f7500g;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1903b.a.m9219s2(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f7499f);
        C9718b.m38469m(parcel, 2, this.f7500g, false);
        C9718b.m38476t(parcel, 3, this.f7501h, i10, false);
        C9718b.m38459c(parcel, 4, this.f7502i);
        C9718b.m38459c(parcel, 5, this.f7503j);
        C9718b.m38458b(parcel, iM38457a);
    }
}
