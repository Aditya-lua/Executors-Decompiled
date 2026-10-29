package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        zzpl zzplVar = null;
        String strH3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 2:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    zzplVar = (zzpl) o9.a.g(parcel, iU, zzpl.CREATOR);
                    break;
                case 5:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 6:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 7:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 8:
                    zzbgVar = (zzbg) o9.a.g(parcel, iU, zzbg.CREATOR);
                    break;
                case 9:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 10:
                    zzbgVar2 = (zzbg) o9.a.g(parcel, iU, zzbg.CREATOR);
                    break;
                case 11:
                    jY3 = o9.a.y(parcel, iU);
                    break;
                case 12:
                    zzbgVar3 = (zzbg) o9.a.g(parcel, iU, zzbg.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzah(strH, strH2, zzplVar, jY, zO, strH3, zzbgVar, jY2, zzbgVar2, jY3, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzah[i10];
    }
}
