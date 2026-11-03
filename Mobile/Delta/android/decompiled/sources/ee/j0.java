package ee;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends a implements l0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee.l0
    public final void L0(Bundle bundle, n0 n0Var) {
        Parcel parcelR2 = r2();
        f0.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(n0Var);
        s2(2, parcelR2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee.l0
    public final void m1(Bundle bundle, n0 n0Var) {
        Parcel parcelR2 = r2();
        f0.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(n0Var);
        s2(3, parcelR2);
    }
}
