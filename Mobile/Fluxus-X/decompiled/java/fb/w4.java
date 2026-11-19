package fb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends a implements IInterface {
    public w4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t2(v4 v4Var, da.r rVar) {
        Parcel parcelR2 = r2();
        ClassLoader classLoader = b1.f15722a;
        parcelR2.writeStrongBinder(v4Var);
        b1.c(parcelR2, rVar);
        s2(1, parcelR2);
    }
}
