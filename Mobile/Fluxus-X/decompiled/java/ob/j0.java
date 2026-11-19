package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    public static void a(i0 i0Var, Parcel parcel, int i10) {
        String str = i0Var.f27456f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, str, false);
        p9.c.t(parcel, 3, i0Var.f27457g, i10, false);
        p9.c.v(parcel, 4, i0Var.f27458h, false);
        p9.c.r(parcel, 5, i0Var.f27459i);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        long jY = 0;
        String strH = null;
        g0 g0Var = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                g0Var = (g0) p9.b.g(parcel, iU, g0.CREATOR);
            } else if (iN == 4) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                jY = p9.b.y(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new i0(strH, g0Var, strH2, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i0[i10];
    }
}
