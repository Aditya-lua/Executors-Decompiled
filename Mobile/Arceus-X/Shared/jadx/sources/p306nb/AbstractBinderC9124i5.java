package p306nb;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.BinderC2238p0;
import com.google.android.gms.internal.measurement.C2256q0;
import com.google.android.gms.measurement.internal.zzoq;

/* JADX INFO: renamed from: nb.i5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC9124i5 extends BinderC2238p0 implements InterfaceC9140j5 {
    public AbstractBinderC9124i5() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2238p0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo9842r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) C2256q0.m10548b(parcel, zzoq.CREATOR);
        C2256q0.m10552f(parcel);
        mo36344M1(zzoqVar);
        return true;
    }
}
