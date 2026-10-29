package ee;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ee.p0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5088p0 extends BinderC5060b0 implements InterfaceC5090q0 {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC5090q0 m23830s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5090q0 ? (InterfaceC5090q0) iInterfaceQueryLocalInterface : new C5086o0(iBinder);
    }
}
