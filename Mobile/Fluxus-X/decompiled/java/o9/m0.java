package o9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = -1;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        String strH = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    iW2 = p9.b.w(parcel, iU);
                    break;
                case 2:
                    iW3 = p9.b.w(parcel, iU);
                    break;
                case 3:
                    iW4 = p9.b.w(parcel, iU);
                    break;
                case 4:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 5:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 6:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 7:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 8:
                    iW5 = p9.b.w(parcel, iU);
                    break;
                case 9:
                    iW = p9.b.w(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new p(iW2, iW3, iW4, jY, jY2, strH, strH2, iW5, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
