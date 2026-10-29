package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p306nb.C9260qd;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new C9260qd();

    /* JADX INFO: renamed from: f */
    public final String f9506f;

    /* JADX INFO: renamed from: g */
    public final long f9507g;

    /* JADX INFO: renamed from: h */
    public final int f9508h;

    public zzoh(String str, long j10, int i10) {
        this.f9506f = str;
        this.f9507g = j10;
        this.f9508h = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9506f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38474r(parcel, 2, this.f9507g);
        C9718b.m38470n(parcel, 3, this.f9508h);
        C9718b.m38458b(parcel, iM38457a);
    }
}
