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
    public boolean f7395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7399j;

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
        return this.f7395f == zzsVar.f7395f && this.f7396g == zzsVar.f7396g && Float.compare(this.f7397h, zzsVar.f7397h) == 0 && this.f7398i == zzsVar.f7398i && this.f7399j == zzsVar.f7399j;
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f7395f), Long.valueOf(this.f7396g), Float.valueOf(this.f7397h), Long.valueOf(this.f7398i), Integer.valueOf(this.f7399j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f7395f);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f7396g);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f7397h);
        long j10 = this.f7398i;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f7399j != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f7399j);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.c(parcel, 1, this.f7395f);
        b.r(parcel, 2, this.f7396g);
        b.k(parcel, 3, this.f7397h);
        b.r(parcel, 4, this.f7398i);
        b.n(parcel, 5, this.f7399j);
        b.b(parcel, iA);
    }

    public zzs(boolean z10, long j10, float f10, long j11, int i10) {
        this.f7395f = z10;
        this.f7396g = j10;
        this.f7397h = f10;
        this.f7398i = j11;
        this.f7399j = i10;
    }
}
