package nb;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends com.google.android.gms.internal.measurement.o0 implements g5 {
    public e5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // nb.g5
    public final void B0(List list) {
        Parcel parcelS2 = s2();
        parcelS2.writeTypedList(list);
        u2(2, parcelS2);
    }
}
