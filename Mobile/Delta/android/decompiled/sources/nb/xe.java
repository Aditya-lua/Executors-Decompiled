package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        int iW = 0;
        boolean zO2 = false;
        boolean zO3 = false;
        int iW2 = 0;
        int iW3 = 0;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        long jY4 = 0;
        long jY5 = 0;
        long jY6 = 0;
        long jY7 = 0;
        String strH = "";
        String strH2 = strH;
        String strH3 = strH2;
        String strH4 = strH3;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        Boolean boolP = null;
        ArrayList<String> arrayListJ = null;
        String strH11 = null;
        String strH12 = null;
        int iW4 = 100;
        boolean zO4 = true;
        boolean zO5 = true;
        long jY8 = -2147483648L;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 2:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH6 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH7 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    strH8 = o9.a.h(parcel, iU);
                    break;
                case 6:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 7:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 8:
                    strH9 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    zO4 = o9.a.o(parcel, iU);
                    break;
                case 10:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 11:
                    jY8 = o9.a.y(parcel, iU);
                    break;
                case 12:
                    strH10 = o9.a.h(parcel, iU);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    o9.a.C(parcel, iU);
                    break;
                case 14:
                    jY3 = o9.a.y(parcel, iU);
                    break;
                case 15:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 16:
                    zO5 = o9.a.o(parcel, iU);
                    break;
                case 18:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 21:
                    boolP = o9.a.p(parcel, iU);
                    break;
                case 22:
                    jY4 = o9.a.y(parcel, iU);
                    break;
                case 23:
                    arrayListJ = o9.a.j(parcel, iU);
                    break;
                case 25:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 26:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 27:
                    strH11 = o9.a.h(parcel, iU);
                    break;
                case 28:
                    zO3 = o9.a.o(parcel, iU);
                    break;
                case 29:
                    jY5 = o9.a.y(parcel, iU);
                    break;
                case 30:
                    iW4 = o9.a.w(parcel, iU);
                    break;
                case 31:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 32:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 34:
                    jY6 = o9.a.y(parcel, iU);
                    break;
                case 35:
                    strH12 = o9.a.h(parcel, iU);
                    break;
                case 36:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 37:
                    jY7 = o9.a.y(parcel, iU);
                    break;
                case 38:
                    iW3 = o9.a.w(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzr(strH5, strH6, strH7, strH8, jY, jY2, strH9, zO4, zO, jY8, strH10, jY3, iW, zO5, zO2, boolP, jY4, arrayListJ, strH, strH2, strH11, zO3, jY5, iW4, strH3, iW2, jY6, strH12, strH4, jY7, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
