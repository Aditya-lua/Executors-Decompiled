package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p213j9.C7094e0;
import p213j9.C7106k0;
import p213j9.C7112q;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C7094e0();

    /* JADX INFO: renamed from: f */
    public final boolean f7533f;

    /* JADX INFO: renamed from: g */
    public final String f7534g;

    /* JADX INFO: renamed from: h */
    public final int f7535h;

    /* JADX INFO: renamed from: i */
    public final int f7536i;

    /* JADX INFO: renamed from: j */
    public final long f7537j;

    public zzr(boolean z10, String str, int i10, int i11, long j10) {
        this.f7533f = z10;
        this.f7534g = str;
        this.f7535h = C7106k0.m29913a(i10) - 1;
        this.f7536i = C7112q.m29914a(i11) - 1;
        this.f7537j = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, this.f7533f);
        C9718b.m38478v(parcel, 2, this.f7534g, false);
        C9718b.m38470n(parcel, 3, this.f7535h);
        C9718b.m38470n(parcel, 4, this.f7536i);
        C9718b.m38474r(parcel, 5, this.f7537j);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final boolean zza() {
        return this.f7533f;
    }

    public final String zzb() {
        return this.f7534g;
    }

    public final long zzc() {
        return this.f7537j;
    }

    public final int zzd() {
        return C7106k0.m29913a(this.f7535h);
    }

    public final int zze() {
        return C7112q.m29914a(this.f7536i);
    }
}
