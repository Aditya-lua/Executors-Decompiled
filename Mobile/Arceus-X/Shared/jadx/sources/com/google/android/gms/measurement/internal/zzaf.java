package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p306nb.C9086g;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C9086g();

    /* JADX INFO: renamed from: f */
    public final long f9486f;

    /* JADX INFO: renamed from: g */
    public final int f9487g;

    /* JADX INFO: renamed from: h */
    public final long f9488h;

    public zzaf(long j10, int i10, long j11) {
        this.f9486f = j10;
        this.f9487g = i10;
        this.f9488h = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f9486f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38474r(parcel, 1, j10);
        C9718b.m38470n(parcel, 2, this.f9487g);
        C9718b.m38474r(parcel, 3, this.f9488h);
        C9718b.m38458b(parcel, iM38457a);
    }
}
