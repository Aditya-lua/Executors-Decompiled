package mb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p9.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23120i;

    public z(int i10, int i11, long j10, long j11) {
        this.f23117f = i10;
        this.f23118g = i11;
        this.f23119h = j10;
        this.f23120i = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f23117f == zVar.f23117f && this.f23118g == zVar.f23118g && this.f23119h == zVar.f23119h && this.f23120i == zVar.f23120i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o9.q.c(Integer.valueOf(this.f23118g), Integer.valueOf(this.f23117f), Long.valueOf(this.f23120i), Long.valueOf(this.f23119h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f23117f + " Cell status: " + this.f23118g + " elapsed time NS: " + this.f23120i + " system time ms: " + this.f23119h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f23117f);
        p9.c.n(parcel, 2, this.f23118g);
        p9.c.r(parcel, 3, this.f23119h);
        p9.c.r(parcel, 4, this.f23120i);
        p9.c.b(parcel, iA);
    }
}
