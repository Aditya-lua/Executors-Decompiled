package rb;

import android.os.Parcel;
import android.os.Parcelable;
import o9.t0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p9.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k9.b f30638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f30639h;

    public l(int i10, k9.b bVar, t0 t0Var) {
        this.f30637f = i10;
        this.f30638g = bVar;
        this.f30639h = t0Var;
    }

    public final k9.b A3() {
        return this.f30638g;
    }

    public final t0 B3() {
        return this.f30639h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f30637f);
        p9.c.t(parcel, 2, this.f30638g, i10, false);
        p9.c.t(parcel, 3, this.f30639h, i10, false);
        p9.c.b(parcel, iA);
    }
}
