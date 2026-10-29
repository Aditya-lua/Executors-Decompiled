package nb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzom;

/* JADX INFO: loaded from: classes.dex */
public final class ud implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        byte[] bArrC = null;
        String strH = null;
        Bundle bundleB = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 2:
                    bArrC = o9.a.c(parcel, iU);
                    break;
                case 3:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 4:
                    bundleB = o9.a.b(parcel, iU);
                    break;
                case 5:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 6:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 7:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzom(jY, bArrC, strH, bundleB, iW, jY2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzom[i10];
    }
}
