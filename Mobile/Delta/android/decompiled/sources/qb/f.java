package qb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: loaded from: classes.dex */
public final class f extends bb.a implements IInterface {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void u2(zai zaiVar, e eVar) {
        Parcel parcelR2 = r2();
        bb.c.c(parcelR2, zaiVar);
        bb.c.d(parcelR2, eVar);
        s2(12, parcelR2);
    }
}
