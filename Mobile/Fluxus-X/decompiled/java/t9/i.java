package t9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class i extends cb.a implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void u2(h hVar, a aVar) {
        Parcel parcelR2 = r2();
        cb.c.d(parcelR2, hVar);
        cb.c.c(parcelR2, aVar);
        s2(1, parcelR2);
    }

    public final void v2(h hVar, a aVar, k kVar) {
        Parcel parcelR2 = r2();
        cb.c.d(parcelR2, hVar);
        cb.c.c(parcelR2, aVar);
        cb.c.d(parcelR2, kVar);
        s2(2, parcelR2);
    }

    public final void w2(m9.g gVar, k kVar) {
        Parcel parcelR2 = r2();
        cb.c.d(parcelR2, gVar);
        cb.c.d(parcelR2, kVar);
        s2(6, parcelR2);
    }
}
