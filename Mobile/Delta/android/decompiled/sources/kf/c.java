package kf;

import android.os.IBinder;
import android.os.IInterface;
import va.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends w implements d {
    public static d s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinder);
    }
}
