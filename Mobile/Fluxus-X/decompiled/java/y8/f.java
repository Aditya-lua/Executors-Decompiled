package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p9.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37704g;

    public f(String str, int i10) {
        this.f37703f = str;
        this.f37704g = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, this.f37703f, false);
        p9.c.n(parcel, 2, this.f37704g);
        p9.c.b(parcel, iA);
    }

    public final int zza() {
        return this.f37704g;
    }

    public final String zzb() {
        return this.f37703f;
    }
}
