package mb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class w extends p9.a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f23115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23116h;

    public w(String str, String str2, String str3) {
        this.f23116h = str;
        this.f23114f = str2;
        this.f23115g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, this.f23114f, false);
        p9.c.v(parcel, 2, this.f23115g, false);
        p9.c.v(parcel, 5, this.f23116h, false);
        p9.c.b(parcel, iA);
    }
}
