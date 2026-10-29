package ee;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ee.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5076j0 extends C5056a implements InterfaceC5080l0 {
    public C5076j0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ee.n0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee.InterfaceC5080l0
    /* JADX INFO: renamed from: L0 */
    public final void mo23811L0(Bundle bundle, InterfaceC5084n0 interfaceC5084n0) {
        Parcel parcelM23766r2 = m23766r2();
        C5068f0.m23800c(parcelM23766r2, bundle);
        parcelM23766r2.writeStrongBinder(interfaceC5084n0);
        m23767s2(2, parcelM23766r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ee.n0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee.InterfaceC5080l0
    /* JADX INFO: renamed from: m1 */
    public final void mo23812m1(Bundle bundle, InterfaceC5084n0 interfaceC5084n0) {
        Parcel parcelM23766r2 = m23766r2();
        C5068f0.m23800c(parcelM23766r2, bundle);
        parcelM23766r2.writeStrongBinder(interfaceC5084n0);
        m23767s2(3, parcelM23766r2);
    }
}
