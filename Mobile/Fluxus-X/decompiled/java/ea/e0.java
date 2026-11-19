package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    public static void a(d0 d0Var, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, d0Var.c0());
        p9.c.v(parcel, 2, d0Var.zza(), false);
        p9.c.v(parcel, 3, d0Var.zzb(), false);
        p9.c.v(parcel, 4, d0Var.zzc(), false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        int iW = 0;
        String strH3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                strH3 = p9.b.h(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                strH2 = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new d0(iW, strH, strH3, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
