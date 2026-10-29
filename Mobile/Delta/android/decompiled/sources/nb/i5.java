package nb;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;

/* JADX INFO: loaded from: classes.dex */
public abstract class i5 extends com.google.android.gms.internal.measurement.p0 implements j5 {
    public i5() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) com.google.android.gms.internal.measurement.q0.b(parcel, zzoq.CREATOR);
        com.google.android.gms.internal.measurement.q0.f(parcel);
        M1(zzoqVar);
        return true;
    }
}
