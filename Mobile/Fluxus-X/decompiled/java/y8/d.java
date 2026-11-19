package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p9.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f37702g;

    public d(String str, String str2) {
        this.f37701f = str;
        this.f37702g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, this.f37701f, false);
        p9.c.v(parcel, 2, this.f37702g, false);
        p9.c.b(parcel, iA);
    }
}
