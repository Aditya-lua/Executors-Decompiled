package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends p9.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12047f;

    public h0(long j10) {
        this.f12047f = ((Long) o9.s.l(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h0) && this.f12047f == ((h0) obj).f12047f;
    }

    public final int hashCode() {
        return o9.q.c(Long.valueOf(this.f12047f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f12047f;
        int iA = p9.c.a(parcel);
        p9.c.r(parcel, 1, j10);
        p9.c.b(parcel, iA);
    }
}
