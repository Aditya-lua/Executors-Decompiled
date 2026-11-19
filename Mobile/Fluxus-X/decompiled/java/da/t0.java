package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        byte[] bArrC = null;
        h hVar = null;
        g gVar = null;
        i iVar = null;
        e eVar = null;
        String strH3 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 3:
                    bArrC = p9.b.c(parcel, iU);
                    break;
                case 4:
                    hVar = (h) p9.b.g(parcel, iU, h.CREATOR);
                    break;
                case 5:
                    gVar = (g) p9.b.g(parcel, iU, g.CREATOR);
                    break;
                case 6:
                    iVar = (i) p9.b.g(parcel, iU, i.CREATOR);
                    break;
                case 7:
                    eVar = (e) p9.b.g(parcel, iU, e.CREATOR);
                    break;
                case 8:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 9:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new q(strH, strH2, bArrC, hVar, gVar, iVar, eVar, strH3, strH4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
