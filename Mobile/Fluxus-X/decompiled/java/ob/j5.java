package ob;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j5 extends com.google.android.gms.internal.measurement.o0 implements l5 {
    public j5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // ob.l5
    public final void D0(List list) {
        Parcel parcelS2 = s2();
        parcelS2.writeTypedList(list);
        u2(2, parcelS2);
    }
}
