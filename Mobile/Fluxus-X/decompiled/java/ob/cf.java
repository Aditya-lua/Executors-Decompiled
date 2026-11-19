package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class cf implements Parcelable.Creator {
    public static void a(bf bfVar, Parcel parcel, int i10) {
        int i11 = bfVar.f27126f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.v(parcel, 2, bfVar.f27127g, false);
        p9.c.r(parcel, 3, bfVar.f27128h);
        p9.c.s(parcel, 4, bfVar.f27129i, false);
        p9.c.l(parcel, 5, null, false);
        p9.c.v(parcel, 6, bfVar.f27130j, false);
        p9.c.v(parcel, 7, bfVar.f27131k, false);
        p9.c.j(parcel, 8, bfVar.f27132l, false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        Long lZ = null;
        Float fT = null;
        String strH2 = null;
        String strH3 = null;
        Double dR = null;
        long jY = 0;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 2:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 3:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 4:
                    lZ = p9.b.z(parcel, iU);
                    break;
                case 5:
                    fT = p9.b.t(parcel, iU);
                    break;
                case 6:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 7:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 8:
                    dR = p9.b.r(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new bf(iW, strH, jY, lZ, fT, strH2, strH3, dR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new bf[i10];
    }
}
