package ee;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ee.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5086o0 extends C5056a implements InterfaceC5090q0 {
    public C5086o0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ee.s0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee.InterfaceC5090q0
    /* JADX INFO: renamed from: F1 */
    public final void mo23825F1(Bundle bundle, InterfaceC5094s0 interfaceC5094s0) {
        Parcel parcelM23766r2 = m23766r2();
        C5068f0.m23800c(parcelM23766r2, bundle);
        parcelM23766r2.writeStrongBinder(interfaceC5094s0);
        m23767s2(2, parcelM23766r2);
    }
}
