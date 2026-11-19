package ib;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p9.a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f19335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mb.r f19336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PendingIntent f19337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mb.o f19338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f19339k;

    public r(int i10, p pVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f19334f = i10;
        this.f19335g = pVar;
        d cVar = null;
        this.f19336h = iBinder == null ? null : mb.q.s2(iBinder);
        this.f19337i = pendingIntent;
        this.f19338j = iBinder2 == null ? null : mb.n.s2(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cVar = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new c(iBinder3);
        }
        this.f19339k = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, mb.o] */
    public static r A3(mb.o oVar, d dVar) {
        if (dVar == null) {
            dVar = null;
        }
        return new r(2, null, null, null, oVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, mb.r] */
    public static r a(mb.r rVar, d dVar) {
        if (dVar == null) {
            dVar = null;
        }
        return new r(2, null, rVar, null, null, dVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f19334f);
        p9.c.t(parcel, 2, this.f19335g, i10, false);
        mb.r rVar = this.f19336h;
        p9.c.m(parcel, 3, rVar == null ? null : rVar.asBinder(), false);
        p9.c.t(parcel, 4, this.f19337i, i10, false);
        mb.o oVar = this.f19338j;
        p9.c.m(parcel, 5, oVar == null ? null : oVar.asBinder(), false);
        d dVar = this.f19339k;
        p9.c.m(parcel, 6, dVar != null ? dVar.asBinder() : null, false);
        p9.c.b(parcel, iA);
    }
}
