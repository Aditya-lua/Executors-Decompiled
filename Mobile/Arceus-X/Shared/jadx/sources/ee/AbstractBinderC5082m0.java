package ee;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: ee.m0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5082m0 extends BinderC5060b0 implements InterfaceC5084n0 {
    public AbstractBinderC5082m0() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // ee.BinderC5060b0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo23772r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) C5068f0.m23798a(parcel, Bundle.CREATOR);
            C5068f0.m23799b(parcel);
            mo23820B1(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) C5068f0.m23798a(parcel, Bundle.CREATOR);
            C5068f0.m23799b(parcel);
            mo23822b(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) C5068f0.m23798a(parcel, Bundle.CREATOR);
            C5068f0.m23799b(parcel);
            mo23821I1(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) C5068f0.m23798a(parcel, Bundle.CREATOR);
        C5068f0.m23799b(parcel);
        mo23823d(bundle4);
        return true;
    }
}
