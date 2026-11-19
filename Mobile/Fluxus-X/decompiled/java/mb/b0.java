package mb;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p9.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23103j;

    public b0() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f23099f == b0Var.f23099f && this.f23100g == b0Var.f23100g && Float.compare(this.f23101h, b0Var.f23101h) == 0 && this.f23102i == b0Var.f23102i && this.f23103j == b0Var.f23103j;
    }

    public final int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f23099f), Long.valueOf(this.f23100g), Float.valueOf(this.f23101h), Long.valueOf(this.f23102i), Integer.valueOf(this.f23103j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f23099f);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f23100g);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f23101h);
        long j10 = this.f23102i;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f23103j != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f23103j);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, this.f23099f);
        p9.c.r(parcel, 2, this.f23100g);
        p9.c.k(parcel, 3, this.f23101h);
        p9.c.r(parcel, 4, this.f23102i);
        p9.c.n(parcel, 5, this.f23103j);
        p9.c.b(parcel, iA);
    }

    public b0(boolean z10, long j10, float f10, long j11, int i10) {
        this.f23099f = z10;
        this.f23100g = j10;
        this.f23101h = f10;
        this.f23102i = j11;
        this.f23103j = i10;
    }
}
