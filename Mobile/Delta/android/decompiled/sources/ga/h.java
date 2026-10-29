package ga;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import fb.k0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends fb.a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void t2(g gVar, long j10) {
        Parcel parcelR2 = r2();
        k0.d(parcelR2, gVar);
        parcelR2.writeLong(j10);
        s2(15501, parcelR2);
    }

    public final void u2(long j10) {
        Parcel parcelR2 = r2();
        parcelR2.writeLong(j10);
        s2(5001, parcelR2);
    }

    public final void v2(e eVar) {
        Parcel parcelR2 = r2();
        k0.d(parcelR2, eVar);
        s2(5002, parcelR2);
    }

    public final void w2(IBinder iBinder, Bundle bundle) {
        Parcel parcelR2 = r2();
        parcelR2.writeStrongBinder(iBinder);
        k0.c(parcelR2, bundle);
        s2(5005, parcelR2);
    }

    public final void x2() {
        s2(5006, r2());
    }

    public final void y2(e eVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel parcelR2 = r2();
        k0.d(parcelR2, eVar);
        parcelR2.writeString(str);
        parcelR2.writeStrongBinder(iBinder);
        k0.c(parcelR2, bundle);
        s2(5024, parcelR2);
    }

    public final void z2(e eVar, boolean z10) {
        Parcel parcelR2 = r2();
        k0.d(parcelR2, eVar);
        parcelR2.writeInt(z10 ? 1 : 0);
        s2(6001, parcelR2);
    }
}
