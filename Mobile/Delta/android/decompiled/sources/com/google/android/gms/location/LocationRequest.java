package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.t;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7453n;

    @Deprecated
    public LocationRequest() {
        this.f7445f = 102;
        this.f7446g = 3600000L;
        this.f7447h = 600000L;
        this.f7448i = false;
        this.f7449j = Long.MAX_VALUE;
        this.f7450k = Integer.MAX_VALUE;
        this.f7451l = 0.0f;
        this.f7452m = 0L;
        this.f7453n = false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f7445f == locationRequest.f7445f && this.f7446g == locationRequest.f7446g && this.f7447h == locationRequest.f7447h && this.f7448i == locationRequest.f7448i && this.f7449j == locationRequest.f7449j && this.f7450k == locationRequest.f7450k && this.f7451l == locationRequest.f7451l && v3() == locationRequest.v3() && this.f7453n == locationRequest.f7453n) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f7445f), Long.valueOf(this.f7446g), Float.valueOf(this.f7451l), Long.valueOf(this.f7452m));
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i10 = this.f7445f;
        if (i10 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i10 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i10 != 104) {
            str = i10 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb2.append(str);
        if (this.f7445f != 105) {
            sb2.append(" requested=");
            sb2.append(this.f7446g);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f7447h);
        sb2.append("ms");
        if (this.f7452m > this.f7446g) {
            sb2.append(" maxWait=");
            sb2.append(this.f7452m);
            sb2.append("ms");
        }
        if (this.f7451l > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f7451l);
            sb2.append("m");
        }
        long j10 = this.f7449j;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f7450k != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f7450k);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long v3() {
        long j10 = this.f7452m;
        long j11 = this.f7446g;
        return j10 < j11 ? j11 : j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7445f);
        b.r(parcel, 2, this.f7446g);
        b.r(parcel, 3, this.f7447h);
        b.c(parcel, 4, this.f7448i);
        b.r(parcel, 5, this.f7449j);
        b.n(parcel, 6, this.f7450k);
        b.k(parcel, 7, this.f7451l);
        b.r(parcel, 8, this.f7452m);
        b.c(parcel, 9, this.f7453n);
        b.b(parcel, iA);
    }

    public LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f10, long j13, boolean z11) {
        this.f7445f = i10;
        this.f7446g = j10;
        this.f7447h = j11;
        this.f7448i = z10;
        this.f7449j = j12;
        this.f7450k = i11;
        this.f7451l = f10;
        this.f7452m = j13;
        this.f7453n = z11;
    }
}
