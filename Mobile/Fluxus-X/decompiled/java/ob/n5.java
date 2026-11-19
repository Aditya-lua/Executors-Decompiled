package ob;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class n5 extends com.google.android.gms.internal.measurement.p0 implements o5 {
    public n5() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ee eeVar = (ee) com.google.android.gms.internal.measurement.q0.b(parcel, ee.CREATOR);
        com.google.android.gms.internal.measurement.q0.f(parcel);
        H1(eeVar);
        return true;
    }
}
