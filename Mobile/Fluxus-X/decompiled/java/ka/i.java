package ka;

import android.os.Parcel;
import android.os.Parcelable;
import ha.p;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21322f;

    public i(String str) {
        this.f21322f = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return q.b(this.f21322f, ((i) obj).f21322f);
    }

    public final int hashCode() {
        return q.c(this.f21322f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21322f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        p9.c.b(parcel, iA);
    }
}
