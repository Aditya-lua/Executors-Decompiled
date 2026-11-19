package nf;

import android.os.IBinder;
import android.os.IInterface;
import wa.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends w implements e {
    public static e s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new c(iBinder);
    }
}
