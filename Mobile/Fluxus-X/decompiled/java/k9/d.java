package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class d extends p9.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final int f21227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21229i;

    public d(@NonNull String str, int i10, long j10, boolean z10) {
        this.f21226f = str;
        this.f21227g = i10;
        this.f21228h = j10;
        this.f21229i = z10;
    }

    public boolean A3() {
        return this.f21229i;
    }

    public long B3() {
        long j10 = this.f21228h;
        return j10 == -1 ? this.f21227g : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (o9.q.b(getName(), dVar.getName()) && B3() == dVar.B3() && A3() == dVar.A3()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.f21226f;
    }

    public final int hashCode() {
        return o9.q.c(getName(), Long.valueOf(B3()), Boolean.valueOf(A3()));
    }

    @NonNull
    public final String toString() {
        o9.q.a aVarD = o9.q.d(this);
        aVarD.a("name", getName());
        aVarD.a("version", Long.valueOf(B3()));
        aVarD.a("is_fully_rolled_out", Boolean.valueOf(A3()));
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, getName(), false);
        p9.c.n(parcel, 2, this.f21227g);
        p9.c.r(parcel, 3, B3());
        p9.c.c(parcel, 4, A3());
        p9.c.b(parcel, iA);
    }

    public d(@NonNull String str, long j10) {
        this(str, -1, j10, false);
    }
}
