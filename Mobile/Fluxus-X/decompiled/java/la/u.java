package la;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import gb.l0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends gb.a implements IInterface {
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
    }

    public final void t2(w wVar, q qVar, List list, List list2) {
        Parcel parcelR2 = r2();
        l0.d(parcelR2, wVar);
        l0.c(parcelR2, qVar);
        parcelR2.writeTypedList(list);
        parcelR2.writeTypedList(list2);
        s2(3, parcelR2);
    }

    public final void u2(w wVar, q qVar, h hVar) {
        Parcel parcelR2 = r2();
        l0.d(parcelR2, wVar);
        l0.c(parcelR2, qVar);
        l0.c(parcelR2, hVar);
        s2(4, parcelR2);
    }
}
