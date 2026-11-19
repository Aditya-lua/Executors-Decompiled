package ka;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        boolean zO6 = false;
        boolean zO7 = false;
        boolean zO8 = false;
        boolean zO9 = false;
        boolean zO10 = false;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 2:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 3:
                    zO3 = p9.b.o(parcel, iU);
                    break;
                case 4:
                    zO4 = p9.b.o(parcel, iU);
                    break;
                case 5:
                    zO5 = p9.b.o(parcel, iU);
                    break;
                case 6:
                    zO6 = p9.b.o(parcel, iU);
                    break;
                case 7:
                    zO7 = p9.b.o(parcel, iU);
                    break;
                case 8:
                    zO8 = p9.b.o(parcel, iU);
                    break;
                case 9:
                    zO9 = p9.b.o(parcel, iU);
                    break;
                case 10:
                    zO10 = p9.b.o(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new f(zO, zO2, zO3, zO4, zO5, zO6, zO7, zO8, zO9, zO10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
