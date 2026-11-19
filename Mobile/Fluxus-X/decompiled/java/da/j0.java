package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends p9.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12051f;

    public j0(boolean z10) {
        this.f12051f = ((Boolean) o9.s.l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j0) && this.f12051f == ((j0) obj).f12051f;
    }

    public final int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f12051f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f12051f;
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, z10);
        p9.c.b(parcel, iA);
    }
}
