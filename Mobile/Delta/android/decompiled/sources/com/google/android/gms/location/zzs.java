package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.z;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7473j;

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
        return this.f7469f == zzsVar.f7469f && this.f7470g == zzsVar.f7470g && Float.compare(this.f7471h, zzsVar.f7471h) == 0 && this.f7472i == zzsVar.f7472i && this.f7473j == zzsVar.f7473j;
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f7469f), Long.valueOf(this.f7470g), Float.valueOf(this.f7471h), Long.valueOf(this.f7472i), Integer.valueOf(this.f7473j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f7469f);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f7470g);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f7471h);
        long j10 = this.f7472i;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f7473j != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f7473j);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.c(parcel, 1, this.f7469f);
        b.r(parcel, 2, this.f7470g);
        b.k(parcel, 3, this.f7471h);
        b.r(parcel, 4, this.f7472i);
        b.n(parcel, 5, this.f7473j);
        b.b(parcel, iA);
    }

    public zzs(boolean z10, long j10, float f10, long j11, int i10) {
        this.f7469f = z10;
        this.f7470g = j10;
        this.f7471h = f10;
        this.f7472i = j11;
        this.f7473j = i10;
    }
}
