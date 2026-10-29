package p306nb;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C2220o0;
import com.google.android.gms.internal.measurement.C2256q0;
import com.google.android.gms.measurement.internal.zzoq;

/* JADX INFO: renamed from: nb.h5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9108h5 extends C2220o0 implements InterfaceC9140j5 {
    public C9108h5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // p306nb.InterfaceC9140j5
    /* JADX INFO: renamed from: M1 */
    public final void mo36344M1(zzoq zzoqVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzoqVar);
        m10476u2(2, parcelM10474s2);
    }
}
