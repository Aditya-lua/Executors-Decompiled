package k9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        String strH = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 3:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 4:
                    iBinderV = p9.b.v(parcel, iU);
                    break;
                case 5:
                    zO3 = p9.b.o(parcel, iU);
                    break;
                case 6:
                    zO4 = p9.b.o(parcel, iU);
                    break;
                case 7:
                default:
                    p9.b.C(parcel, iU);
                    break;
                case 8:
                    zO5 = p9.b.o(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new f0(strH, zO, zO2, iBinderV, zO3, zO4, zO5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f0[i10];
    }
}
