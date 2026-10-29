package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.C8117t;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C8117t();

    /* JADX INFO: renamed from: f */
    public int f9448f;

    /* JADX INFO: renamed from: g */
    public long f9449g;

    /* JADX INFO: renamed from: h */
    public long f9450h;

    /* JADX INFO: renamed from: i */
    public boolean f9451i;

    /* JADX INFO: renamed from: j */
    public long f9452j;

    /* JADX INFO: renamed from: k */
    public int f9453k;

    /* JADX INFO: renamed from: l */
    public float f9454l;

    /* JADX INFO: renamed from: m */
    public long f9455m;

    /* JADX INFO: renamed from: n */
    public boolean f9456n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public LocationRequest() {
        this.f9448f = 102;
        this.f9449g = 3600000L;
        this.f9450h = 600000L;
        this.f9451i = false;
        this.f9452j = Long.MAX_VALUE;
        this.f9453k = Integer.MAX_VALUE;
        this.f9454l = 0.0f;
        this.f9455m = 0L;
        this.f9456n = false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f9448f == locationRequest.f9448f && this.f9449g == locationRequest.f9449g && this.f9450h == locationRequest.f9450h && this.f9451i == locationRequest.f9451i && this.f9452j == locationRequest.f9452j && this.f9453k == locationRequest.f9453k && this.f9454l == locationRequest.f9454l && m11865v3() == locationRequest.m11865v3() && this.f9456n == locationRequest.f9456n) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f9448f), Long.valueOf(this.f9449g), Float.valueOf(this.f9454l), Long.valueOf(this.f9455m));
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i10 = this.f9448f;
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
        if (this.f9448f != 105) {
            sb2.append(" requested=");
            sb2.append(this.f9449g);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f9450h);
        sb2.append("ms");
        if (this.f9455m > this.f9449g) {
            sb2.append(" maxWait=");
            sb2.append(this.f9455m);
            sb2.append("ms");
        }
        if (this.f9454l > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f9454l);
            sb2.append("m");
        }
        long j10 = this.f9452j;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f9453k != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f9453k);
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public long m11865v3() {
        long j10 = this.f9455m;
        long j11 = this.f9449g;
        return j10 < j11 ? j11 : j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f9448f);
        C9718b.m38474r(parcel, 2, this.f9449g);
        C9718b.m38474r(parcel, 3, this.f9450h);
        C9718b.m38459c(parcel, 4, this.f9451i);
        C9718b.m38474r(parcel, 5, this.f9452j);
        C9718b.m38470n(parcel, 6, this.f9453k);
        C9718b.m38467k(parcel, 7, this.f9454l);
        C9718b.m38474r(parcel, 8, this.f9455m);
        C9718b.m38459c(parcel, 9, this.f9456n);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f10, long j13, boolean z11) {
        this.f9448f = i10;
        this.f9449g = j10;
        this.f9450h = j11;
        this.f9451i = z10;
        this.f9452j = j12;
        this.f9453k = i11;
        this.f9454l = f10;
        this.f9455m = j13;
        this.f9456n = z11;
    }
}
