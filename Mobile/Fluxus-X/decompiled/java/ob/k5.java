package ob;

import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class k5 extends com.google.android.gms.internal.measurement.p0 implements l5 {
    public k5() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(vd.CREATOR);
        com.google.android.gms.internal.measurement.q0.f(parcel);
        D0(arrayListCreateTypedArrayList);
        return true;
    }
}
