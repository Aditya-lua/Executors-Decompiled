package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class vd extends p9.a {
    public static final Parcelable.Creator<vd> CREATOR = new wd();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f27901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27902h;

    public vd(String str, long j10, int i10) {
        this.f27900f = str;
        this.f27901g = j10;
        this.f27902h = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f27900f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        p9.c.r(parcel, 2, this.f27901g);
        p9.c.n(parcel, 3, this.f27902h);
        p9.c.b(parcel, iA);
    }
}
