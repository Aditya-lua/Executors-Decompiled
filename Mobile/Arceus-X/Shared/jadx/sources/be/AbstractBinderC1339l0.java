package be;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: renamed from: be.l0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1339l0 extends BinderC1328h1 implements InterfaceC1342m0 {
    public AbstractBinderC1339l0() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // be.BinderC1328h1
    /* JADX INFO: renamed from: r2 */
    public final boolean mo7167r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                int i12 = parcel.readInt();
                Bundle bundle = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo548k0(i12, bundle);
                return true;
            case 3:
                int i13 = parcel.readInt();
                Bundle bundle2 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo549Z(i13, bundle2);
                return true;
            case 4:
                int i14 = parcel.readInt();
                Bundle bundle3 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo553i(i14, bundle3);
                return true;
            case 5:
                int i15 = parcel.readInt();
                Bundle bundle4 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo557v0(i15, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo552h0(bundle5);
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo556r(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo546R0(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo537t1(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo550b0(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo555q0(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo551d1(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) C1331i1.m7171a(parcel, Bundle.CREATOR);
                C1331i1.m7172b(parcel);
                mo554j(bundle11);
                return true;
            default:
                return false;
        }
    }
}
