package ee;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ee.k0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5078k0 extends BinderC5060b0 implements InterfaceC5080l0 {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC5080l0 m23813s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5080l0 ? (InterfaceC5080l0) iInterfaceQueryLocalInterface : new C5076j0(iBinder);
    }
}
