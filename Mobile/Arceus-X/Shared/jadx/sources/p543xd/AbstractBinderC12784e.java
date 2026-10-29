package p543xd;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: xd.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC12784e extends BinderC12781b implements InterfaceC12785f {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC12785f m47648s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC12785f ? (InterfaceC12785f) iInterfaceQueryLocalInterface : new C12783d(iBinder);
    }
}
