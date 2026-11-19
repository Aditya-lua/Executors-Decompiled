package o9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        u uVar = null;
        int[] iArrE = null;
        int[] iArrE2 = null;
        boolean zO = false;
        boolean zO2 = false;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    uVar = (u) p9.b.g(parcel, iU, u.CREATOR);
                    break;
                case 2:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 3:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 4:
                    iArrE = p9.b.e(parcel, iU);
                    break;
                case 5:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 6:
                    iArrE2 = p9.b.e(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new g(uVar, zO, zO2, iArrE, iW, iArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
