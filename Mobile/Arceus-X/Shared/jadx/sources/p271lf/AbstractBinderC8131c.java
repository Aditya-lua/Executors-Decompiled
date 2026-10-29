package p271lf;

import android.os.IBinder;
import android.os.IInterface;
import va.BinderC12153w;

/* JADX INFO: renamed from: lf.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC8131c extends BinderC12153w implements InterfaceC8132d {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC8132d m33352s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8132d ? (InterfaceC8132d) iInterfaceQueryLocalInterface : new C8130b(iBinder);
    }
}
