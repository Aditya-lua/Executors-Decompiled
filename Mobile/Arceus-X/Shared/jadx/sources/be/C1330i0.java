package be;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: be.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1330i0 extends C1325g1 implements InterfaceC1336k0 {
    public C1330i0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: be.m0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.InterfaceC1336k0
    /* JADX INFO: renamed from: E0 */
    public final void mo7168E0(String str, List list, Bundle bundle, InterfaceC1342m0 interfaceC1342m0) {
        Parcel parcelM7165r2 = m7165r2();
        parcelM7165r2.writeString(str);
        parcelM7165r2.writeTypedList(list);
        C1331i1.m7173c(parcelM7165r2, bundle);
        parcelM7165r2.writeStrongBinder(interfaceC1342m0);
        m7166s2(2, parcelM7165r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: be.m0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.InterfaceC1336k0
    /* JADX INFO: renamed from: I0 */
    public final void mo7169I0(String str, List list, Bundle bundle, InterfaceC1342m0 interfaceC1342m0) {
        Parcel parcelM7165r2 = m7165r2();
        parcelM7165r2.writeString(str);
        parcelM7165r2.writeTypedList(list);
        C1331i1.m7173c(parcelM7165r2, bundle);
        parcelM7165r2.writeStrongBinder(interfaceC1342m0);
        m7166s2(8, parcelM7165r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: be.m0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.InterfaceC1336k0
    /* JADX INFO: renamed from: n0 */
    public final void mo7170n0(String str, List list, Bundle bundle, InterfaceC1342m0 interfaceC1342m0) {
        Parcel parcelM7165r2 = m7165r2();
        parcelM7165r2.writeString(str);
        parcelM7165r2.writeTypedList(list);
        C1331i1.m7173c(parcelM7165r2, bundle);
        parcelM7165r2.writeStrongBinder(interfaceC1342m0);
        m7166s2(7, parcelM7165r2);
    }
}
