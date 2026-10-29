package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1585d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C1585d();

    /* JADX INFO: renamed from: f */
    public final long f7733f;

    public zzab(long j10) {
        this.f7733f = ((Long) C8953m.m36047l(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.f7733f == ((zzab) obj).f7733f;
    }

    public final int hashCode() {
        return C8947k.m36027c(Long.valueOf(this.f7733f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7733f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38474r(parcel, 1, j10);
        C9718b.m38458b(parcel, iM38457a);
    }
}
