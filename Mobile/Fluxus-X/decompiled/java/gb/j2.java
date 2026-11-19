package gb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends a implements IInterface {
    public j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void t2(i2 i2Var, d2 d2Var) {
        Parcel parcelR2 = r2();
        l0.d(parcelR2, i2Var);
        l0.c(parcelR2, d2Var);
        s2(2, parcelR2);
    }
}
