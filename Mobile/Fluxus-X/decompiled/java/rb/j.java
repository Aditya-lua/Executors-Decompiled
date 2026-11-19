package rb;

import android.os.Parcel;
import android.os.Parcelable;
import o9.r0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p9.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f30636g;

    public j(int i10, r0 r0Var) {
        this.f30635f = i10;
        this.f30636g = r0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f30635f);
        p9.c.t(parcel, 2, this.f30636g, i10, false);
        p9.c.b(parcel, iA);
    }
}
