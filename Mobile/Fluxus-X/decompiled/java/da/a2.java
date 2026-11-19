package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends p9.a {
    public static final Parcelable.Creator<a2> CREATOR = new b2();

    public a2(boolean z10) {
    }

    public final boolean equals(Object obj) {
        return obj instanceof a2;
    }

    public final int hashCode() {
        return o9.q.c(Boolean.FALSE);
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, false);
        p9.c.b(parcel, iA);
    }
}
