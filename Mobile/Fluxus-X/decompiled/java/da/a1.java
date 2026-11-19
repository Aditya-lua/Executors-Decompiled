package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends p9.a {
    public static final Parcelable.Creator<a1> CREATOR = new b1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11991f;

    public a1(String str) {
        this.f11991f = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            return o9.q.b(this.f11991f, ((a1) obj).f11991f);
        }
        return false;
    }

    public final int hashCode() {
        return o9.q.c(this.f11991f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f11991f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        p9.c.b(parcel, iA);
    }
}
