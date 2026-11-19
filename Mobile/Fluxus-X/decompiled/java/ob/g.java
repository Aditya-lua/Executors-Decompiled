package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p9.a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f27343h;

    public g(long j10, int i10, long j11) {
        this.f27341f = j10;
        this.f27342g = i10;
        this.f27343h = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f27341f;
        int iA = p9.c.a(parcel);
        p9.c.r(parcel, 1, j10);
        p9.c.n(parcel, 2, this.f27342g);
        p9.c.r(parcel, 3, this.f27343h);
        p9.c.b(parcel, iA);
    }
}
