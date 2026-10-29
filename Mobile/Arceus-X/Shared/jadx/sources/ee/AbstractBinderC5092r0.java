package ee;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: ee.r0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5092r0 extends BinderC5060b0 implements InterfaceC5094s0 {
    public AbstractBinderC5092r0() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // ee.BinderC5060b0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo23772r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) C5068f0.m23798a(parcel, Bundle.CREATOR);
        C5068f0.m23799b(parcel);
        mo23833d(bundle);
        return true;
    }
}
