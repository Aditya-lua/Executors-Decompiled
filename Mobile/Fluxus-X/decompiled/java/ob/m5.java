package ob;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class m5 extends com.google.android.gms.internal.measurement.o0 implements o5 {
    public m5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // ob.o5
    public final void H1(ee eeVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, eeVar);
        u2(2, parcelS2);
    }
}
