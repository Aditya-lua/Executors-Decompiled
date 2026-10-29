package ae;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0 extends h1 implements m0 {
    public l0() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // ae.h1
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                int i12 = parcel.readInt();
                Bundle bundle = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                n0(i12, bundle);
                return true;
            case 3:
                int i13 = parcel.readInt();
                Bundle bundle2 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                b0(i13, bundle2);
                return true;
            case 4:
                int i14 = parcel.readInt();
                Bundle bundle3 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                i(i14, bundle3);
                return true;
            case 5:
                int i15 = parcel.readInt();
                Bundle bundle4 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                x0(i15, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                k0(bundle5);
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                i1.b(parcel);
                r(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                U0(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                v1(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                d0(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                s0(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                h1(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                j(bundle11);
                return true;
            default:
                return false;
        }
    }
}
