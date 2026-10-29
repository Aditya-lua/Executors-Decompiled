package nb;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;

/* JADX INFO: loaded from: classes.dex */
public final class h5 extends com.google.android.gms.internal.measurement.o0 implements j5 {
    public h5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // nb.j5
    public final void M1(zzoq zzoqVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzoqVar);
        u2(2, parcelS2);
    }
}
