package p306nb;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.BinderC2238p0;
import com.google.android.gms.internal.measurement.C2256q0;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;

/* JADX INFO: renamed from: nb.f5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC9076f5 extends BinderC2238p0 implements InterfaceC9092g5 {
    public AbstractBinderC9076f5() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2238p0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo9842r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        C2256q0.m10552f(parcel);
        mo36288x0(arrayListCreateTypedArrayList);
        return true;
    }
}
