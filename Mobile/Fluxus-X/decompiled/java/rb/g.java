package rb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends cb.a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void u2(j jVar, f fVar) {
        Parcel parcelR2 = r2();
        cb.c.c(parcelR2, jVar);
        cb.c.d(parcelR2, fVar);
        s2(12, parcelR2);
    }
}
