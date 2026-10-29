package ae;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends g1 implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ae.k0
    public final void H(String str, List list, Bundle bundle, m0 m0Var) {
        Parcel parcelR2 = r2();
        parcelR2.writeString(str);
        parcelR2.writeTypedList(list);
        i1.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(m0Var);
        s2(8, parcelR2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ae.k0
    public final void H0(String str, List list, Bundle bundle, m0 m0Var) {
        Parcel parcelR2 = r2();
        parcelR2.writeString(str);
        parcelR2.writeTypedList(list);
        i1.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(m0Var);
        s2(2, parcelR2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ae.k0
    public final void g0(String str, List list, Bundle bundle, m0 m0Var) {
        Parcel parcelR2 = r2();
        parcelR2.writeString(str);
        parcelR2.writeTypedList(list);
        i1.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(m0Var);
        s2(7, parcelR2);
    }
}
