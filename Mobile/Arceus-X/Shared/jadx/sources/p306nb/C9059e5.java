package p306nb;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C2220o0;
import java.util.List;

/* JADX INFO: renamed from: nb.e5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9059e5 extends C2220o0 implements InterfaceC9092g5 {
    public C9059e5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // p306nb.InterfaceC9092g5
    /* JADX INFO: renamed from: x0 */
    public final void mo36288x0(List list) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeTypedList(list);
        m10476u2(2, parcelM10474s2);
    }
}
