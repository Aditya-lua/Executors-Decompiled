package bb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void t2(j jVar, f9.c cVar) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, jVar);
        e.b(parcelR2, cVar);
        s2(13, parcelR2);
    }

    public final void u2(l lVar) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, lVar);
        s2(11, parcelR2);
    }

    public final void v2(n nVar, f9.d dVar) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, nVar);
        e.b(parcelR2, dVar);
        s2(12, parcelR2);
    }

    public final void w2(p pVar, f9.f fVar) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, pVar);
        e.b(parcelR2, fVar);
        s2(10, parcelR2);
    }
}
