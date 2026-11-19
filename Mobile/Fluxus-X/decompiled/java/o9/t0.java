package o9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends p9.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f27041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k9.b f27042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f27043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f27044j;

    public t0(int i10, IBinder iBinder, k9.b bVar, boolean z10, boolean z11) {
        this.f27040f = i10;
        this.f27041g = iBinder;
        this.f27042h = bVar;
        this.f27043i = z10;
        this.f27044j = z11;
    }

    public final k9.b A3() {
        return this.f27042h;
    }

    public final l B3() {
        IBinder iBinder = this.f27041g;
        if (iBinder == null) {
            return null;
        }
        return l.a.s2(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f27042h.equals(t0Var.f27042h) && q.b(B3(), t0Var.B3());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f27040f);
        p9.c.m(parcel, 2, this.f27041g, false);
        p9.c.t(parcel, 3, this.f27042h, i10, false);
        p9.c.c(parcel, 4, this.f27043i);
        p9.c.c(parcel, 5, this.f27044j);
        p9.c.b(parcel, iA);
    }
}
