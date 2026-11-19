package nf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import wa.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        Thing[] thingArr = null;
        String[] strArrI = null;
        String[] strArrI2 = null;
        f0 f0Var = null;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 2:
                    thingArr = (Thing[]) p9.b.k(parcel, iU, Thing.CREATOR);
                    break;
                case 3:
                    strArrI = p9.b.i(parcel, iU);
                    break;
                case 4:
                default:
                    p9.b.C(parcel, iU);
                    break;
                case 5:
                    strArrI2 = p9.b.i(parcel, iU);
                    break;
                case 6:
                    f0Var = (f0) p9.b.g(parcel, iU, f0.CREATOR);
                    break;
                case 7:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 8:
                    strH2 = p9.b.h(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new g(iW, thingArr, strArrI, strArrI2, f0Var, strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
