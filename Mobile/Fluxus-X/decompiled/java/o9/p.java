package o9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class p extends p9.a {

    @NonNull
    public static final Parcelable.Creator<p> CREATOR = new m0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f27007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f27009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f27010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f27012n;

    @Deprecated
    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f27004f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.n(parcel, 2, this.f27005g);
        p9.c.n(parcel, 3, this.f27006h);
        p9.c.r(parcel, 4, this.f27007i);
        p9.c.r(parcel, 5, this.f27008j);
        p9.c.v(parcel, 6, this.f27009k, false);
        p9.c.v(parcel, 7, this.f27010l, false);
        p9.c.n(parcel, 8, this.f27011m);
        p9.c.n(parcel, 9, this.f27012n);
        p9.c.b(parcel, iA);
    }

    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f27004f = i10;
        this.f27005g = i11;
        this.f27006h = i12;
        this.f27007i = j10;
        this.f27008j = j11;
        this.f27009k = str;
        this.f27010l = str2;
        this.f27011m = i13;
        this.f27012n = i14;
    }
}
