package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends p9.a {
    public static final Parcelable.Creator<e2> CREATOR = new g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12036f;

    public e2(boolean z10) {
        this.f12036f = ((Boolean) o9.s.l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e2) && this.f12036f == ((e2) obj).f12036f;
    }

    public final int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f12036f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f12036f;
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, z10);
        p9.c.b(parcel, iA);
    }
}
