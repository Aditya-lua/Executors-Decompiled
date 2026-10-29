package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new C2096h2();

    /* JADX INFO: renamed from: f */
    public final long f8887f;

    /* JADX INFO: renamed from: g */
    public final long f8888g;

    /* JADX INFO: renamed from: h */
    public final boolean f8889h;

    /* JADX INFO: renamed from: i */
    public final Bundle f8890i;

    /* JADX INFO: renamed from: j */
    public final String f8891j;

    public zzdd(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f8887f = j10;
        this.f8888g = j11;
        this.f8889h = z10;
        this.f8890i = bundle;
        this.f8891j = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f8887f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38474r(parcel, 1, j10);
        C9718b.m38474r(parcel, 2, this.f8888g);
        C9718b.m38459c(parcel, 3, this.f8889h);
        C9718b.m38462f(parcel, 7, this.f8890i, false);
        C9718b.m38478v(parcel, 8, this.f8891j, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
