package nb;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f5 extends com.google.android.gms.internal.measurement.p0 implements g5 {
    public f5() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        com.google.android.gms.internal.measurement.q0.f(parcel);
        B0(arrayListCreateTypedArrayList);
        return true;
    }
}
