package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.C8123z;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C8123z();

    /* JADX INFO: renamed from: f */
    public boolean f9473f;

    /* JADX INFO: renamed from: g */
    public long f9474g;

    /* JADX INFO: renamed from: h */
    public float f9475h;

    /* JADX INFO: renamed from: i */
    public long f9476i;

    /* JADX INFO: renamed from: j */
    public int f9477j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f9473f == zzsVar.f9473f && this.f9474g == zzsVar.f9474g && Float.compare(this.f9475h, zzsVar.f9475h) == 0 && this.f9476i == zzsVar.f9476i && this.f9477j == zzsVar.f9477j;
    }

    public final int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f9473f), Long.valueOf(this.f9474g), Float.valueOf(this.f9475h), Long.valueOf(this.f9476i), Integer.valueOf(this.f9477j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f9473f);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f9474g);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f9475h);
        long j10 = this.f9476i;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f9477j != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f9477j);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, this.f9473f);
        C9718b.m38474r(parcel, 2, this.f9474g);
        C9718b.m38467k(parcel, 3, this.f9475h);
        C9718b.m38474r(parcel, 4, this.f9476i);
        C9718b.m38470n(parcel, 5, this.f9477j);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zzs(boolean z10, long j10, float f10, long j11, int i10) {
        this.f9473f = z10;
        this.f9474g = j10;
        this.f9475h = f10;
        this.f9476i = j11;
        this.f9477j = i10;
    }
}
