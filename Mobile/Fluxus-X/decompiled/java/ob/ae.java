package ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends p9.a {
    public static final Parcelable.Creator<ae> CREATOR = new be();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f27090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f27092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f27094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27095l;

    public ae(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f27089f = j10;
        this.f27090g = bArr;
        this.f27091h = str;
        this.f27092i = bundle;
        this.f27093j = i10;
        this.f27094k = j11;
        this.f27095l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f27089f;
        int iA = p9.c.a(parcel);
        p9.c.r(parcel, 1, j10);
        p9.c.g(parcel, 2, this.f27090g, false);
        p9.c.v(parcel, 3, this.f27091h, false);
        p9.c.f(parcel, 4, this.f27092i, false);
        p9.c.n(parcel, 5, this.f27093j);
        p9.c.r(parcel, 6, this.f27094k);
        p9.c.v(parcel, 7, this.f27095l, false);
        p9.c.b(parcel, iA);
    }
}
