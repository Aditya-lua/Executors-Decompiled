package kf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzk;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzg;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        Thing[] thingArr = null;
        String[] strArrI = null;
        String[] strArrI2 = null;
        zzk zzkVar = null;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 2:
                    thingArr = (Thing[]) o9.a.k(parcel, iU, Thing.CREATOR);
                    break;
                case 3:
                    strArrI = o9.a.i(parcel, iU);
                    break;
                case 4:
                default:
                    o9.a.C(parcel, iU);
                    break;
                case 5:
                    strArrI2 = o9.a.i(parcel, iU);
                    break;
                case 6:
                    zzkVar = (zzk) o9.a.g(parcel, iU, zzk.CREATOR);
                    break;
                case 7:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 8:
                    strH2 = o9.a.h(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzg(iW, thingArr, strArrI, strArrI2, zzkVar, strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
