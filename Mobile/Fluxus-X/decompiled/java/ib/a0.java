package ib;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p9.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f19308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mb.l f19309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f19310i;

    public a0(int i10, y yVar, IBinder iBinder, IBinder iBinder2) {
        this.f19307f = i10;
        this.f19308g = yVar;
        d cVar = null;
        this.f19309h = iBinder == null ? null : mb.k.s2(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cVar = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new c(iBinder2);
        }
        this.f19310i = cVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f19307f);
        p9.c.t(parcel, 2, this.f19308g, i10, false);
        mb.l lVar = this.f19309h;
        p9.c.m(parcel, 3, lVar == null ? null : lVar.asBinder(), false);
        d dVar = this.f19310i;
        p9.c.m(parcel, 4, dVar != null ? dVar.asBinder() : null, false);
        p9.c.b(parcel, iA);
    }
}
