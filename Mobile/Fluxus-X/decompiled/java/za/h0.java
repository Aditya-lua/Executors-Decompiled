package za;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends a implements IInterface {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void t2(z zVar, a9.a aVar) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, zVar);
        t.c(parcelR2, aVar);
        s2(1, parcelR2);
    }

    public final void u2(c0 c0Var, a9.d dVar, String str) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, c0Var);
        t.c(parcelR2, dVar);
        parcelR2.writeString(str);
        s2(4, parcelR2);
    }

    public final void v2(e0 e0Var, a9.e eVar) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, e0Var);
        t.c(parcelR2, eVar);
        s2(3, parcelR2);
    }

    public final void w2(m9.g gVar, String str) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, gVar);
        parcelR2.writeString(str);
        s2(2, parcelR2);
    }
}
