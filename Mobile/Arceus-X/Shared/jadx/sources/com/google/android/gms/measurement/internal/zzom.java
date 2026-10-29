package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p306nb.C9324ud;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new C9324ud();

    /* JADX INFO: renamed from: f */
    public final long f9509f;

    /* JADX INFO: renamed from: g */
    public byte[] f9510g;

    /* JADX INFO: renamed from: h */
    public final String f9511h;

    /* JADX INFO: renamed from: i */
    public final Bundle f9512i;

    /* JADX INFO: renamed from: j */
    public final int f9513j;

    /* JADX INFO: renamed from: k */
    public final long f9514k;

    /* JADX INFO: renamed from: l */
    public String f9515l;

    public zzom(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f9509f = j10;
        this.f9510g = bArr;
        this.f9511h = str;
        this.f9512i = bundle;
        this.f9513j = i10;
        this.f9514k = j11;
        this.f9515l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f9509f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38474r(parcel, 1, j10);
        C9718b.m38463g(parcel, 2, this.f9510g, false);
        C9718b.m38478v(parcel, 3, this.f9511h, false);
        C9718b.m38462f(parcel, 4, this.f9512i, false);
        C9718b.m38470n(parcel, 5, this.f9513j);
        C9718b.m38474r(parcel, 6, this.f9514k);
        C9718b.m38478v(parcel, 7, this.f9515l, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
