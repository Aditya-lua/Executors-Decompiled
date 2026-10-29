package be;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: be.j0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1333j0 extends BinderC1328h1 implements InterfaceC1336k0 {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC1336k0 m7175s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1336k0 ? (InterfaceC1336k0) iInterfaceQueryLocalInterface : new C1330i0(iBinder);
    }
}
