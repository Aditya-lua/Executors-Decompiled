package p305n9;

import android.os.IBinder;
import android.os.IInterface;
import p074db.BinderC4532n;

/* JADX INFO: renamed from: n9.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC8960o0 extends BinderC4532n implements InterfaceC8962p0 {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC8962p0 m36062s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8962p0 ? (InterfaceC8962p0) iInterfaceQueryLocalInterface : new C8957n0(iBinder);
    }
}
