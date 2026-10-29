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
    public int f7371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7379n;

    @Deprecated
    public LocationRequest() {
        this.f7371f = 102;
        this.f7372g = 3600000L;
        this.f7373h = 600000L;
        this.f7374i = false;
        this.f7375j = Long.MAX_VALUE;
        this.f7376k = Integer.MAX_VALUE;
        this.f7377l = 0.0f;
        this.f7378m = 0L;
        this.f7379n = false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f7371f == locationRequest.f7371f && this.f7372g == locationRequest.f7372g && this.f7373h == locationRequest.f7373h && this.f7374i == locationRequest.f7374i && this.f7375j == locationRequest.f7375j && this.f7376k == locationRequest.f7376k && this.f7377l == locationRequest.f7377l && v3() == locationRequest.v3() && this.f7379n == locationRequest.f7379n) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f7371f), Long.valueOf(this.f7372g), Float.valueOf(this.f7377l), Long.valueOf(this.f7378m));
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i10 = this.f7371f;
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
        if (this.f7371f != 105) {
            sb2.append(" requested=");
            sb2.append(this.f7372g);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f7373h);
        sb2.append("ms");
        if (this.f7378m > this.f7372g) {
            sb2.append(" maxWait=");
            sb2.append(this.f7378m);
            sb2.append("ms");
        }
        if (this.f7377l > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f7377l);
            sb2.append("m");
        }
        long j10 = this.f7375j;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f7376k != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f7376k);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long v3() {
        long j10 = this.f7378m;
        long j11 = this.f7372g;
        return j10 < j11 ? j11 : j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7371f);
        b.r(parcel, 2, this.f7372g);
        b.r(parcel, 3, this.f7373h);
        b.c(parcel, 4, this.f7374i);
        b.r(parcel, 5, this.f7375j);
        b.n(parcel, 6, this.f7376k);
        b.k(parcel, 7, this.f7377l);
        b.r(parcel, 8, this.f7378m);
        b.c(parcel, 9, this.f7379n);
        b.b(parcel, iA);
    }

    public LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f10, long j13, boolean z11) {
        this.f7371f = i10;
        this.f7372g = j10;
        this.f7373h = j11;
        this.f7374i = z10;
        this.f7375j = j12;
        this.f7376k = i11;
        this.f7377l = f10;
        this.f7378m = j13;
        this.f7379n = z11;
    }
}
