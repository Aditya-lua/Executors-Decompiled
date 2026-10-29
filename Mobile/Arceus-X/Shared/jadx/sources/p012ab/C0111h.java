package p012ab;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;

/* JADX INFO: renamed from: ab.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0111h extends C0104a implements IInterface {
    public C0111h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m315t2(InterfaceC0113j interfaceC0113j, DeleteBytesRequest deleteBytesRequest) {
        Parcel parcelM301r2 = m301r2();
        C0108e.m312c(parcelM301r2, interfaceC0113j);
        C0108e.m311b(parcelM301r2, deleteBytesRequest);
        m302s2(13, parcelM301r2);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m316u2(InterfaceC0115l interfaceC0115l) {
        Parcel parcelM301r2 = m301r2();
        C0108e.m312c(parcelM301r2, interfaceC0115l);
        m302s2(11, parcelM301r2);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m317v2(InterfaceC0117n interfaceC0117n, RetrieveBytesRequest retrieveBytesRequest) {
        Parcel parcelM301r2 = m301r2();
        C0108e.m312c(parcelM301r2, interfaceC0117n);
        C0108e.m311b(parcelM301r2, retrieveBytesRequest);
        m302s2(12, parcelM301r2);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m318w2(InterfaceC0119p interfaceC0119p, StoreBytesData storeBytesData) {
        Parcel parcelM301r2 = m301r2();
        C0108e.m312c(parcelM301r2, interfaceC0119p);
        C0108e.m311b(parcelM301r2, storeBytesData);
        m302s2(10, parcelM301r2);
    }
}
